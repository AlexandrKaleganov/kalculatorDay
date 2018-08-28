package ru.calc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;


/**
 * @author Alexander Kaleganov +79139007067
 * расчёт количества дней меду датами
 * @since 02.05.2018
 */

public class Windowsstart extends Application {

    private Button raschet;

    private DatePicker dateStart;
    private DatePicker dateFinal;
    private Text otstup;

    public void start(Stage primaryStage) throws Exception {
        raschet = new Button("Расчёт");
        dateStart = new DatePicker();
        dateFinal = new DatePicker();
        BorderPane pane = new BorderPane();
        otstup = new Text("               ");
        raschet.addEventHandler(MouseEvent.MOUSE_CLICKED, new Calculate(dateStart, dateFinal, raschet));

        HBox border = new HBox(10);
        border.getChildren().addAll(otstup, raschet);

        pane.setTop(dateStart);
        pane.setLeft(dateFinal);
        pane.setBottom(border);
        Scene scene = new Scene(pane, 175, 100);
        primaryStage.setTitle("Расчёт количества дней между датами");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
