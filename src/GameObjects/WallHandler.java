package GameObjects;

import javafx.scene.canvas.GraphicsContext;


    public class WallHandler {


        public static Wall[] wallList;
        private static int wallCount;

        public static void createWallList (int x) {
            // create x enemies
            wallList = new Wall[x];
            wallCount = x;
            for (int i = 0; i < x; i++) {
                int newX = 500-(i*100); // - ???????????????
                wallList[i] = new Wall(newX,i*100);
            }
        }

        public static void wallListDraw(GraphicsContext gc) {
            //loop gjennom og si at alle skal move
            for (int i = 0; i < 2; i++) {
                wallList[i].draw(gc);
            }
        }

    }
