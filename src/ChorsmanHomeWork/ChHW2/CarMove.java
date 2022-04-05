package ChorsmanHomeWork.ChHW2;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Collection;

public class CarMove extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group=new Group();
        Car car=new Car(100,3,"Hel");
        Line asfalt=new Line(0,300,300,300);
        Rectangle ground =new Rectangle(0,299,300,400);
        Text text=new Text(20,20,String.valueOf(car.getLevelofFuel())+"л "+"- уровень топлива"+"  (F)");
        Text mills=new Text(20,40,String.valueOf(car.getLevelofFuel()/ car.getConsumption())+"миль  "+"- можно пройти ");
        text.setSelectionFill(Color.BLACK);
        mills.setSelectionFill(Color.BLACK);

        ground.setFill(Color.GREEN);
        asfalt.setStroke(Color.GRAY);
        asfalt.setStrokeWidth(20);
        group.getChildren().add(car);
        group.getChildren().add(asfalt);
        group.getChildren().add(ground);
        group.getChildren().add(text);
        group.getChildren().add(mills);

        Scene scene = new Scene(group, 300, 400);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode().equals(KeyCode.D)) {
                    if (car.getLevelofFuel() > 0&&car.getLevelofFuel()-car.getConsumption()>0) {
                        car.movcar();
                        text.setText(String.valueOf(car.getLevelofFuel())+"л "+"- уровень топлива"+"  (F)");
                        mills.setText(String.valueOf(car.getLevelofFuel()/ car.getConsumption())+"миль  "+"- можно пройти ");
                        System.out.println(car.getLevelofFuel() + "d");
                    }
                    if(car.getX()==scene.getWidth()){
                        System.out.println("Finish");
                        text.setText("FINISH");
                        mills.setText("");
                    }
                }
                else if(keyEvent.getCode().equals(KeyCode.F)) {
                    car.zapravka(5);
                    text.setText(String.valueOf(car.getLevelofFuel())+"л "+"- уровень топлива"+"  (F)");
                    mills.setText(String.valueOf(car.getLevelofFuel()/ car.getConsumption())+"миль  "+"- можно пройти ");
                    System.out.println(car.getLevelofFuel() + "f");
                }
                }

        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }



}

