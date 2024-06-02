
package desktop_app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;


public class Pane_cover extends javax.swing.JDialog {


    public Pane_cover(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    setUndecorated(true);
    setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    initComponents();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(screenSize.width, screenSize.height);
    setLocationRelativeTo(null); // Center the frame to screen

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optpane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout optpaneLayout = new javax.swing.GroupLayout(optpane);
        optpane.setLayout(optpaneLayout);
        optpaneLayout.setHorizontalGroup(
            optpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        optpaneLayout.setVerticalGroup(
            optpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(optpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 480, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel optpane;
    // End of variables declaration//GEN-END:variables
}
