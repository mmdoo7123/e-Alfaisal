package UserInterface.Notes;

import static UserInterface.Notes.NotesController.note;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class NewNote extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JLabel NewDateLabel;
    private javax.swing.JLabel NewTitleLabel;
    private javax.swing.JLabel NoteLabel;
    private javax.swing.JTextField NoteTextField;
    private javax.swing.JButton OkayNoteButton;
    private javax.swing.JTextField TitleTextField;
    // End of variables declaration//GEN-END:variables

    public NewNote() {
        initComponents();
          this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    NewNote(java.awt.List NotesList) {
        UserInterface.Notes.NotesController.add(note, NotesList);
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
            java.util.logging.Logger.getLogger(NewNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewNote().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewTitleLabel = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        NewDateLabel = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        NoteLabel = new javax.swing.JLabel();
        OkayNoteButton = new javax.swing.JButton();
        NoteTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NewTitleLabel.setText("New Title:");

        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });

        NewDateLabel.setText("New Date:");

        DateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTextFieldActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });

        NoteLabel.setText("Note:");

        OkayNoteButton.setText("OK");
        OkayNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkayNoteButtonMouseClicked(evt);
            }
        });

        NoteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoteTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NewTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(NoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OkayNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NoteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkayNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTextFieldActionPerformed

    private void DateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTextFieldActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked

        if (Controllers.Dialogues.yesNoMessage("Are you sure you want to cancel this note")) {
            this.setVisible(false);
            JFrame frame = new Notes();
            frame.setVisible(true);
        }//GEN-LAST:event_BackButtonMouseClicked
    }

    private void OkayNoteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkayNoteButtonMouseClicked
     // retrieve the input from the title, date and body text fields
    String title = TitleTextField.getText();
    String dateStr = DateTextField.getText();
    String body = NoteTextField.getText();
    
    // check if the title input is empty or null
    if (title == null || title.equals("")) {
        // output a dialogue message if the title input is empty or null
        Controllers.Dialogues.showMessage("Please put a title for your new note");
        // give focus to the title text field
        TitleTextField.requestFocus();
        // return to stop further execution
        return;
    }
    // check if the date input is empty or null
    if (dateStr == null || dateStr.equals("")) {
        // output a dialogue message if the date input is empty or null
        Controllers.Dialogues.showMessage("Please put a date for your new note");
        // give focus to the date text field
        DateTextField.requestFocus();
        // return to stop further execution
        return;
    }
    // check if the body input is empty or null
    if (body == null || body.equals("")) {
        // output a dialogue message if the body input is empty or null
        Controllers.Dialogues.showMessage("Please please fill in your new note");
        // give focus to the body text field
        NoteTextField.requestFocus();
        // return to stop further execution
    } else {
        // convert the date string to a java.util.Date object
        java.util.Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (ParseException ex) {
            Logger.getLogger(NewNote.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (date == null) {
            // output a dialogue message if the date string cannot be parsed
            Controllers.Dialogues.showMessage("Please enter a valid date (yyyy-mm-dd) for your new note");
            // give focus to the date text field
            DateTextField.requestFocus();
            // return to stop further execution
        }
        else{
        // Check if a meeting has already been scheduled for the same user on the selected date
            Connection connection;
            try {
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
                    String sql = "SELECT * FROM scheduling.studentnotes WHERE studentid = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            String userID = DataStructures.UserSession.getUserID();
            statement.setString(1, userID);
            ResultSet result = statement.executeQuery();


            // Store the note in the database
            String sql1 = "INSERT INTO scheduling.studentnotes (studentid, notetitle, Date, notebody) VALUES (?, ?, ?, ?)";
            PreparedStatement statement1 = connection.prepareStatement(sql1);

            // Set the values for the placeholder parameters in the SQL statement
            statement1.setString(1, userID);
            statement1.setString(2, title);
            statement1.setDate(3, new java.sql.Date(date.getTime()));
            statement1.setString(4, body);

            // Execute the SQL statement
            statement1.executeUpdate();
            Notes frame = new Notes();
            frame.setVisible(true);
                this.dispose();
            
            } catch (SQLException ex) {
            Controllers.Dialogues.showMessage("Error occured while creating note");
            }
    }//GEN-LAST:event_OkayNoteButtonMouseClicked
   }      
 }
    private void NoteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoteTextFieldActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    LocalDate today = LocalDate.now();
    String todayStr = today.toString();
    DateTextField.setText(todayStr);
    }//GEN-LAST:event_formWindowOpened

}