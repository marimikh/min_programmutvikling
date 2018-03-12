package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PickUps {
    public double x, y, sizeX, sizeY;
    public PickUps(double x, double y) {
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

        gc.setFill(Color.YELLOW);
        gc.fillRect(x-(sizeX/2),y-(sizeY/2),sizeX,sizeY);

    }
}
