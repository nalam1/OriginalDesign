import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size (800,800);
frameRate(600);

}
public void draw()
{

noStroke();

	fill(random(0,0),random(0,100),random(0,100));
	ellipse(400-mouseX,mouseY,random(9,10),random(9,10));
	ellipse(400+mouseX,mouseY,random(9,10),random(9,10));
	
	stroke(255, 255, 255, 100);
	fill(153,76,0);
	ellipse(400,400,50,650);
	ellipse(400,420,50,650);
	ellipse(400,440,50,650);
	ellipse(400,460,50,650);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
