package AdminInterface;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfirmedMeetings extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackButton;
    private java.awt.List UpcomingMeetingsList;
    private javax.swing.JLabel jLabel1;

    /**
     * Creates new form ConfirmedMeetings
     */
    public ConfirmedMeetings() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfirmedMeetings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmedMeetings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmedMeetings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmedMeetings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmedMeetings().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UpcomingMeetingsList = new java.awt.List();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Here is a list of all your upcoming meetings");

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(UpcomingMeetingsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpcomingMeetingsList, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This function receives an instance of a List object as an argument and is declared to throw a SQLException.
    public void PopulateList(java.awt.List UpcomingMeetingsList) throws SQLException {
//    The function first initializes Connection, PreparedStatement, and ResultSet objects to null.
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String todaysDate = "2023-08-17";
        try {
//Create a connection to a PostgreSQL database with a URL, username, and password.
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            LocalDate currentDate = LocalDate.now();
/* After that, the function creates an SQL query to retrieve the name
 and meeting date of students who have a status of 2 and a meeting date later than the current date.
Then, the function prepares the SQL statement with the query and sets the parameter value to the current date.   */
            String sql = "select name, meetingdate from scheduling.studentmeetings join scheduling.scheduling_users on scheduling_users.id = studentmeetings.studentid where status = 2 AND meetingdate > ?";
            statement = connection.prepareStatement(sql);
            statement.setDate(1, java.sql.Date.valueOf(currentDate));
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Date date = resultSet.getDate("meetingdate");
                String name = resultSet.getString("name");
                UpcomingMeetingsList.add(name + " " + date);

            }

        } catch (SQLException ex) {
            Controllers.Dialogues.showMessage("Error occured while trying to open the window");
        }
    }

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        JFrame frame = new AdminMeetings();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonMouseClicked

    /*    The function calls the PopulateList function with an instance of the UpcomingMeetingsList
        object as an argument. If an exception is caught, it logs the error message.  */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            PopulateList(UpcomingMeetingsList);
        } catch (SQLException ex) {
            Controllers.Dialogues.showMessage("Error occured while trying to open the window");
        }

    }//GEN-LAST:event_formWindowOpened
    // End of variables declaration                   
}
