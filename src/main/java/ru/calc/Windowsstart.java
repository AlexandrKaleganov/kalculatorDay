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
 * @since 02.05.2018
 */

public class Windowsstart extends Application {

    private Button raschet;

    private DatePicker dateStart;
    private DatePicker dateFinal;
    private Text result;


    public void start(Stage primaryStage) throws Exception {
        raschet = new Button("Расчёт");
        dateStart = new DatePicker();
        dateFinal = new DatePicker();
        result = new Text("Укажите начальную и конечную дату и нажмите Расчёт");
        result.setFont(new Font(14));
        BorderPane pane = new BorderPane();

        raschet.addEventHandler(MouseEvent.MOUSE_CLICKED, new Calculate(dateStart, dateFinal, raschet));

        HBox topMenu = new HBox(10);
        topMenu.getChildren().addAll(dateStart, dateFinal);

        pane.setTop(topMenu);
        pane.setCenter(raschet);
        pane.setBottom(result);
        Scene scene = new Scene(pane, 400, 100);
        primaryStage.setTitle("Расчёт количества дней между датами");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
