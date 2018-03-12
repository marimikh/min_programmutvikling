package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Player {
    public static double x, y, startX, startY, sizeX, sizeY; // locations

    public Player(double x, double y) {
        //
        this.x = x;
        this.y = y;
        this.startX = x;
        this.startY = y;
        sizeX = 25;
        sizeY = sizeX;

    }

    public void draw(GraphicsContext gc) {
        //
        gc.setFill(Color.BLACK);
        gc.fillRect(x-(sizeX/2),y-(sizeY/2),sizeX,sizeY);

    }

    public static void setStartPos(double newx, double newy)
    {
        // player-objektet sin start posisjon
        x = newx;
        y = newy;
        startX = x;
        startY = y;
    }

}
