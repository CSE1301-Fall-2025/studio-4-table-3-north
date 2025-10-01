package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0,104,71);
		StdDraw.filledRectangle(0.166, 0.5,0.166, 0.5);

		StdDraw.setPenColor(255, 255, 255);
        StdDraw.filledRectangle(0.5, 0.5, 0.166, 0.5);

		StdDraw.setPenColor(206,17,38);
		StdDraw.filledRectangle(0.834, 0.5,0.166, 0.5);

		StdDraw.setPenColor(139,69,19);
		StdDraw.filledCircle(0.5, 0.5, 0.08);

		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.arc(0.5, 0.48, .09, 190.0, 350.0 );

		
	}
}