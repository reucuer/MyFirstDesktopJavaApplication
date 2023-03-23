package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.io.*;
import javafx.geometry.Orientation;

import javafx.beans.value.*;
import javafx.event.ActionEvent;
import javafx.event.*;

public class Main extends Application {


    public void newFile(String perem) throws IOException{
            File file = new File("c:testFile1.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(perem);
            printWriter.close();
        }


    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1000, 1000));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        */

        /*
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);


        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);



        */

        Label lbl = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        Button btn = new Button("Click");

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField, btn, lbl);
        Scene scene = new Scene(root, 250, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField in JavaFX");
        primaryStage.show();

        //Button submit = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                lbl.setText("Input: " + textField.getText());
                String valueOfTextField = textField.getText();
                System.out.println(valueOfTextField);

                try {
                    newFile(valueOfTextField);
                } catch(IOException ie) {
                    ie.printStackTrace();
                }
            }
        });


        primaryStage.show();


    }




    public static void main(String[] args) {
        launch(args);
    }
}
