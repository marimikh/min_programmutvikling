package RestOfGame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BackgroundGraphics {
    public double x, y; // locations
    Image bg; //bakgrunnsbildet
    public int tileWidth, tileHeight; //lengden og bredden til bakgrunssbildet


    public BackgroundGraphics (double x, double y, int tileWidth, int tileHeight) {
        this.x = x;
        this.y = y;

        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;

        //henter bakgrunnsbildet
        bg = new Image("./Images/background_grass.png");

    }

   public void draw(GraphicsContext gc) {
        //få høyden og bredden til hele canvaset/vinduet
       double canSizeH = gc.getCanvas().getHeight();
       double canSizeW = gc.getCanvas().getWidth();

       //printer ut bildet langs x/y-aksen
       for(int i = 0; i < canSizeW/tileWidth; i++){
           for(int j = 0; j < canSizeH/tileHeight; j++){
               gc.drawImage(bg, i*tileWidth, j*tileHeight, tileWidth,tileHeight);
           }
       }

    }
}
