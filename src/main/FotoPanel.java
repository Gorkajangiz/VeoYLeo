package main;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class FotoPanel extends JPanel {

    private String ruta;

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g2D);
        g2D.setPaint(Color.BLACK);
        g2D.draw(new Rectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1));
        Image photoImage = new ImageIcon(this.ruta).getImage();
        int w = getWidth();
        int h = getHeight();
        double rWidth = (double) getWidth() / (double) photoImage.getWidth(null);
        double rHeight = (double) getHeight() / (double) photoImage.getHeight(null);
        if (rWidth > rHeight) {
            w = (int) (photoImage.getWidth(null) * rHeight);
        } else {
            h = (int) (photoImage.getHeight(null) * rWidth);
        }
        g2D.drawImage(photoImage, (int) (0.5 * (getWidth() - w)), (int) (0.5 * (getHeight()
                - h)), w, h, null);
        g2D.dispose();
    }
}