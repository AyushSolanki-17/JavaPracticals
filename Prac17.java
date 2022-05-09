
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

public class Prac17 extends Application {

    private static Scene scene;

    private GridPane gridPane = new GridPane();
    private BorderPane borderPane = new BorderPane();
    private Label title = new Label("Tic Tac Toe Game");
    private Button restartButton = new Button("Restart Game");
    Font font = Font.font("Roboto", FontWeight.BOLD, 30);

    private Button[] btns = new Button[9];

    boolean gameOver = false;
    int activePlayer = 0;
    int gameState[] = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    int winingPosition[][] = {
            { 0, 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8 },
            { 0, 3, 6 },
            { 1, 4, 7 },
            { 2, 5, 8 },
            { 0, 4, 8 },
            { 2, 4, 6 }
    };

    @Override
    public void start(Stage stage) throws IOException {

        this.createGUI();
        this.handleEvent();
        Scene scene = new Scene(borderPane, 550, 650);
        stage.setScene(scene);

        stage.show();

    }

    private void createGUI() {

        title.setFont(font);
        restartButton.setFont(font);
        restartButton.setDisable(true);
        borderPane.setTop(title);
        borderPane.setBottom(restartButton);
        BorderPane.setAlignment(title, Pos.CENTER);
        BorderPane.setAlignment(restartButton, Pos.CENTER);
        borderPane.setPadding(new Insets(20, 20, 20, 20));

        int label = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setId(label + "");
                button.setFont(font);
                button.setPrefWidth(150);
                button.setPrefHeight(150);
                gridPane.add(button, j, i);
                gridPane.setAlignment(Pos.CENTER);
                btns[label] = button;
                label++;
            }
        }

        borderPane.setCenter(gridPane);

    }

    private void handleEvent() {
        restartButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                for (int i = 0; i < 9; i++) {
                    gameState[i] = 3;
                    btns[i].setGraphic(null);
                    btns[i].setBackground(null);
                    btns[i].setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID,
                            CornerRadii.EMPTY, new BorderWidths(1))));
                    gameOver = false;
                    restartButton.setDisable(true);
                }
            }
        });

        for (Button btn : btns) {
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    Button currentBtn = (Button) actionEvent.getSource();
                    String idS = currentBtn.getId();
                    int idI = Integer.parseInt(idS);

                    if (gameOver) 
                    {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error message");
                        alert.setContentText("Game over..!!  Try to restart the game");
                        alert.show();
                    }
                    else {
                        if (gameState[idI] == 3) 
                        {
                            if (activePlayer == 1) 
                            {
                                ImageView imgView = new ImageView(new Image("D:\\RoughCodes\\Java\\JavaFX\\O.png"));
                                imgView.setFitHeight(100);
                                imgView.setFitWidth(100);

                                currentBtn.setGraphic(imgView);
                                gameState[idI] = activePlayer;
                                checkForWinner();
                                activePlayer = 0;

                            } 
                            else 
                            {
                                ImageView imgView = new ImageView(new Image("D:\\RoughCodes\\Java\\JavaFX\\X.png"));
                                imgView.setFitHeight(100);
                                imgView.setFitWidth(100);
                                currentBtn.setGraphic(imgView);

                                gameState[idI] = activePlayer;
                                checkForWinner();
                                activePlayer = 1;
                            }

                        } 
                        else 
                        {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error message");
                            alert.setContentText("Placed is already occupied");
                            alert.show();
                        }
                    }
                }
            });
        }
    }

    private void checkForWinner() {

        if (!gameOver) {
            for (int wp[] : winingPosition) {

                if (gameState[wp[0]] == gameState[wp[1]] && gameState[wp[1]] == gameState[wp[2]]
                        && gameState[wp[1]] != 3) {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Success message");
                    alert.setContentText((activePlayer == 1 ? "X " : "0 ") + " has won the game");
                    btns[wp[0]].setBackground(
                            new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    btns[wp[1]].setBackground(
                            new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    btns[wp[2]].setBackground(
                            new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    alert.show();
                    gameOver = true;
                    restartButton.setDisable(false);
                    break;

                }
            }

        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}