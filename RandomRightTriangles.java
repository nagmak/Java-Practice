//RandomRightTriangles
//500 triangles must be same size + shape
// random colors
// choose 1 random x and y value for 1 vertex, compute positions of other two vertices based on it

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.Polygon;

public class RandomRightTriangles extends Canvas{

	public void paint(Graphics g){
		for (int i = 0; i<=500; i++){
			Random r = new Random();
			int rR = r.nextInt(255);
			int rG = r.nextInt(255);
			int rB = r.nextInt(255);
			int x = 10 + r.nextInt(760);
			int y = 10 + r.nextInt(540);
			int varysize = 30 + r.nextInt(90); //varies their sizes

			Polygon tri = new Polygon();
			tri.addPoint(x, y);
			tri.addPoint(x, y + varysize);
			tri.addPoint(x + varysize, y + varysize);

			Color randColor = new Color(rR, rG, rB);
			g.setColor(randColor);
			g.fillPolygon(tri);
		}
	}

	public static void main(String[] args){
		JFrame win = new JFrame("Random Right Triangles");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomRightTriangles canvas = new RandomRightTriangles();
		win.add(canvas);
		win.setVisible(true);

	}
}

// extra credit - make isoceles triangles