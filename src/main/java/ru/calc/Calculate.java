package ru.calc;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.time.temporal.ChronoUnit;


public class Calculate implements EventHandler<MouseEvent> {
    private DatePicker startDate;
    private DatePicker finalDate;
    private Button button;

    Calculate(DatePicker startDate, DatePicker finlDate, Button button) {
        this.startDate = startDate;
        this.finalDate = finlDate;
        this.button = button;
    }


    public void handle(MouseEvent event) {
        if (startDate.getValue() == null || finalDate.getValue() == null) {
            this.button.setText("Укажите дату");
        } else {
            Long k = startDate.getValue().until(finalDate.getValue(), ChronoUnit.DAYS);
            this.button.setText(k.toString());
        }
    }
}
