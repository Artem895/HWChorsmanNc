package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;

public class Chessboard  extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane=new BorderPane();
        King king=new King("Black");
        Queen queen=new Queen("Black");
        Knight knight=new Knight("black",'l');
        Bishop bishop=new Bishop("black",'l');
        Rook rook =new Rook("Black",'l');
        Pawn pawn=new Pawn("black",3);
        Group group=new Group();
        Image myimage=new Image(new FileInputStream("src/ChorsmanHomeWork/ChHW3/Ch9/progprojects/ChessBoard.jpg"));
        Image myimage1=new Image(new FileInputStream("src/ChorsmanHomeWork/ChHW3/Ch9/progprojects/img_2.png"));
        ImageView board = new ImageView(myimage);
        ChessPice cp=new ChessPice();
        board.setFitWidth(800);
        board.setFitHeight(800);
        /*pawn1.setFitWidth(80);
        pawn1.setFitHeight(80);
        pawn1.relocate(50,50);
        pawn1.setOnMouseEntered(mouseEvent -> { pawn1.relocate(50,140);});*/
        Pane pane=new Pane();
        pane.getChildren().add(board);
        cp.creatWteam(pane);
        Scene scene = new Scene(pane, 800, 900);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
