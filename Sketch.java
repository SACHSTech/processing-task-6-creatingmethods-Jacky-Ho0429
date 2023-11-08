import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawHouse(25, 290, 255,255,255);
    drawHouse(40, 290, 255, 255,255);
  }
  
  /**
   * 
   * @param x1 Base top left corner x-coordinate
   * @param y1 Base top left corner x-coordinate
   * @param red Percentage of red color for fill
   * @param green Percentage of green color for fill
   * @param blue Percentage of blue color for fill
   */
  public void drawHouse(int x1, int y1, int red, int green, int blue) {

    // Base
    stroke(0, 0, 0);
    fill(240, 250, 190);
    rect(x1, y1, 120, 100);

    // Roof
    stroke(red, green, blue);
    fill(210, 100, 75);
    triangle(0, 290, 170, 290, 85, 215);
  
    // Window
    stroke(255, 255, 255);
    fill(140, 220, 240);
    rect(50, 325, 30, 30);
    line(65, 325, 65, 355);
    line(50, 340, 80, 340);
  
    // Door
    stroke(0, 0, 0);
    fill(170, 105, 50);
    rect(97, 340, 25, 50);
    stroke(255, 140, 105);
    fill(255, 140, 105);
    ellipse(115, 365, 3, 3);
  }
}