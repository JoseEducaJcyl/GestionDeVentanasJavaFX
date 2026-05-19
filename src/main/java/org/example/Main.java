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
        // Se asigna el título de la ventana principal
        stage.setTitle("Ventana Principal");

        // Se crea un botón con el texto "Abrir Ventana"
        Button abrirVentanaButton = new Button("Abrir Ventana");

        // Se asigna una acción al botón cuando es presionado
        abrirVentanaButton.setOnAction(e -> {
            // Cuando se pulsa el botón, se llama al método que abre la ventana secundaria
            abrirVentanaSecundaria();
        });

        // Se crea un panel vertical VBox que contiene el botón
        VBox vBox = new VBox(abrirVentanaButton);
        // Se crea la escena con el VBox como raíz, de 300x300 píxeles
        Scene scene = new Scene(vBox, 300, 300);
        // Se asigna la escena a la ventana principal
        stage.setScene(scene);
        // Se hace visible la ventana principal
        stage.show();
    }

    // Método privado que crea y muestra una ventana secundaria (nueva Stage)
    private void abrirVentanaSecundaria() {
        // Se crea un nuevo escenario (ventana) independiente
        Stage ventanaSecundaria = new Stage();
        // Se asigna el título a la ventana secundaria
        ventanaSecundaria.setTitle("Ventana Secundaria");

        // Se crea una etiqueta con el mensaje de bienvenida
        Label mensaje = new Label("Hola desde la ventana secundaria");
        // Se crea un panel vertical VBox que contiene la etiqueta
        VBox vBox = new VBox(mensaje);
        // Se crea la escena con el VBox como raíz, de 200x100 píxeles
        Scene scene = new Scene(vBox, 200, 100);
        // Se asigna la escena a la ventana secundaria
        ventanaSecundaria.setScene(scene);
        // Se hace visible la ventana secundaria
        ventanaSecundaria.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}
