package me.ruibin.leto;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import me.ruibin.leto.ui.MainWindow;

/**
 * A GUI for Leto using FXML.
 */
public class Main extends Application {

    private Leto leto = Leto.getLeto();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            stage.setTitle("Duke Leto");
            fxmlLoader.<MainWindow>getController().setLeto(leto);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

