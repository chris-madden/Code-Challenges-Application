package com.bootup;

import com.challenges.Challenge;
import com.challenges.ChallengeFactory;
import com.challenges.ProblemChallenge;
import com.challenges.SearchInsertPosition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
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

        // Create Challenge Type Problem Challenge
        ChallengeFactory challengeFactory = new ProblemChallenge();
        Challenge challenge = challengeFactory.selectChallenge("SearchInsertPosition");

        System.out.println(challenge.getResult());

        // Need to learn to create GUI
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var text = new Text("Welcome to my application");
        text.setX(200);
        text.setY(500);
        var input = new TextField("Enter Input Here");
        var scene = new Scene(new StackPane(text,label), 1920, 1080);

        // Stage is complete window
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}