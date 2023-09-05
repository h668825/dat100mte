package dat100.hvl.no;

import easygraphics.*;

public class FranskFlagg extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    makeWindow("Det tyske flagget");

    //lag fargelinjene
    setColor(0, 0, 0); // svart
    fillRectangle(50, 50, 300, 66);
    setColor(255, 0, 0); // raud
    fillRectangle(50, 116, 300, 67);
    setColor(255, 255, 0); // gul
    fillRectangle(50, 183, 300, 67);
    
    // lag ei svart ramme
    setColor(0, 0, 0);
    drawRectangle(50, 50, 300, 200);
  }

}