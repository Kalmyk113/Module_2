import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GRoundRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class UMLClassRelationship extends GraphicsProgram {

    public void run(){
        //Aggregation Suitcase
        GRoundRect suitCase = new GRoundRect(0,0,200,150,50);
        suitCase.setFilled(true);
        suitCase.setFillColor(Color.gray);
        add(suitCase,50,50);

        for(int i=0; i<2; i++){
            GRect caseStripe = new GRect(25,150);
            caseStripe.setFilled(true);
            caseStripe.setFillColor(Color.black);
            add(caseStripe, 100+(75*i),50);
        }

        GImage pencil = new GImage("assets/pencilclipart.png");
        pencil.scale(0.1);
        add(pencil,25,300);

        GImage paper = new GImage("assets/papersclipart.png");
        paper.scale(0.05);
        add(paper,125,300);
        //Composition Eye Glasses
    }
    public static void main (String [] args){
        (new UMLClassRelationship()).start(args);
    }
}
