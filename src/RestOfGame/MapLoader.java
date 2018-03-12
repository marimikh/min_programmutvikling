package RestOfGame;

import Engine.MainController;
import GameObjects.EnemyHandler;
import GameObjects.PickUpsHandler;
import GameObjects.WallHandler;



public class MapLoader {

    public static void loadMap1() {

        MainController.mainPlayer.setStartPos(50,50);

        EnemyHandler.createEnemyList(5);
        EnemyHandler.createEnemy(200,50);  //0
        EnemyHandler.createEnemy(200,200); //1
        EnemyHandler.createEnemy(250,100); //2
        EnemyHandler.createEnemy(100,200); //3
        EnemyHandler.createEnemy(400,400); //4

        //lager en serie array som blir brukt som kordinater for patruljering for enemies
        //annenhver verdi er x og y verdier
        //verdiene er enheter fra startpunktet til fienden

        int[] patrol0 = {0,50,0,-50,0,0};
        EnemyHandler.enemyList[0].setPatrolRoute(patrol0);
        int[] patrol1 = {50,0,0,50,0,0};
        EnemyHandler.enemyList[1].setPatrolRoute(patrol1);
        int[] patrol2 = {-50,0,50,0,0,0};
        EnemyHandler.enemyList[2].setPatrolRoute(patrol2);
        int[] patrol3 = {-50,50,0,0,0,0};
        EnemyHandler.enemyList[3].setPatrolRoute(patrol3);
        int[] patrol4 = {-50,-50,0,0,0,0};
        EnemyHandler.enemyList[4].setPatrolRoute(patrol4);



        WallHandler.createWallList(2);

        WallHandler.wallList[0].setStartPos(250, 250);
        WallHandler.wallList[1].setStartPos(250, 250+20);

        PickUpsHandler.createPickUpList(2);

        PickUpsHandler.pickUpList[0].setStartPos(300, 300);
        PickUpsHandler.pickUpList[1].setStartPos(300, 320);

        // create wallList1, wallList2 and so on?
        //

    }

}
