package desktop_app;

import javax.swing.*;
import java.awt.*;

public class RoundPanel extends JPanel {
    private int cornerRadius;

    public RoundPanel(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        setOpaque(false); // Allows background color to be visible within the rounded corners
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        graphics.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200); // You can adjust the preferred size as needed
    }
}
