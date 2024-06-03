/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desktop_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Custom_animations {

    public static void animateFrame(javax.swing.JFrame frame, int animationDuration, int steps) {
        // Set initial opacity to 0 (fully transparent)
        frame.setOpacity(0);

        // Create a timer for the animation
        Timer timer = new Timer(animationDuration / steps, new ActionListener() {
            private int step = 0;

            public void actionPerformed(ActionEvent e) {
                float alpha = (float) step / steps;
                frame.setOpacity(alpha);
                step++;
                if (step > steps) {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        // Start the timer
        timer.start();
    }
}
