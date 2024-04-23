package UserInterface.Meetings;

import UserInterface.MainMenuUI;

import javax.swing.*;

public class MeetingsUI extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel MeetingsMenuLabel;
    private javax.swing.JButton NewMeetingButton;
    private javax.swing.JButton UpcomingMeetingsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;

    public MeetingsUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MeetingsMenuLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NewMeetingButton = new javax.swing.JButton();
        UpcomingMeetingsButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MeetingsMenuLabel.setFont(new java.awt.Font("Tiger", 1, 36)); // NOI18N
        MeetingsMenuLabel.setText("Meetings Menu");

        jButton1.setFont(new java.awt.Font("Tiger", 1, 12)); // NOI18N
        jButton1.setText("Past meetings");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PastMeetingsClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NewMeetingButton.setFont(new java.awt.Font("Tiger", 1, 12)); // NOI18N
        NewMeetingButton.setText("New Meeting");
        NewMeetingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMeetingClicked(evt);
            }
        });
        NewMeetingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMeetingButtonActionPerformed(evt);
            }
        });

        UpcomingMeetingsButton.setText("Upcoming meetings");
        UpcomingMeetingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpcomingMeetingsClicked(evt);
            }
        });
        UpcomingMeetingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpcomingMeetingsButtonActionPerformed(evt);
            }
        });

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MeetingsMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(NewMeetingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(UpcomingMeetingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MeetingsMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UpcomingMeetingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewMeetingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewMeetingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMeetingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewMeetingButtonActionPerformed

    private void UpcomingMeetingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpcomingMeetingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpcomingMeetingsButtonActionPerformed

    private void NewMeetingClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMeetingClicked
        JFrame frame = new NewMeeting();
        frame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_NewMeetingClicked

    private void UpcomingMeetingsClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpcomingMeetingsClicked
        JFrame frame = new UpcomingMeetings();
        frame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_UpcomingMeetingsClicked

    private void PastMeetingsClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PastMeetingsClicked
        JFrame frame = new ViewPastMeetings();
        frame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_PastMeetingsClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        JFrame frame = new MainMenuUI();
        frame.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackButtonMouseClicked
    // End of variables declaration//GEN-END:variables
}