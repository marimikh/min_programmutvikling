package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wall {

    public double x, y, sizeX, sizeY;
    public Wall(double x, double y) {
        this.x = x;
        this.y = y;
        sizeX = 21;
        sizeY = sizeX;
    }


    public void setStartPos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(GraphicsContext gc) {

        gc.setFill(Color.GRAY);
        gc.fillRect(x-(sizeX/2),y-(sizeY/2),sizeX,sizeY);

    }
}
