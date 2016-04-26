/*
 * File: Rainbow.java
 * ------------------
 * This program is a stub for the Rainbow problem, which displays
 * a rainbow by adding consecutively smaller circles to the canvas.
 */

//import javafx.scene.paint.Color;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Rainbow extends GraphicsProgram {

	public void run() {
		double width = getWidth(); 
		double height = getHeight(); 
		GOval oval = new GOval(72, 72); 
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		add(oval);
		oval.setLocation(width/2-36, height/2-36); 
		GOval oval21 = new GOval(46.8, 46.8); 
		oval21.setFilled(true);
		oval21.setFillColor(Color.WHITE);
		add(oval21);
		oval21.setLocation(width/2-23.4, height/2-23.4); 
		GOval oval1 = new GOval(21.6, 21.6); 
		oval1.setFilled(true);
		oval1.setFillColor(Color.RED);
		add(oval1);
		oval1.setLocation(width/2-10.8, height/2-10.8); 


	}


}
