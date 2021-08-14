/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.swing.ImageIcon;

/**
 *
 * @author Adnan & Arman
 */
public class miniShutWid extends javax.swing.JFrame {
    
    // mouse drag
    int mouseX;
    int mouseY;
    // screen pos
    int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2+150;

    public miniShutWid(int x , int y) {
        initComponents();
        
        // position
        this.setLocation(x,y);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMini.png")));
        
    }  
    /**
     * Creates new form miniShutWid
     */
    public miniShutWid() {
        initComponents();
        
        // position
        this.setLocation(wid, 0);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMini.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shut_ = new javax.swing.JLabel();
        restart_ = new javax.swing.JLabel();
        cancel_ = new javax.swing.JLabel();
        expand_ = new javax.swing.JLabel();
        quit_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shut_.setToolTipText("Shut Sown");
        shut_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shut_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shut_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shut_MouseReleased(evt);
            }
        });
        getContentPane().add(shut_, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 7, 21, 21));

        restart_.setToolTipText("Restart");
        restart_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restart_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                restart_MouseReleased(evt);
            }
        });
        getContentPane().add(restart_, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 7, 21, 21));

        cancel_.setToolTipText("Cancel Command");
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancel_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancel_MouseReleased(evt);
            }
        });
        getContentPane().add(cancel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 7, 20, 21));

        expand_.setToolTipText("Maximize");
        expand_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expand_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                expand_MouseReleased(evt);
            }
        });
        getContentPane().add(expand_, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 7, 23, 23));

        quit_.setToolTipText("Quit");
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quit_MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quit_MouseReleased(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 7, 23, 22));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/miniFrameEX1.png"))); // NOI18N
        drag_.setToolTipText("");
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
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quit_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseReleased
        // TODO add your handling code here:
        ImageIcon pressedQuit = new ImageIcon(getClass().getResource("miniFrameMini.png")); drag_.setIcon(pressedQuit); 
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

    private void cancel_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_MouseReleased
        // cancelling code here:
        ImageIcon pressedQuit = new ImageIcon(getClass().getResource("miniFrameMini.png")); drag_.setIcon(pressedQuit); 
        
        reusablePanel pm = new reusablePanel();
        pm.cancelShutRes();
    }//GEN-LAST:event_cancel_MouseReleased

    private void restart_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restart_MouseReleased
        // restart code here:
        ImageIcon pressedQuit = new ImageIcon(getClass().getResource("miniFrameMini.png")); drag_.setIcon(pressedQuit); 
        
        reusablePanel pm = new reusablePanel();
        pm.restartPC();
    }//GEN-LAST:event_restart_MouseReleased

    private void shut_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shut_MouseReleased
        // shutDown code here:
        ImageIcon pressedQuit = new ImageIcon(getClass().getResource("miniFrameMini.png")); drag_.setIcon(pressedQuit); 
        reusablePanel pm = new reusablePanel();
        pm.shutPC();
    }//GEN-LAST:event_shut_MouseReleased

    private void expand_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expand_MouseReleased
        // expanding code here:
        int nx = (int) getLocation().getX();
        int ny = (int) getLocation().getY();
        this.dispose();
        
        login log = new login(nx,ny);
        log.setVisible(true);
 

        
    }//GEN-LAST:event_expand_MouseReleased

    
    private void shut_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shut_MousePressed
        // TODO add your handling code here:
        //ImageIcon pressedShut = new ImageIcon(getClass().getResource("/demo/miniFrameGlow_12")); drag_.setIcon(pressedShut); 
    }//GEN-LAST:event_shut_MousePressed

    private void restart_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restart_MousePressed
        // TODO add your handling code here:
        //ImageIcon pressedRes = new ImageIcon(getClass().getResource("/demo/miniFrameGlow_22")); drag_.setIcon(pressedRes); 
    }//GEN-LAST:event_restart_MousePressed

    private void cancel_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_MousePressed
        // TODO add your handling code here:
        //ImageIcon pressedCan = new ImageIcon(getClass().getResource("/demo/miniFrameGlow_32.png")); drag_.setIcon(pressedCan); 
    }//GEN-LAST:event_cancel_MousePressed
    
    private void quit_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MousePressed
        // TODO add your handling code here:
        //ImageIcon pressedQuit = new ImageIcon(getClass().getResource("/dmeo/miniFrameGlow_52")); drag_.setIcon(pressedQuit); 
    }//GEN-LAST:event_quit_MousePressed
    
    
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
            java.util.logging.Logger.getLogger(miniShutWid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miniShutWid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miniShutWid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miniShutWid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ///////////////////////////////////////////////////////////////////////
                try{
                    Thread.sleep(5500);
                }
                catch(Exception e){}
                ////////////////////////////////////////////////////////////////////////
                
                new miniShutWid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel expand_;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel restart_;
    private javax.swing.JLabel shut_;
    // End of variables declaration//GEN-END:variables
}
