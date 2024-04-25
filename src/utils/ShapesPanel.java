package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ShapesPanel extends JPanel {
   
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Rechteck zeichnen
        Rectangle rectangle = new Rectangle(50, 50, 100, 100); // Position und Größe des Rechtecks
        g2d.setColor(Color.RED); // Farbe des Rechtecks
        g2d.fill(rectangle); // Rechteck zeichnen

        // Dreieck zeichnen
        int[] xPoints = {210, 260, 160}; // X-Koordinaten
        int[] yPoints = {50, 150, 150};  // Y-Koordinaten
        Polygon triangle = new Polygon(xPoints, yPoints, 3); // Dreieck erstellen
        g2d.setColor(Color.GREEN); // Farbe des Dreiecks
        g2d.fill(triangle); // Dreieck zeichnen

        // Kreis zeichnen
        Ellipse2D circle = new Ellipse2D.Double(50, 200, 100, 100); // Position und Größe des Kreises
        g2d.setColor(Color.BLUE); // Farbe des Kreises
        g2d.fill(circle); // Kreis zeichnen

        // Vieleck (Fünfeck) zeichnen
        int[] xPointsPentagon = {180, 170, 190, 210, 200}; // X-Koordinaten
        int[] yPointsPentagon = {170, 210, 230, 220, 170}; // Y-Koordinaten
        Polygon pentagon = new Polygon(xPointsPentagon, yPointsPentagon, 5); // Vieleck (Fünfeck) erstellen
        g2d.setColor(Color.ORANGE); // Farbe des Vielecks
        g2d.fill(pentagon); // Vieleck (Fünfeck) zeichnen
    }
}
