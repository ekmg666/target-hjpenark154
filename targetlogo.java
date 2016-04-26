

/*
 * File: Rainbow.java
 * ------------------
 * This program is a stub for the Rainbow problem, which displays
 * a rainbow by adding consecutively smaller circles to the canvas.
 */

import acm.program.*;
import acm.graphics. *;
import java.awt.*;


public class Rainbow extends GraphicsProgram {

	public void run() {
		double width = getWidth();
		double height = getHeight();
		GOval redOval = new GOval(72, 72);
		redOval.setFilled(true);
		redOval.setFillColor(Color.RED);
		add(redOval);
		redOval.setLocation(width/2-36,height/2-36);
		GOval whiteOval = new GOval (46.8, 46.8);
		whiteOval.setFilled(true);
		whiteOval.setFillColor(Color.WHITE);
		add(whiteOval);
		whiteOval.setLocation(width/2-23.4,height/2-23.4);
		GOval smolOval = new GOval (21.6,21.6);
		smolOval.setFilled(true);
		smolOval.setFillColor(Color.RED);
		add(smolOval);
		smolOval.setLocation(width/2-10.8,height/2-10.8);
	}
}