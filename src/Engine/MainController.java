package Engine;

import GameObjects.*;
import PhysicsMovement.GetCollision;
import PhysicsMovement.MovementHandler;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;

import RestOfGame.*;
import Mapping.mappingNode;




public class MainController implements Initializable, EventHandler<KeyEvent> {
    public static Player mainPlayer;
    public static BackgroundGraphics backgroundArt;
    private Timeline timeline; // hovedklasse for å muliggjøre animasjon
    //public static GameObjects.Enemy[] enemyList = new GameObjects.Enemy[5];

    @FXML
    Canvas graphics;

    //Initialize som starter alt
    public void initialize(java.net.URL location, java.util.ResourceBundle resources) {

        mainPlayer = new Player(50, 50);
        backgroundArt = new BackgroundGraphics(0,0, 64, 64);

        //Maploader har en funksjon for hvert level med hardcode for hva som skal være i
        MapLoader.loadMap1();

        draw();

        //Starte timer klasse. Den har en "handle" funksjon som du må override.
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
            }
        };
        timer.start();

    }

    @FXML
    public void handle(KeyEvent event) {
        System.out.println(event.getCode().toString());
        //mainPlayer.moveAnywhere(event);
        MoveInput.moveAnywhere(event);
    }

    // ========   Update funksjonen som blir kjørt i handle loopen ==============
    private void update() {

        MovementHandler.handleMovement();
        draw();

        //collision stygg kode
        for (int i= 0; i <EnemyHandler.GetEnemyListCount(); i++) {
            if (GetCollision.checkCollisionPlayerEnemy(mainPlayer, EnemyHandler.enemyList[i])) {
                System.out.println("AAAAA");
                MapLoader.loadMap1();
            }
        }
    }


    // DRAW, clearer canvas og tegner en player
    private void draw() {
        GraphicsContext gc = graphics.getGraphicsContext2D();
        gc.clearRect(0, 0, graphics.widthProperty().doubleValue(), graphics.heightProperty().doubleValue());

        //Draw player & enemies
        backgroundArt.draw(gc);
        mainPlayer.draw(gc);
        EnemyHandler.EnemyListDraw(gc);
        WallHandler.wallListDraw(gc);
        PickUpsHandler.pickUpListDraw(gc);

    }




    @FXML
    public void exitEvent(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    public void moveEvent(ActionEvent event) {
        MoveInput.moveUp();
    }
    @FXML
    public void moveDownEvent(ActionEvent event) {
        MoveInput.moveDown();
    }
    @FXML
    public void moveLeftEvent(ActionEvent event) {
        MoveInput.moveLeft();
    }
    @FXML
    public void moveRightEvent(ActionEvent event) {
        MoveInput.moveRight();
    }

}
