/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desktop_app;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author agustin
 */
public class Log_in extends javax.swing.JFrame {

    /**
     * Creates new form Log_in
     */
    public Log_in() {
        setUndecorated(true);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
        setLocationRelativeTo(null); //Center the frame to screen

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        close_btn = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        mid_panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pup_icon = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        sign_in_btn = new com.k33ptoo.components.KButton();
        pass_view = new javax.swing.JLabel();
        Pw_secured_field = new javax.swing.JPasswordField();
        Schl_ID_field = new javax.swing.JTextField();
        subtitle1 = new javax.swing.JLabel();
        input_design = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        mid_design = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Access");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setOpaque(false);
        main_panel.setLayout(null);

        close_btn.setBorder(null);
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/close.png"))); // NOI18N
        close_btn.setToolTipText("close");
        close_btn.setAlignmentY(0.0F);
        close_btn.setBorderPainted(false);
        close_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_btn.setkAllowGradient(false);
        close_btn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        close_btn.setkHoverColor(new java.awt.Color(153, 153, 153));
        close_btn.setkPressedColor(new java.awt.Color(255, 51, 0));
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        main_panel.add(close_btn);
        close_btn.setBounds(1020, 40, 20, 20);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        main_panel.add(jPanel1);
        jPanel1.setBounds(20, 30, 970, 40);

        mid_panel.setBackground(new java.awt.Color(255, 255, 255));
        mid_panel.setOpaque(false);
        mid_panel.setLayout(null);

        Title.setFont(new java.awt.Font("Product Sans", 1, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(3, 9, 11));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Admin Access");
        mid_panel.add(Title);
        Title.setBounds(180, 150, 200, 37);

        pup_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pup_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/pup_50x50.png.png"))); // NOI18N
        mid_panel.add(pup_icon);
        pup_icon.setBounds(260, 90, 50, 58);

        footer.setBackground(new java.awt.Color(102, 102, 102));
        footer.setFont(new java.awt.Font("Product Sans", 1, 10)); // NOI18N
        footer.setForeground(new java.awt.Color(204, 204, 204));
        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("Polytechnic University of the Philippines - San Juan Campus");
        footer.setToolTipText("");
        mid_panel.add(footer);
        footer.setBounds(80, 430, 410, 20);

        sign_in_btn.setBorder(null);
        sign_in_btn.setText("Sign In");
        sign_in_btn.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        sign_in_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sign_in_btn.setkAllowGradient(false);
        sign_in_btn.setkBackGroundColor(new java.awt.Color(17, 149, 230));
        sign_in_btn.setkHoverColor(new java.awt.Color(204, 204, 255));
        sign_in_btn.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        sign_in_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_btnActionPerformed(evt);
            }
        });
        mid_panel.add(sign_in_btn);
        sign_in_btn.setBounds(140, 370, 290, 40);

        pass_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/eye.png"))); // NOI18N
        pass_view.setToolTipText("show");
        pass_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pass_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_viewMouseClicked(evt);
            }
        });
        mid_panel.add(pass_view);
        pass_view.setBounds(400, 320, 20, 20);

        Pw_secured_field.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        Pw_secured_field.setForeground(new java.awt.Color(204, 204, 204));
        Pw_secured_field.setText("Your password");
        Pw_secured_field.setBorder(null);
        Pw_secured_field.setEchoChar('\u0000');
        Pw_secured_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pw_secured_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pw_secured_fieldFocusLost(evt);
            }
        });
        Pw_secured_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pw_secured_fieldActionPerformed(evt);
            }
        });
        Pw_secured_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pw_secured_fieldKeyTyped(evt);
            }
        });
        mid_panel.add(Pw_secured_field);
        Pw_secured_field.setBounds(180, 320, 210, 20);

        Schl_ID_field.setBackground(new java.awt.Color(255, 255, 255));
        Schl_ID_field.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        Schl_ID_field.setForeground(new java.awt.Color(204, 204, 204));
        Schl_ID_field.setText("Your school id number");
        Schl_ID_field.setBorder(null);
        Schl_ID_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Schl_ID_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Schl_ID_fieldFocusLost(evt);
            }
        });
        Schl_ID_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Schl_ID_fieldMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Schl_ID_fieldMouseExited(evt);
            }
        });
        Schl_ID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Schl_ID_fieldActionPerformed(evt);
            }
        });
        mid_panel.add(Schl_ID_field);
        Schl_ID_field.setBounds(180, 250, 240, 20);

        subtitle1.setBackground(new java.awt.Color(102, 102, 102));
        subtitle1.setFont(new java.awt.Font("Product Sans", 0, 11)); // NOI18N
        subtitle1.setForeground(new java.awt.Color(17, 149, 230));
        subtitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle1.setText("Forgot password");
        subtitle1.setToolTipText("");
        subtitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtitle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subtitle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subtitle1MouseExited(evt);
            }
        });
        mid_panel.add(subtitle1);
        subtitle1.setBounds(332, 287, 110, 20);

        input_design.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        input_design.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/Labels.png"))); // NOI18N
        mid_panel.add(input_design);
        input_design.setBounds(100, 180, 370, 210);

        subtitle.setBackground(new java.awt.Color(102, 102, 102));
        subtitle.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        subtitle.setForeground(new java.awt.Color(153, 153, 153));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle.setText("Welcome back! Please enter you details.");
        subtitle.setToolTipText("");
        mid_panel.add(subtitle);
        subtitle.setBounds(140, 180, 290, 20);

        mid_design.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/mid_panel.png"))); // NOI18N
        mid_panel.add(mid_design);
        mid_design.setBounds(30, 40, 500, 448);

        main_panel.add(mid_panel);
        mid_panel.setBounds(250, 30, 560, 540);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/main_design.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        main_panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 600);
        main_panel.add(jPanel2);
        jPanel2.setBounds(30, 30, 1000, 540);

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void sign_in_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_btnActionPerformed
        System.out.println("Username: " + Schl_ID_field.getText());
        System.out.println("Password: " + Pw_secured_field.getText());
        admin_check();


    }//GEN-LAST:event_sign_in_btnActionPerformed

    private void Schl_ID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Schl_ID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Schl_ID_fieldActionPerformed

    private void Schl_ID_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schl_ID_fieldMouseClicked

    }//GEN-LAST:event_Schl_ID_fieldMouseClicked

    private void Schl_ID_fieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schl_ID_fieldMouseExited

    }//GEN-LAST:event_Schl_ID_fieldMouseExited

    private void Schl_ID_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Schl_ID_fieldFocusGained
        if (Schl_ID_field.getText().equals("Your school id number")) {
            Schl_ID_field.setText("");
            Schl_ID_field.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Schl_ID_fieldFocusGained

    private void Schl_ID_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Schl_ID_fieldFocusLost
        if (Schl_ID_field.getText().isEmpty()) {
            Schl_ID_field.setText("Your school id number");
            Schl_ID_field.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_Schl_ID_fieldFocusLost

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        dispose(); // Close the frame
        System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

    private void Pw_secured_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pw_secured_fieldKeyTyped
        if (Pw_secured_field.getText().equals("Your password")) {
            Pw_secured_field.setText("");
            Pw_secured_field.setForeground(Color.BLACK); // Set text color to black when the user starts typing
        }
    }//GEN-LAST:event_Pw_secured_fieldKeyTyped

    private void Pw_secured_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pw_secured_fieldFocusLost
        if (Pw_secured_field.getPassword().length == 0) {
            Pw_secured_field.setText("Your password");
            Pw_secured_field.setForeground(Color.GRAY); // Optional: Set text color to gray when placeholder text is restored
            togglePasswordVisibility(); // Hide the password when focus is lost
        }

    }//GEN-LAST:event_Pw_secured_fieldFocusLost

    private void Pw_secured_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pw_secured_fieldFocusGained
        if (Pw_secured_field.getText().equals("Your password")) {
            Pw_secured_field.setText(null);
            Pw_secured_field.setEchoChar('*');
            Pw_secured_field.setForeground(Color.BLACK); // Optional: Set text color to black when focused
            // togglePasswordVisibility(); // Show the password when focused
        }
    }//GEN-LAST:event_Pw_secured_fieldFocusGained

    private void Pw_secured_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pw_secured_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pw_secured_fieldActionPerformed

    private void subtitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseEntered
        subtitle1.setForeground(new Color(164, 186, 189));

    }//GEN-LAST:event_subtitle1MouseEntered

    private void subtitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseExited
        subtitle1.setForeground(new Color(17, 149, 230));

    }//GEN-LAST:event_subtitle1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void pass_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_viewMouseClicked
        togglePasswordVisibility();
    }//GEN-LAST:event_pass_viewMouseClicked

    private void subtitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseClicked
        Forgot_pwrd frame = new Forgot_pwrd();
        frame.setVisible(true);
     
       
    }//GEN-LAST:event_subtitle1MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
          
    }//GEN-LAST:event_formMouseEntered

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
           Log_in fr1 = new Log_in();
        Forgot_pwrd fr2 = new Forgot_pwrd();
        fr1.setOpacity(0.5f);
        fr2.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
          Log_in fr1 = new Log_in();
        fr1.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusLost

    //custom functions
    private void togglePasswordVisibility() {
        if (isPasswordVisible) {
            Pw_secured_field.setEchoChar('\u2022'); // Echo character for hiding password
            pass_view.setIcon(new ImageIcon(getClass().getResource("/desktop_app/assets/eye.png")));
            pass_view.setToolTipText("show");
        } else {
            Pw_secured_field.setEchoChar((char) 0); // Echo character for showing password
            pass_view.setIcon(new ImageIcon(getClass().getResource("/desktop_app/assets/view.png")));
            pass_view.setToolTipText("hide");
        }
        isPasswordVisible = !isPasswordVisible; // Toggle the state
    }

    public void admin_check() {
        PreparedStatement ps;
        ResultSet rs;

        String schoolId = Schl_ID_field.getText().trim();
        String password;
        password = new String(Pw_secured_field.getPassword()).trim();

        String query = "SELECT * FROM admin_data WHERE user_id = ? AND pass = ?";
        
        try {
            ps = Db_con.getConnection().prepareStatement(query);
            ps.setString(1, schoolId);
            ps.setString(2, password);

            rs = ps.executeQuery();

            // Check if the ResultSet contains any rows
            if (rs.next()) {
                // User exists
                JOptionPane.showMessageDialog(null, "WELCOME ADMIN!");
            } else {
                // User does not exist
                JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS");
            }

            // Close ResultSet, PreparedStatement, and Connection
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            // Handle SQL exceptions
            ex.printStackTrace();
        }
    }

    /**
     * \
     *
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
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Log_in logInFrame = new Log_in();
                logInFrame.setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pw_secured_field;
    private javax.swing.JTextField Schl_ID_field;
    private javax.swing.JLabel Title;
    private com.k33ptoo.components.KButton close_btn;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel input_design;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel mid_design;
    private javax.swing.JPanel mid_panel;
    private javax.swing.JLabel pass_view;
    private javax.swing.JLabel pup_icon;
    private com.k33ptoo.components.KButton sign_in_btn;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel subtitle1;
    // End of variables declaration//GEN-END:variables

    //custom declarations
    int posX, posY;
    private boolean isEyeIcon = true;
    private boolean isPasswordVisible = false;

}
