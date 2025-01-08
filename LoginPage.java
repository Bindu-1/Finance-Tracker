import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginPage extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the main layout for the application
        BorderPane root = new BorderPane();

        // Set a background image for the login page
        Image backgroundImage = new Image(getClass().getResource("/resources/loginbg.png").toExternalForm());
        ImageView bgImageView = new ImageView(backgroundImage);
        bgImageView.setPreserveRatio(false);
        bgImageView.fitWidthProperty().bind(primaryStage.widthProperty());
        bgImageView.fitHeightProperty().bind(primaryStage.heightProperty());
        root.getChildren().add(bgImageView);

        // Create the login form container
        VBox loginForm = new VBox(16);
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setStyle("-fx-padding: 40px; -fx-border-radius: 8px; -fx-background-radius: 8px;");
        loginForm.setPrefWidth(430);

        // Add a welcome message
        Label welcomeMessage = new Label("Welcome Back 👋");
        welcomeMessage.setFont(Font.font(28));
        welcomeMessage.setTextFill(Color.WHITE);
        welcomeMessage.setAlignment(Pos.CENTER_LEFT);
        welcomeMessage.setMaxWidth(Double.MAX_VALUE);
        loginForm.getChildren().add(welcomeMessage);

        // Add an introductory text
        Label introText = new Label("Today is a new day. It's your day. You shape it.\nSign in to start managing your finance.");
        introText.setFont(Font.font(14));
        introText.setTextFill(Color.WHITE);
        introText.setStyle("-fx-text-fill: rgba(255, 255, 255, 1); -fx-line-spacing: 1.4;");
        introText.setAlignment(Pos.CENTER_LEFT);
        introText.setMaxWidth(Double.MAX_VALUE);
        loginForm.getChildren().add(introText);

        // Create an email input section
        VBox emailBox = new VBox(8);
        emailBox.setAlignment(Pos.CENTER_LEFT);
        Label emailLabel = new Label("Email");
        emailLabel.setFont(Font.font(14));
        emailLabel.setTextFill(Color.WHITE);
        TextField emailField = new TextField("finance@example.com"); // Pre-filled email
        emailField.setEditable(false); // Make the field read-only
        emailField.setStyle("-fx-background-color: rgba(3, 3, 3, 1); -fx-text-fill: rgba(136, 151, 173, 1); -fx-border-radius: 10px; -fx-background-radius: 10px;");
        emailField.setMinHeight(35);
        emailField.setMinHeight(35); // Set the minimum height for the email text field
        emailField.setStyle("-fx-background-color: rgba(3, 3, 3, 1); " +
                    "-fx-text-fill: rgba(136, 151, 173, 1); " +
                    "-fx-border-color: rgba(255, 255, 255, 0.5); " +
                    "-fx-border-width: 1px; " +
                    "-fx-border-radius: 10px; " +
                    "-fx-background-radius: 10px;");

        emailBox.getChildren().addAll(emailLabel, emailField);

        // Create a password input section
        VBox passwordBox = new VBox(8);
        passwordBox.setAlignment(Pos.CENTER_LEFT);
        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font(14));
        passwordLabel.setTextFill(Color.WHITE);
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password123"); // Pre-filled password
        passwordField.setEditable(false); // Make the field read-only
        passwordField.setStyle("-fx-background-color: rgba(3, 3, 3, 1); -fx-text-fill: rgba(136, 151, 173, 1); -fx-border-radius: 10px; -fx-background-radius: 10px;");
        passwordField.setMinHeight(35);
        passwordField.setStyle("-fx-background-color: rgba(3, 3, 3, 1); " +
                       "-fx-text-fill: rgba(136, 151, 173, 1); " +
                       "-fx-border-color: rgba(255, 255, 255, 0.5); " +
                       "-fx-border-width: 1px; " +
                       "-fx-border-radius: 10px; " +
                       "-fx-background-radius: 10px;");

        passwordBox.getChildren().addAll(passwordLabel, passwordField);

        // Add a 'Forgot Password?' hyperlink
        Hyperlink forgotPasswordLink = new Hyperlink("Forgot Password?");
        forgotPasswordLink.setTextFill(Color.web("#1e4ae9"));

        // Create a sign-in button
        Button signInButton = new Button("Sign in");
        signInButton.setStyle("-fx-background-color: rgba(22, 45, 58, 1); -fx-text-fill: white; -fx-font-size: 16px; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        signInButton.prefWidthProperty().bind(emailField.widthProperty());
        signInButton.setMinHeight(35);

        // Add event handler for the sign-in button
        signInButton.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            if (authenticateUser(email, password)) {
                try {
                    HomeSectionApp homeSectionApp = new HomeSectionApp();
                    homeSectionApp.start((Stage) ((Button) e.getSource()).getScene().getWindow()); // Navigate to HomeSection
                } catch (Exception ex) {
                }
            } else {
                showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid email or password.");
            }
        });

        loginForm.getChildren().addAll(emailBox, passwordBox, forgotPasswordLink, signInButton);
        root.setRight(loginForm);
        BorderPane.setAlignment(loginForm, Pos.CENTER_RIGHT);

        // Create a scene and set the stage
        Scene scene = new Scene(root, 1024, 768);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean authenticateUser(String email, String password) {
        // Mock authentication logic (replace with actual database or API call)
        return email.equals("finance@example.com") && password.equals("password123");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
