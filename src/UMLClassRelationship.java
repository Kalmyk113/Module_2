import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class UMLClassRelationship extends GraphicsProgram {

    private int div_thick = 5;

    public void run(){

        //divide
        GRect divide = new GRect(getCanvasWidth()/2-div_thick,0,div_thick*2,getCanvasHeight());
        divide.setFillColor(Color.black);
        divide.setFilled(true);
        add(divide);

        //Aggregation Suitcase
        GRoundRect suitCase = new GRoundRect(0,0,200,150,50);
        suitCase.setFilled(true);
        suitCase.setFillColor(new Color(153,76,0));
        add(suitCase,75,50);

        for(int i=0; i<2; i++){
            GRect caseStripe = new GRect(25,150);
            caseStripe.setFilled(true);
            caseStripe.setFillColor(Color.black);
            add(caseStripe, 125+(75*i),50);
        }

        GImage pencil = new GImage("pencilclipart.png");
        pencil.scale(0.1);
        add(pencil,25,300);

        GImage paper = new GImage("papersclipart.png");
        paper.scale(0.1);
        add(paper,125,300);

        GImage nb = new GImage("nbclipart.png");
        nb.scale(0.2);
        add(nb,225,300);

        //Composition Eye Glasses
        GImage glasses = new GImage("glassesclipart.png");
        glasses.scale(0.1);
        add(glasses,getCanvasWidth()-glasses.getWidth()-50,60);

        GImage frame = new GImage("frameclipart.png");
        frame.scale(0.02);
        add(frame,getCanvasWidth()-frame.getWidth()-150,300);

        GOval lens = new GOval(80,50);
        lens.setFillColor(Color.cyan);
        lens.setFilled(true);
        add(lens,getCanvasWidth()-100,300);

        //Labels
        GLabel bcaselabel = new GLabel("(Aggregation) Briefcase");
        bcaselabel.setFont("times new roman-32");
        add(bcaselabel,getCanvasWidth()/4-bcaselabel.getWidth()/2,25);

        GLabel glasseslabel = new GLabel("(Composition) Glasses");
        glasseslabel.setFont("times new roman-32");
        add(glasseslabel,3*getCanvasWidth()/4-glasseslabel.getWidth()/2,25);

        GLabel bcaseexplain = new GLabel("A briefcase is still a briefcase even without its contents");
        bcaseexplain.setFont("times new roman-15");
        add(bcaseexplain,getCanvasWidth()/4-bcaseexplain.getWidth()/2,225);

        GLabel glassexplain = new GLabel("You can't have glasses without lens and a frame");
        glassexplain.setFont("times new roman-15");
        add(glassexplain,3*getCanvasWidth()/4-glassexplain.getWidth()/2,225);

        setBackground(Color.lightGray);
    }
    public static void main (String [] args){
        (new UMLClassRelationship()).start(args);
    }
}
