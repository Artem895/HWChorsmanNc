package ChorsmanHomeWork.ChHW2.Chapter2;

import ChorsmanHomeWork.ChHW2.Chapter2.Car;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CarMove extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            Group group = new Group();
            Line asfalt = new Line();
            Rectangle ground = new Rectangle();
            Text text = new Text();
            Text mills = new Text();
            Car car = creatmap(group, asfalt, ground, text, mills);
            Scene scene = new Scene(group, 300, 400);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent keyEvent) {
                    if (keyEvent.getCode().equals(KeyCode.D)) {
                        if (car.getLevelofFuel() > 0 && car.getLevelofFuel() - car.getConsumption() > 0) {
                            car.movcar();
                            changetext(car, text, mills);
                        }
                        if (isequal(scene.getWidth(), car.getX())) {
                            finishtext(car, text, mills);
                        }
                    } else if (keyEvent.getCode().equals(KeyCode.F)) {
                        car.zapravka(1);
                        changetext(car, text, mills);
                    }
                }

            });

            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static boolean isequal(double x,double y){
        return x-y<=0.000000001;
    }
    public static Car creatmap(Group group,Line asfalt,Rectangle ground,Text text,Text mills) throws FileNotFoundException {
        Car car=new Car(100,3,"Hel");
        asfalt.setStartX(0);
        asfalt.setStartY(300);
        asfalt.setEndX(300);
        asfalt.setEndY(300);
        ground.setX(0);
        ground.setY(300);
        ground.setHeight(299);
        ground.setWidth(300);
        text.setX(20);
        text.setY(20);
        text.setText(car.getLevelofFuel()+"/"+car.getMaxvoluem()+"л "+"- уровень топлива"+"  (F)");
        mills.setX(20);
        mills.setY(40);
        mills.setText(car.zapashoda()+"миль  "+"- можно пройти ");
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
        return car;
    }
    private static void changetext(Car car,Text text,Text mills){
        text.setText(car.getLevelofFuel()+"/"+car.getMaxvoluem()+"л "+"- уровень топлива"+"  (F)");
        mills.setText(car.zapashoda()+"миль  "+"- можно пройти ");
    }
    private static void finishtext(Car car,Text text,Text mills){
        text.setText("FINISH");
        mills.setText("");
        car.setX(-15);
    }
}

