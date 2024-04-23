package Controllers;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dialogues {

    public static void main(String[] args) {

    }

    // Displays a message dialog box with the specified message.
    public static void showMessage(String message) {
        String title = "Message";
        JLabel label = new JLabel("<html><div style='text-align: center;'>" + message + "</div></html>");
        label.setFont(new Font("Verdana", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel panel = new JPanel();
        panel.setBackground(new Color(104, 151, 187));
        panel.add(label);
        int messageType = JOptionPane.PLAIN_MESSAGE;
        JOptionPane.showMessageDialog(null, panel, title, messageType);
    }

    //Displays a confirmation dialog box with the specified
    public static boolean yesNoMessage(String message) {
        String title = "Confirmation";
        JLabel label = new JLabel("<html><div style='text-align: center;'>" + message + "</div></html>");
        label.setFont(new Font("Verdana", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel panel = new JPanel();
        panel.setBackground(new Color(104, 151, 187));
        panel.add(label);
        int messageType = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, panel, title, messageType);
        return result == JOptionPane.YES_OPTION;
    }

    /*Displays an input dialog box with the specified message and an input text field.
    Returns the text entered by the user if the user clicks "OK", and null if the user clicks "Cancel" */
    public static String InputMessage(String message) {
        String title = "Input";
        JLabel label = new JLabel("<html><div style='text-align: center;'>" + message + "</div></html>");
        label.setFont(new Font("Verdana", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JTextField textField = new JTextField();
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(104, 151, 187));
        panel.add(label, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        int messageType = JOptionPane.OK_CANCEL_OPTION;
        int result = JOptionPane.showConfirmDialog(null, panel, title, messageType);
        if (result == JOptionPane.OK_OPTION) {
            return textField.getText();
        }
        return null;
    }

    //Displays an option dialog box with the specified message and options.
    public static String showOptions(String message, Object[] options) {
        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);
        panel.add(label);

        int result = JOptionPane.showOptionDialog(null, panel, null,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);

        if (result >= 0) {
            return options[result].toString();
        } else {
            return null;
        }
    }

    //Displays a message dialog box with the specified message and title.
    public static void showMessage(String message, String title) {
        JLabel label = new JLabel(message);
        label.setFont(new Font("Verdana", Font.PLAIN, 16));
        label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JPanel panel = new JPanel();
        panel.add(label);
        int messageType = JOptionPane.PLAIN_MESSAGE;
        JOptionPane.showMessageDialog(null, panel, title, messageType);
    }

    //Displays an assignment dialog box with the specified title, deadline, and description.
    public static void displayAssignment(String title, String deadline, String description) {
        String message = "<html><div style='text-align: left;'>"
                + "date: " + new SimpleDateFormat("MM/dd/yyyy").format(new Date()) + "<br>"
                + "deadline: " + deadline + "<br><br>"
                + "description: " + description
                + "</div></html>";
        showMessage(message, title);
    }

    public void DisplayNote(String title, String date, String body, java.awt.List NotesList) {
        String userID = DataStructures.UserSession.getUserID();
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            // Step 1: Connect to the Postgresql database using JDBC driver
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

            // Prepare the SQL query to retrieve the note details
            String sql = "SELECT date, notebody FROM scheduling.studentnotes WHERE studentid = ? AND date = ? AND notetitle = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userID);
            statement.setDate(2, java.sql.Date.valueOf(date));
            statement.setString(3, title);

            // Execute the query and retrieve the results
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Set the note body to the retrieved value
                body = resultSet.getString("notebody");
            }

            // Display the note details in a JOptionPane
            String message = "Title: " + title + "\nDate: " + date + "\nBody:\n" + body;
            JOptionPane.showMessageDialog(null, message, "Note Details", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            Controllers.Dialogues.showMessage("Error displaying note");
        } finally {
            try {
                // Close the result set and database connection
                if (resultSet != null) {
                    resultSet.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}