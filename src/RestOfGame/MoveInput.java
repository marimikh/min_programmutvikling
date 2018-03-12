package RestOfGame;

import Engine.MainController;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class MoveInput{
    //boolske variabler
    public static boolean Up, Left, Down, Right;


    public static void moveAnywhere(KeyEvent event) {
        // Kode som jobber med all input
        if (event.getCode().toString() == "W" || event.getCode() == KeyCode.UP) {
            moveUp();

            Up = true;
            Left = false;
            Down = false;
            Right = false;
        }

        if (event.getCode().toString() == "A" || event.getCode() == KeyCode.LEFT) {
            moveLeft();

            Up = false;
            Left = true;
            Down = false;
            Right = false;
        }

        if (event.getCode().toString() == "S" || event.getCode() == KeyCode.DOWN) {
            moveDown();

            Up = false;
            Left = false;
            Down = true;
            Right = false;
        }

        if (event.getCode().toString() == "D" || event.getCode() == KeyCode.RIGHT) {
            moveRight();

            Up = false;
            Left = false;
            Down = false;
            Right = true;
        }
    }

    // Funksjoner som jobber med all bevegelse
    public static void moveUp() {
        MainController.mainPlayer.y -= 10;
    }

    public static void moveDown() {
        MainController.mainPlayer.y += 10;

    }

    public static void moveLeft() {
        MainController.mainPlayer.x -=10;
    }
    public static void moveRight() {
        MainController.mainPlayer.x +=10;
    }

}
