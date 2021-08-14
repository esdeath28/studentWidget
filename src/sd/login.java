/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnan & Arman
 */
public class login extends javax.swing.JFrame {
    
    //mouse drag
    int mouseX;
    int mouseY;
    // screen pos
    int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2+150;
    
    public login(int x , int y) {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMini.png")));
        
        // position
        this.setLocation(x,y);
        
        //opaque error
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        mail_.setBackground(new java.awt.Color(255,255,255,0));
        
    }    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMini.png")));
        
        //opaque error
        pass_.setBackground(new java.awt.Color(255,255,255,0));
        mail_.setBackground(new java.awt.Color(255,255,255,0));
        
        // position
        this.setLocation(wid, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass_ = new javax.swing.JPasswordField();
        mail_ = new javax.swing.JTextField();
        signUp_ = new javax.swing.JLabel();
        OK_ = new javax.swing.JLabel();
        shut_ = new javax.swing.JLabel();
        restart_ = new javax.swing.JLabel();
        cancel_ = new javax.swing.JLabel();
        expand_ = new javax.swing.JLabel();
        quit_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass_.setText("password");
        pass_.setBorder(null);
        pass_.setOpaque(false);
        pass_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pass_MouseReleased(evt);
            }
        });
        getContentPane().add(pass_, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 149, 145, 23));

        mail_.setText("email@gmail.com");
        mail_.setToolTipText("do not use the email in the demo");
        mail_.setBorder(null);
        mail_.setOpaque(false);
        mail_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mail_MouseReleased(evt);
            }
        });
        getContentPane().add(mail_, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 103, 150, 24));

        signUp_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUp_MouseReleased(evt);
            }
        });
        getContentPane().add(signUp_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 228, 60, 19));

        OK_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OK_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OK_MouseReleased(evt);
            }
        });
        getContentPane().add(OK_, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 203, 57, 15));

        shut_.setToolTipText("Shut Down");
        shut_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shut_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shut_MouseReleased(evt);
            }
        });
        getContentPane().add(shut_, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 5, 23, 23));

        restart_.setToolTipText("Restart");
        restart_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                restart_MouseReleased(evt);
            }
        });
        getContentPane().add(restart_, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 23, 23));

        cancel_.setToolTipText("Cancel");
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancel_MouseReleased(evt);
            }
        });
        getContentPane().add(cancel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 5, 23, 23));

        expand_.setToolTipText("Minimize");
        expand_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expand_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                expand_MouseReleased(evt);
            }
        });
        getContentPane().add(expand_, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 5, 23, 23));

        quit_.setToolTipText("Quit");
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quit_MouseReleased(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 5, 23, 23));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/loginFrameLastEX.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 253));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quit_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quit_MouseReleased

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed
    
    private void expand_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expand_MouseReleased
        // disposing expanding code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();
        this.dispose();
        miniShutWid sht = new miniShutWid(nx,ny);
        sht.setVisible(true);
    }//GEN-LAST:event_expand_MouseReleased

    private void cancel_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_MouseReleased
        // cancelling code here:
        reusablePanel pm = new reusablePanel();
        pm.cancelShutRes();
    }//GEN-LAST:event_cancel_MouseReleased

    private void restart_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restart_MouseReleased
        // restart code here:
        reusablePanel pm = new reusablePanel();
        pm.restartPC();
    }//GEN-LAST:event_restart_MouseReleased

    private void shut_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shut_MouseReleased
        // shutDown code here:
        reusablePanel pm = new reusablePanel();
        pm.shutPC();
    }//GEN-LAST:event_shut_MouseReleased

    private void OK_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OK_MouseReleased

        String pass = String.valueOf(pass_.getPassword());
        String mail = mail_.getText();
        
        // db statement and result
        PreparedStatement st;
        PreparedStatement st2;
        ResultSet rs, rs2;
        
        // compares if its demo pass or not then throws pop up
        if(mail.equals("") ||  pass.length()==0 || mail.equals("email@gmail.com") || pass.equals("password")){
            popLogEmpty p4 = new popLogEmpty();
            p4.setVisible(true);
        }
        
        // main part
        else{
            // create a select query to check if user and pass exist in db
            String query = "SELECT * FROM `users` WHERE `user`= ? AND `password` = ? ";
            String query2 = "SELECT * FROM `users` WHERE `email`= ? AND `password`=? ";
            
            try {
                st = JDBC_con.getconnection().prepareStatement(query);
                
                //int type parameter index and string
                st.setString(1, mail);
                st.setString(2, pass);
                
               
                
                st2 = JDBC_con.getconnection().prepareStatement(query2);
                st2.setString(1, mail);
                st2.setString(2, pass);
                
                rs = st.executeQuery();  
                rs2 = st2.executeQuery();  
                
                if ( rs2.next()){
                    String pr2 = rs2.getString("profession");
                    this.dispose();
                    
                    if ( pr2.equalsIgnoreCase("general")){
                        mainExtension mn = new mainExtension();
                        mn.setVisible(true);
                    }
                    
                    else if( pr2.equalsIgnoreCase("doctor")){
                        docFrame mn = new docFrame();
                        mn.setVisible(true);
                    }
                    
                    else if ( pr2.equalsIgnoreCase("engineer")){
                        cseFrame mn = new cseFrame();
                        mn.setVisible(true);
                    }
                    /////////////////////////////////////////////old///////////////////////////////////////////////
                }
                
                else if (rs.next() ){
                    String pr = rs.getString("profession");
                    this.dispose();
                    
                    if (pr.equalsIgnoreCase("general") ){
                        mainExtension mn = new mainExtension();
                        mn.setVisible(true);
                    }
                    
                    else if(pr.equalsIgnoreCase("doctor") ){
                        docFrame mn = new docFrame();
                        mn.setVisible(true);
                    }
                    
                    else if (pr.equalsIgnoreCase("engineer") ){
                        cseFrame mn = new cseFrame();
                        mn.setVisible(true);
                    }
                    /////////////////////////////////////////////old///////////////////////////////////////////////
                }
                
                
                else {
                    popLogIncorrect p1 = new popLogIncorrect();
                    p1.setVisible(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_OK_MouseReleased

    private void signUp_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUp_MouseReleased
        // disposes login, sends cords to signup for later, pops up signup
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();
        this.dispose();
        signUp signup = new signUp(nx,ny);
        signup.setVisible(true);
    }//GEN-LAST:event_signUp_MouseReleased

    private void mail_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mail_MouseReleased
        // clears box if its hint mail     
        if (mail_.getText().equals("email@gmail.com")){
            mail_.setText("");   
        } 
    }//GEN-LAST:event_mail_MouseReleased

    private void pass_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_MouseReleased
        // gets the value of password to string type as pass_ is in char
        String pass = String.valueOf(pass_.getPassword());
        // compares if its demo pass or not then makes it invisible
        if (pass.equals("password")){
            pass_.setText("");
        }
        
    }//GEN-LAST:event_pass_MouseReleased

    /**
     * @param args the command line arguments
     */
    /**/
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OK_;
    private javax.swing.JLabel cancel_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel expand_;
    private javax.swing.JTextField mail_;
    private javax.swing.JPasswordField pass_;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel restart_;
    private javax.swing.JLabel shut_;
    private javax.swing.JLabel signUp_;
    // End of variables declaration//GEN-END:variables
}
