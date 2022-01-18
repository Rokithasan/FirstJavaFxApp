package firstjavafxapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import button for working with button
import javafx.scene.control.Button;

//import layout for button button
import javafx.scene.layout.StackPane;

public class FirstJavaFxApplication extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // we create button here 
        Button btn = new Button("Say Hello world ");

        // Here we create event handelar for the button 
        // if we clicked the button its sys hello to the console
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("hello World");
                System.out.println("I love you Lot");
            }
        });

        // Here we add  layout for button  
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        // Here we add  Scene for button
        Scene scene = new Scene(root);
        // Here we set Title of the stage and show the stage 
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFx Appllication");
        primaryStage.show();

    }

}
