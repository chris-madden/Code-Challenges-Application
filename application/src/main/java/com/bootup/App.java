package com.bootup;

import com.challenges.Challenge;
import com.challenges.ChallengeFactory;
import com.challenges.ProblemChallenge;
import com.challenges.SearchInsertPosition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        // Need to pass these details from GUI to application backend
        ChallengeFactory challengeFactory = new ProblemChallenge();
        Challenge challenge = challengeFactory.selectChallenge("SearchInsertPosition");

        System.out.println("Challenge Selected: " + challenge.getName() + "\nChallenge Description: " + challenge.getDescription());

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}