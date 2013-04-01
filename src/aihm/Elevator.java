package aihm;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Elevator extends JPanel{

	int sizeElevX=50;
	int sizeElevY=100;
	double pourcentage = 50.0;
	
	public void paintComponent(Graphics g){
		
		double width = this.getWidth();
		double height = this.getHeight();
		double positionX = (width-sizeElevX)/2;
		double mult = (1-(pourcentage/100));
		double positionY = (height-sizeElevY)*mult;	
		
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, (int)width, (int)height);
		g.setColor(Color.RED);
	    g.fillRect((int)positionX, (int)positionY, this.sizeElevX, this.sizeElevY);
	    g.setColor(Color.WHITE);
	    g.drawString(""+this.pourcentage+" %", (int)positionX+5, (int)positionY+15);
	    g.setColor(Color.BLACK);
	    g.drawLine((int)positionX-2, 0, (int)positionX-2, (int)height);
	    g.drawLine((int)positionX+sizeElevX+1, 0, (int)positionX+sizeElevX+1, (int)height);
	}
	
	public void setPourcentage(double d){
		this.pourcentage = d;
	}
}
