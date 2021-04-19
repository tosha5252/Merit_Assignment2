package week2;

import acm.program.GraphicsProgram;
import acm.graphics.GOval;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {

private RandomGenerator rgen = RandomGenerator.getInstance();

int numCircles = 10; 
int radMin = 5;
int radMax = 50;

public void run() {
for (int i = 0; i < numCircles; i++) {
int n = rgen.nextInt(radMin, radMax);
int x = rgen.nextInt(0, getWidth() - 2 * n);
int y = rgen.nextInt(0, getHeight() - 2 * n);
GOval circle = new GOval(x, y, 2 * n, 2 * n);
circle.setFilled(true);
circle.setColor(rgen.nextColor());
add(circle);
     	}
   }
}
