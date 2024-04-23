package UserInterface;

import UserInterface.Assignments.AssignmentStudents;
import UserInterface.Meetings.MeetingsUI;
import UserInterface.Notes.Notes;

import javax.swing.*;
import java.sql.*;

public class MainMenuUI extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignmentsButton;
    private javax.swing.JButton LibraryButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MeetingsButton;
    private javax.swing.JButton NotesButton;
    private javax.swing.JLabel WelcomeLabel;

    /**
     * Creates new form MainMenuUI
     */
    public MainMenuUI() {
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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
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

        WelcomeLabel = new javax.swing.JLabel();
        MeetingsButton = new javax.swing.JButton();
        AssignmentsButton = new javax.swing.JButton();
        LibraryButton = new javax.swing.JButton();
        NotesButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Tiger", 1, 24)); // NOI18N

        MeetingsButton.setText("Meetings");
        MeetingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeetingsButtonMouseClicked(evt);
            }
        });

        AssignmentsButton.setText("Assignments");
        AssignmentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssignmentsButtonMouseClicked(evt);
            }
        });

        LibraryButton.setText("Library");
        LibraryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibraryButtonMouseClicked(evt);
            }
        });

        NotesButton.setText("Notes");
        NotesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotesButtonMouseClicked(evt);
            }
        });

        LogoutButton.setText("Log out");
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(MeetingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(AssignmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(NotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(LibraryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MeetingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AssignmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LibraryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MeetingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeetingsButtonMouseClicked
        JFrame frame = new MeetingsUI();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_MeetingsButtonMouseClicked

    private void AssignmentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssignmentsButtonMouseClicked
        JFrame frame = new AssignmentStudents();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_AssignmentsButtonMouseClicked

    private void NotesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotesButtonMouseClicked
        JFrame frame = new Notes();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NotesButtonMouseClicked

    private void LibraryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryButtonMouseClicked
        JFrame frame = new LibraryUI();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LibraryButtonMouseClicked

    //method that is called upon when the window is opened, it connect to the database and grabs the name corresponding to the id that is being used to log in
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

            String sql = "SELECT name FROM scheduling.scheduling_users WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            String userID = DataStructures.UserSession.getUserID();
            statement.setString(1, userID);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                String name = result.getString("name");
                WelcomeLabel.setText("Welcome " + name + " to e-Alfaisal");
            } else {
                WelcomeLabel.setText("Welcome to e-Alfaisal");
            }
        } catch (SQLException ex) {
            Controllers.Dialogues.showMessage("Error displaying MainMenu");
        }
    }//GEN-LAST:event_formWindowOpened

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        JFrame frame = new LogInUI();
        frame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_LogoutButtonMouseClicked
    // End of variables declaration//GEN-END:variables
}