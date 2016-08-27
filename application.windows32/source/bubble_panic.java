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

public class bubble_panic extends PApplet {

public void setup()
{
  
  background(255);
}

float x = 400;
float y = 300;
float r = 50;

public void draw()
{
  fill(255, 5);
  noStroke();
  rect(0, 0, 800, 600);
  fill(random(0, 255), random(0, 255), random(0, 255));
  ellipse(x, y, r, r);
  x = random(0, 800);
  y = random(0, 600);
  r = random(0, 100);
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "bubble_panic" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
