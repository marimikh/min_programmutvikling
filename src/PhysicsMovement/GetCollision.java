package PhysicsMovement;

import GameObjects.Enemy;
import GameObjects.Player;

public class GetCollision {
    public double playerX, playerY, targetX, targetY;

    public void getPosisions() {

    }


    //shitty placeholder funksjon. Skriv om

    /*
    public static boolean checkCollision(double px, double py, double tx, double ty) {
        px = px+12.5;
        py = py+12.5;
        tx = tx+6.25;
        ty = ty+6.25;

        if ((tx-px < 18.75) && (ty-py < 18.75) && (px-tx <18.75) && (py-ty <18.75)) {
            return true;
        } else {
            return false;
        }
    }*/

    public static boolean checkCollisionPlayerEnemy(Player player, Enemy enemy) {
        double distance = Math.hypot(player.x-enemy.x, player.y-enemy.y);
        double hitDistance = (player.sizeX + enemy.sizeX)/2;
        if ( distance < hitDistance) {
            return true;
        } else {
            return false;
        }


    }


}
