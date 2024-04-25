package utils;

import java.awt.Dimension;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import form.EForm;
import form.Rechteck;

public class GUI {
	
	/*public static void main(String[] args) {
		JFrame frame = new JFrame("Das berühren der Figüren mit den Pfoten ist verboten");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 400));		
		frame.add(createRectangle());
		frame.setVisible(true);
	}
	
	private static JPanel createRectangle() {
		try {
			Rechteck rechteck = (Rechteck)FormFactory.createForm(EForm.RECHTECK);
			RectanglePanel rectPane =new RectanglePanel(50, 50, (int)rechteck.getBreite(), (int)rechteck.getLaenge());
			ShapesPanel shapesPanel = new ShapesPanel();
			shapesPanel.setSize(400, 400);
			rectPane.setSize(400, 400);
			return shapesPanel;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}*/
}
