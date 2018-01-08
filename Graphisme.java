package examen.revision;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Graphisme extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(Color.green);
		
		//the body
		g.fillRect(200, 200, 120, 120);
		//the head
		g.fillArc(200, 150, 120, 80, 0, 180);
		
		//the two lines above the head 
		g.drawLine(240, 165, 220,120);
		g.drawLine(270, 165, 290, 120);
		
		//legs 
		g.fillRoundRect(210, 310, 30, 60, 20, 20);
		g.fillRoundRect(280, 310, 30, 60, 20, 20);
		
		//hands
		
		g.fillRoundRect(160, 200, 30, 80, 20, 20);
		g.fillRoundRect(330, 200, 30, 80, 20, 20);
		
		
		//eyes
		g.setColor(Color.white);
		g.fillOval(225, 165, 10, 10);
		g.fillOval(275, 165, 10, 10);
		
		
		//text
		g.setColor(Color.black);
		g.setFont(new Font("Calibri", Font.BOLD, 30));
		g.drawString("ANDROID", 210, 400);
	}
	
	
	


}
