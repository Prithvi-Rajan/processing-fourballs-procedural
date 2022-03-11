import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {

    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public static final int WHITE = 255;
    public static final int BLACK = 0;
    float ball1X = 0;
    float ball2X = 0;
    float ball3X = 0;
    float ball4X = 0;

    public static void main(String[] args) {
        PApplet.main(new String[]{"FourBalls"});
    }


    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        fullScreen();
    }

    @Override
    public void setup() {
        background(WHITE);
        stroke(BLACK);
        strokeWeight(2);
        noFill();
    }

    @Override
    public void draw() {
        background(WHITE);
        drawBalls();
    }


    public void drawBalls() {
        final int RADIUS = 60;
        float padding = 2 * RADIUS;
        float ballHeight = (float) ((HEIGHT - padding) / 5);
        ellipse(ball1X, ballHeight * 1, RADIUS, RADIUS);
        ellipse(ball2X, ballHeight * 2, RADIUS, RADIUS);
        ellipse(ball3X, ballHeight * 3, RADIUS, RADIUS);
        ellipse(ball4X, ballHeight * 4, RADIUS, RADIUS);

        ball1X += 1;
        ball2X += 2;
        ball3X += 3;
        ball4X += 4;
    }
}


