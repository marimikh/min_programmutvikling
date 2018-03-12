package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Enemy {
    public double x, y, startX, startY, sizeX, sizeY, moveSpeed;
    private int[] patrolRoute = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int t = 0;

    public Enemy(double x, double y) {
        this.x = x;
        this.y = y;
        this.startX = x;
        this.startY = y;
        sizeX = 12.5;
        sizeY = sizeX;
        moveSpeed = 2;


    }

    public void enemyRandomMove() {
        double randomX = (Math.random()*2)-1;
        double randomY = (Math.random()*2)-1;
        this.x = x+randomX;
        this.y = y+randomY;

    }

    public void setStartPos(double x, double y) {
        this.x = x;
        this.y = y;
        this.startX = x;
        this.startY = y;
    }

    public void setPatrolRoute(int[] newPatrolRoule) {
        int i = 0;
        for (int spot : newPatrolRoule) {
            patrolRoute[i] = spot;
            i++;
        }

    }

    public void EnemyMoveToPoint(){
        if (this.x < startX+patrolRoute[t]-moveSpeed)  {
            this.x += moveSpeed;
        } else if (this.x > startX+patrolRoute[t]+moveSpeed)  {
            this.x -= moveSpeed;
        } else if (this.y < startY+patrolRoute[t+1]-moveSpeed) {
            this.y += moveSpeed;
        } else if (this.y > startY+patrolRoute[t+1]+moveSpeed) {
            this.y -= moveSpeed;
        } else if (t < 18){
            this.x = startX+patrolRoute[t];
            this.y = startY+patrolRoute[t+1];
            t += 2;
        } else {
            this.x = startX+patrolRoute[t];
            this.y = startY+patrolRoute[t+1];
            t = 0;
        }
    }

    public void draw(GraphicsContext gc) {

        gc.setFill(Color.RED);
        gc.fillRect(x-(sizeX/2),y-(sizeY/2),sizeX,sizeY);
    }
}