package desktop_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Custom_animations {

    public static void fadeIn(javax.swing.JFrame frame, int animationDuration, int steps) {
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

    public static void fadeOut(javax.swing.JFrame frame, int animationDuration, int steps) {
        // Set initial opacity to 1 (fully opaque)
        frame.setOpacity(1);

        // Create a timer for the animation
        Timer timer = new Timer(animationDuration / steps, new ActionListener() {
            private int step = steps;

            public void actionPerformed(ActionEvent e) {
                float alpha = (float) step / steps;
                frame.setOpacity(alpha);
                step--;
                if (step < 0) {
                    ((Timer) e.getSource()).stop();
                    frame.dispose(); // Dispose the frame after fade out if needed
                }
            }
        });

        // Start the timer
        timer.start();
    }
}
