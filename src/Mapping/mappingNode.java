package Mapping;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class mappingNode {
    public int x, y;
    double sizeX = 10;
    double sizeY = 10;

    public mappingNode(int a, int b) {
        x = a;
        y = b;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLUE);
        gc.fillRect(x-(sizeX/2),y-(sizeY/2),sizeX,sizeY);
    }
}
