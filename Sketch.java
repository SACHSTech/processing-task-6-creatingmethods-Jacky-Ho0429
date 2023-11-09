import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(1000, 1000);
  }

  public void setup() {
   background(210, 255, 173);
  }

  // Colours of houses were chosen by ChatGPT & Kayden who no longer goes to St.Augustine
  public void draw() {

    // Rectangle used to make color picker clean
    fill(210, 255, 173);
    noStroke();
    rect(0,0,1000,1000);

    drawHouse(35, 100, 255, 0, 0);
    drawHouse(235, 100, 0, 128, 255);
    drawHouse(435, 100, 51, 204, 102);
    drawHouse(635, 100, 255, 153, 0);
    drawHouse(835, 100, 102, 0, 255);
    drawRoad(0, 225, 255);
    drawHouse(35, 290, 204, 51, 255);
    drawHouse(235, 290, 255, 102, 0);
    drawHouse(435, 290, 204, 204, 0);
    drawHouse(635, 290, 0, 255, 0);
    drawHouse(835, 290, 255, 51, 204);
    drawRoad(0, 400, 255);
    drawHouse(35, 480, 0, 51, 153);
    drawHouse(235, 480, 153, 102, 204);
    drawHouse(435, 480, 255, 51, 204);
    drawHouse(635, 480, 51, 255, 153);
    drawHouse(835, 480, 128, 64, 192);
    drawRoad(0, 600 ,255);
    
    // Draws a circle of the color on the pixel that is the parameter pixels to the right of the mouse
    int colorMouseParam = readColor(25);
    fill(colorMouseParam);
    stroke(0, 0, 0);
    if (mousePressed) {
      ellipse(mouseX, mouseY, 10, 10);
    }
  }
  
  /**
   * Draws a house
   * @param x1 Base top left corner x-coordinate
   * @param y1 Base top left corner x-coordinate
   * @param red Percentage of red color for Base
   * @param green Percentage of green color for Base
   * @param blue Percentage of blue color for Base
   */
  public void drawHouse(int x1, int y1, int red, int green, int blue) {

    // Base
    stroke(0, 0, 0);
    fill(red, green, blue);
    rect(x1, y1, 120, 100);

    // Roof
    stroke(0, 0, 00);
    fill(210, 100, 75);
    triangle(x1 - 25, y1, x1 + 145, y1, x1 + 60, y1 - 75);
  
    // Window
    stroke(255, 255, 255);
    fill(140, 220, 240);
    rect(x1 + 25, y1 + 35, 30, 30);
    line(x1 + 40, y1 + 35, x1 + 40, y1 + 65);
    line(x1 + 25, y1 + 50, x1 + 55, y1 + 50);
  
    // Door
    stroke(0, 0, 0);
    fill(170, 105, 50);
    rect(x1 + 72, y1 + 50, 25, 50);
    stroke(255, 140, 105);
    fill(255, 140, 105);
    ellipse(x1 + 90, y1 + 75, 3, 3);
  }

  /**
   * Draws a road
   * @param x1 Top left corner x-coordinate of road
   * @param y1 Top left corner y-coordinate of road
   * @param color The color of the stripes on the road
   */
  public void drawRoad (int x1, int y1, int color) {
    // Draws the road
    stroke(255,255,255);
    fill(83, 86, 91);
    rect(x1, y1, 1000, 75);
    
    // Draws the dotted lines in the center of road
    noStroke();
    fill(color, color, color);
    for (int count = 25; count < 1000; count+= 75) {
      rect(x1 + count, y1 + 32, 30, 10);
    }
  }

  /**
   * Checks the color of the pixel that is the param number to the right
   * @param the number of pixels to the right of the mouse
   * @return the color of mouse 10 pixels to the right if mouse is down else return a transparent color
   */
  public int readColor(int Pixels) {
    if (mousePressed) {
      // Get the color under the mouse
      return get(mouseX + Pixels, mouseY);
    } else {
      // Return a default color if the mouse is not pressed
      return color(0, 0, 0, 0);
    } 
  }
}