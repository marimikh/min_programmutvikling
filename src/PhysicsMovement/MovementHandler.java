package PhysicsMovement;

import GameObjects.EnemyHandler;

import static GameObjects.EnemyHandler.enemyList;

public class MovementHandler {

    //function for all enemy movement som blir kjørt i mainController Update() loop
    public static void handleMovement() {
        EnemyHandler.enemyMoveAll();
    }

    public static boolean attemptMove() {
        return true;
    }
}