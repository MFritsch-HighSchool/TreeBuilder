import apcslib.DrawingTool;

import java.awt.*;
import java.awt.geom.Point2D.Double;
import java.util.*;

public class TreeDrawer {
	// Randoms for the angle size for each branch off
	// Same recursive concept, length can be random too?
	// Just make sure they are all decreased by the same amt
	// If using randoms, you gotta balance it out so REGARDLESS OF CURRENT
	// DIRECTION it will turn the same degree
	DrawingTool pen;
	int turningAngle;
	boolean firstlevel = false;

	int red;
	int green;
	int blue;

	public void setupWorld() {
		pen = new DrawingTool();
	}

	public void drawTree(double length, int level, double x, double y, double angle, int color1, int color2,
			int color3) {
		if (firstlevel) {

			pen.move(x, y);
			pen.setDirection(angle);
		}
		pen.setColor(new Color(color1, color2, color3));
		pen.down();
		pen.move(length);
		if (level > 0) {
			Random r = new Random();
			if (level > 2) {
				red = r.nextInt(30) + 35;
				green = r.nextInt(55) + 200;
				blue = r.nextInt(30) + 14;
			} else if (level == 2) {
				red = 211;
				green = 165;
				blue = 0;
			}
			else{
				red = 110;
				green = 60;
				blue = 0;
			}

			// System.out.println("Red is "+red);
			// System.out.println("Green is "+green);
			// System.out.println("Blue is "+blue+"");

			firstlevel = false;
			Double pt = pen.getPosition();
			double ang = pen.getDirection();
			pen.turnRight(30);
			drawTree(length / 1.3, level - 1, pt.getX(), pt.getY(), ang, red, green, blue);
			pen.up();
			pen.move(pt.getX(), pt.getY());
			pen.setDirection(ang);
			pen.turnLeft(30);
			r = new Random();
			red = r.nextInt(20) + 45;
			green = r.nextInt(25) + 230;
			blue = r.nextInt(20) + 24;
			pen.down();
			drawTree(length / 1.3, level - 1, pt.getX(), pt.getY(), ang, red, green, blue);
		}

	}
}
