package GameObjects;

import javafx.scene.canvas.GraphicsContext;

public class PickUpsHandler {


    public static PickUps[] pickUpList;
    private static int pickUpCount;

    public static void createPickUpList (int x) {
        // create x enemies
        pickUpList = new PickUps[x];
        pickUpCount = x;
        for (int i = 0; i < x; i++) {
            int newX = 500-(i*100); // - ???????????????
            pickUpList[i] = new PickUps(newX,i*100);
        }
    }

    public static void pickUpListDraw(GraphicsContext gc) {
        //loop gjennom og si at alle skal move
        for (int i = 0; i < 2; i++) {
            pickUpList[i].draw(gc);
        }
    }
}
