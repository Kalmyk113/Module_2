import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;


public class PhFlag extends GraphicsProgram {

    public void run(){

        setCanvasSize(900,450);

        double width = getWidth();
        double height = getHeight();
        double star_size = width/18;

        //Red
        GRect red = new GRect(width,height);
        red.setFilled(true);
        red.setFillColor(Color.red);
        add(red);

        //Blue
        GRect blue = new GRect(width, height/2);
        blue.setFilled(true);
        blue.setFillColor(Color.blue);
        add(blue);

        //Triangle
        GPolygon white = new GPolygon();
        white.addVertex(0, 0);
        white.addVertex(width*(0.433), height/2);
        white.addVertex(0,height);
        white.setFilled(true);
        white.setFillColor(Color.white);
        add(white);

        //Star1
        GStar star1 = new GStar(star_size);
        star1.setFilled(true);
        star1.setFillColor(Color.yellow);
        add(star1, 0.087*(width)-(star_size),0.16*(height)-(star_size/2));

        //Star2
        GStar star2 = new GStar(star_size);
        star2.setFilled(true);
        star2.setFillColor(Color.yellow);
        add(star2, (width*0.433)-0.087*(width), height/2);

        //Star3
        GStar star3 = new GStar(star_size);
        star3.setFilled(true);
        star3.setFillColor(Color.yellow);
        add(star3, 0.087*(width)-(star_size), height-(0.16*height)+(star_size/2));

        //Rays
        for (int i = 0; i <= 7; i++ ){
            GPolygon ray = new GPolygon();
            ray.addVertex(-15,0);
            ray.addVertex(15,0);
            ray.addVertex(15,80);
            ray.addVertex(0,100);
            ray.addVertex(-15,80);
            ray.setFilled(true);
            ray.setFillColor(Color.yellow);
            ray.rotate(i*45);
            add(ray,0.143*width-(15/2),height/2);
        }

        //Sun
        GOval sun = new GOval(width/10, height/5);
        sun.setFilled(true);
        sun.setFillColor(Color.yellow);
        add(sun,0.15*width-(width/15), height/2-(height/10));

    }


    public static void main(String[] args){
        (new PhFlag()).start(args);
    }
}
