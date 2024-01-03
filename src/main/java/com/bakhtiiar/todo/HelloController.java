package com.bakhtiiar.todo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField titleInputField;
    @FXML
    private TextField descriptionInputField;
    @FXML
    private DatePicker datePicker;

    @FXML
    public void onClickAddButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("addTaskWindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onClickConfirmButton(ActionEvent event) throws IOException{
        // Need to add error alert when text fields and datePicker is empty
        // also task display functionality: when the user clicks the “Confirm” button, all data should be displayed in the ListView on the main page
        Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
