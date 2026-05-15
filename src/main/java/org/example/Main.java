package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Ventana Principal");

        Button abrirVentanaButton =  new Button("Abrir Ventana");
        abrirVentanaButton.setOnAction(e -> {
            abrirVentanaSecundaria();
        });

        VBox vBox = new VBox(abrirVentanaButton);
        Scene scene = new Scene(vBox, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    private void abrirVentanaSecundaria() {
        Stage ventanaSecundaria = new Stage();
        ventanaSecundaria.setTitle("Ventana Secundaria");

        Label mensaje = new Label("Hola desde la ventana secundaria");
        VBox vBox = new VBox(mensaje);
        Scene scene = new Scene(vBox, 200, 100);
        ventanaSecundaria.setScene(scene);
        ventanaSecundaria.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
