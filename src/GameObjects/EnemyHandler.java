package GameObjects;

import javafx.scene.canvas.GraphicsContext;

public class EnemyHandler {


    public static Enemy[] enemyList;
    private static int enemyCount;
    private static int enemyMaxCount;

    //Opprette listen for enemies
    public static void createEnemyList (int x) {
        enemyList = new Enemy[x];
        enemyMaxCount = x;
        enemyCount = 0;
    }

    //Oprette en enemy i enemy list
    public static void createEnemy(int x, int y) {
        enemyList[enemyCount] = new Enemy(x,y);
        enemyCount +=1;
    }

    //Loope igjennom alle enemies og tegne dem
    public static void EnemyListDraw(GraphicsContext gc) {
        for (int i = 0; i < enemyCount; i++) {
            enemyList[i].draw(gc);
        }
    }

    public static void enemyMoveAll() {
        for (int i = 0; i < enemyCount; i++) {
            enemyList[i].EnemyMoveToPoint();
        }
    }

    public static int GetEnemyListCount() {
        return enemyCount;
    }




}
