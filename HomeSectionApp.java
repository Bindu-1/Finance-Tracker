import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HomeSectionApp extends Application {
    

    
    @Override
    public void start(Stage primaryStage) {
        // Main Pane for HOME-SECTION--v-main
        Pane mainPane = new Pane();
        mainPane.setPrefSize(1440, 1024);
        mainPane.setStyle("-fx-background-color: #0e0c0f; -fx-padding: 0 0 0 18px;");
        
        // Profile Logo Image (ImageView)
        Image profileImage = new Image("homeresources/logo.png"); // Replace with your logo path
        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitWidth(86);  // Set the width to 86px
        profileImageView.setFitHeight(86); // Set the height to 86px
        profileImageView.setLayoutX(20); // Positioned at the top-left of the main pane
        profileImageView.setLayoutY(20); // Positioned slightly below the top margin

        // Plus Circle Image (ImageView)
        Image plusCircleImage = new Image("homeresources/pluscircle.png"); // Replace with your plus circle image path
        ImageView plusCircleImageView = new ImageView(plusCircleImage);
        plusCircleImageView.setFitWidth(24.1);  // Set the width to 24.1px
        plusCircleImageView.setFitHeight(24.1); // Set the height to 24.1px
        plusCircleImageView.setLayoutX(51); // Positioned at the same X as the logo for alignment
        plusCircleImageView.setLayoutY(160); // Positioned below the logo with some margin (106px from top)

        // Arrow Line (simulating the arrow as a horizontal line)
        Rectangle arrowLine = new Rectangle(80, 2);
        arrowLine.setFill(Color.rgb(158, 158, 158)); // Arrow-like color (gray)
        arrowLine.setLayoutX(22); // Align with the center of the plus circle
        arrowLine.setLayoutY(220); // Positioned below the plus circle (36px gap)
        
        // Home Icon (ImageView)
        Image homeIcon = new Image("homeresources/home.png"); // Replace with your home icon path
        ImageView homeIconView = new ImageView(homeIcon);
        homeIconView.setFitWidth(40);  // Set the width to 40px
        homeIconView.setFitHeight(40); // Set the height to 40px
        homeIconView.setLayoutX(40); // Align with the arrow line and other elements
        homeIconView.setLayoutY(260); // Positioned slightly below the arrow line (10px gap)
        
        // Calender Icon (ImageView)
        Image calenderIcon = new Image("homeresources/calender.png"); // Replace with your home icon path
        ImageView calenderIconView = new ImageView(calenderIcon);
        calenderIconView.setFitWidth(28);  // Set the width to 40px
        calenderIconView.setFitHeight(28); // Set the height to 40px
        calenderIconView.setLayoutX(46); // Align with the arrow line and other elements
        calenderIconView.setLayoutY(340); // Positioned slightly below the arrow line (10px gap)
        
        // Graph Icon (ImageView)
        Image graphIcon = new Image("homeresources/graph.png"); // Replace with your home icon path
        ImageView graphIconView = new ImageView(graphIcon);
        graphIconView.setFitWidth(25);  // Set the width to 40px
        graphIconView.setFitHeight(25); // Set the height to 40px
        graphIconView.setLayoutX(48); // Align with the arrow line and other elements
        graphIconView.setLayoutY(410); // Positioned slightly below the arrow line (10px gap)
        
        // Arrow Line (simulating the arrow as a horizontal line)
        Rectangle arrowLine1 = new Rectangle(80, 2);
        arrowLine1.setFill(Color.rgb(158, 158, 158)); // Arrow-like color (gray)
        arrowLine1.setLayoutX(22); // Align with the center of the plus circle
        arrowLine1.setLayoutY(475); // Positioned below the plus circle (36px gap)
        
        // invoice Icon (ImageView)
        Image invoiceIcon = new Image("homeresources/invoice1.png"); // Replace with your home icon path
        ImageView invoiceIconView = new ImageView(invoiceIcon);
        invoiceIconView.setFitWidth(25);  // Set the width to 40px
        invoiceIconView.setFitHeight(30); // Set the height to 40px
        invoiceIconView.setLayoutX(48); // Align with the arrow line and other elements
        invoiceIconView.setLayoutY(520); // Positioned slightly below the arrow line (10px gap)


        // Rectangle-1 Pane
        Pane rectangle1 = new Pane();
        rectangle1.setPrefSize(1317, 1024);
        rectangle1.setLayoutX(123); // Positioned to leave the gap on the left
        rectangle1.setStyle(
            "-fx-background-color: #000;" +
            "-fx-padding: 22px 85px 338px 20px;" +
            "-fx-border-radius: 30 0 0 30;" +
            "-fx-background-radius: 30 0 0 30;"
        );

        // Search Bar Background
        Pane searchBarBackground = new Pane();
        searchBarBackground.setPrefSize(403, 51);
        searchBarBackground.setLayoutX(20); // Positioned with margin-left: 20px
        searchBarBackground.setLayoutY(30); // Positioned with margin-top: 4px
        searchBarBackground.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-border-color: #4f4d4d;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 39px;" +
            "-fx-background-radius: 39px;" +
            "-fx-padding: 14px 87px 16px 23px;" // Adjust padding to leave space for the icon
        );

        // Search Icon (ImageView)
        Image searchIcon = new Image("homeresources/searchi.jpg"); // Replace with your icon path
        ImageView searchIconView = new ImageView(searchIcon);
        searchIconView.setFitWidth(30);
        searchIconView.setFitHeight(30);
        searchIconView.setLayoutX(23); // Position the icon inside the search bar
        searchIconView.setLayoutY(14); // Center the icon vertically

        // Search Bar Input Field
        TextField searchBar = new TextField();
        searchBar.setPromptText("Search by month/year/category");
        searchBar.setStyle(
            "-fx-background-color: transparent;" + 
            "-fx-text-fill: #ffffff;" + // Actual text color when typing
            "-fx-font-size: 17px;" +
            "-fx-prompt-text-fill: #9e9e9e;" + // Placeholder text color
            "-fx-font-family: 'Inter';" +
            "-fx-padding: 0 0 0 32px;" // Add padding to the left to make space for the icon
        );
        searchBar.setPrefSize(403 - 23 - 87, 51 - 14 - 16); // Adjust size considering padding
        searchBar.setLayoutX(23); // Match padding-left
        searchBar.setLayoutY(14); // Match padding-top
        
        // Box in Rectangle-1 Pane
        Pane rectangleBox = new Pane();
        rectangleBox.setPrefSize(704, 561); // Set width and height
        rectangleBox.setLayoutX(20); // Positioned with margin-left: 20px
        rectangleBox.setLayoutY(140); // Positioned with margin-top: 48px
        rectangleBox.setStyle(
            "-fx-background-color: linear-gradient(to bottom, #1a2c59, #151515);" +
            "-fx-border-color: #000;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 24px;" +
            "-fx-background-radius: 24px;" +
            "-fx-padding: 31px 35px 33px 20px;"
        );
        
        // Tracker Title
        Label trackerTitle = new Label("Your Tracker");
        trackerTitle.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 26px;" +
            "-fx-font-weight: 600;" +
            "-fx-text-fill: #fff;" +
            "-fx-margin: 0 46px 15px 0;"
        );
        trackerTitle.setLayoutX(20); // Adjust as needed
        trackerTitle.setLayoutY(20);

        // Tracker Subtitle
        Label trackerSubtitle = new Label("Track and improve your wealth");
        trackerSubtitle.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 600;" +
            "-fx-text-fill: #9e9e9e;"
        );
        trackerSubtitle.setLayoutX(20); // Adjust as needed
        trackerSubtitle.setLayoutY(60);

        // Category Buttons
        HBox categoryButtons = new HBox(10); // Spacing between buttons
        categoryButtons.setLayoutX(20); // Adjust as needed
        categoryButtons.setLayoutY(100);

        Button spendButton = new Button("Spend");
        spendButton.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-border-color: #9e9e9e;" +
            "-fx-border-radius: 26px;" +
            "-fx-padding: 5px 18px;" +
            "-fx-text-fill: #fff;" +
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 16px;"
        );

        Button incomeButton = new Button("Income");
        incomeButton.setStyle(spendButton.getStyle());

        Button savingsButton = new Button("Savings");
        savingsButton.setStyle(spendButton.getStyle());


        // Notification Background Pane
        Pane notificationBackground = new Pane();
        notificationBackground.setPrefSize(37, 34); // Match CSS dimensions
        notificationBackground.setLayoutX(430); // Adjust position
        notificationBackground.setLayoutY(100);
        notificationBackground.setStyle(
            "-fx-background-color: linear-gradient(to bottom, #73a5be, #354c58);" +
            "-fx-border-radius: 5px;" // Optional for rounded corners
        );

        // Time Options
        Label oneMonth = new Label("1M");
        oneMonth.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: normal;" +
            "-fx-text-fill: #fff;" +
            "-fx-padding: 0 10px;"
        );

        Label oneYear = new Label("1Y");
        oneYear.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: normal;" +
            "-fx-text-fill: #fff;" +
            "-fx-padding: 0 10px;"
        );

        Label twoYears = new Label("2Y");
        twoYears.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: normal;" +
            "-fx-text-fill: #fff;" +
            "-fx-padding: 0 10px;"
        );

        // Layout for Notification Background and Time Options
        HBox notificationWithTime = new HBox(10); // Spacing between elements
        notificationWithTime.setLayoutX(480); // Adjust position
        notificationWithTime.setLayoutY(100); // Align with category buttons
        notificationWithTime.getChildren().addAll(notificationBackground, oneMonth, oneYear, twoYears);




        
        // Add a Bar Chart inside the rectangleBox
        CategoryAxis xAxis = new CategoryAxis(); // X-axis with months
        xAxis.setLabel("Months");
        xAxis.lookup(".axis-label").setStyle("-fx-text-fill: #a9afb8; -fx-font-size: 14px;");
        
        
        NumberAxis yAxis = new NumberAxis(); // Y-axis
        yAxis.setAutoRanging(false); // Automatically adjust the range
        yAxis.setVisible(true); // Hide the Y-axis as per the requirement
        yAxis.setTickLabelsVisible(false); // Hide Y-Axis labels
        yAxis.setTickMarkVisible(false); // Hide tick marks
        yAxis.setOpacity(0);
        
        
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setPrefSize(664, 511); // Adjust size to fit inside the rectangleBox
        barChart.setLayoutX(20); // Align with padding inside the box
        barChart.setLayoutY(20); // Align with padding inside the box
        barChart.lookup(".chart-plot-background").setStyle("-fx-background-color: transparent;"); // Remove white plot background

        // Add data to the bar chart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("January", 15));
        series.getData().add(new XYChart.Data<>("February", 35));
        series.getData().add(new XYChart.Data<>("March", 50));
        series.getData().add(new XYChart.Data<>("April", 20));
        series.getData().add(new XYChart.Data<>("May", 10)); // Highest bar
        series.getData().add(new XYChart.Data<>("June", 15));
        series.getData().add(new XYChart.Data<>("July", 30));
        barChart.getData().add(series);
         // Apply styles to the bars
        for (XYChart.Data<String, Number> data : series.getData()) {
            data.getNode().setStyle("-fx-bar-fill: #3d4654;");
        }
        // Customize bar chart appearance
        barChart.setLegendVisible(false); // Hide legend
        barChart.setHorizontalGridLinesVisible(false); // Hide grid lines
        barChart.setVerticalGridLinesVisible(false);

        // Notification Icon Image (ImageView)
        Image notificationIcon = new Image("homeresources/notification.png"); // Replace with your notification icon path
        ImageView notificationIconView = new ImageView(notificationIcon);
        notificationIconView.setFitWidth(48);  // Set the width to 56px
        notificationIconView.setFitHeight(44); // Set the height to 52px
        notificationIconView.setLayoutX(1110);  // 1440 - 56 (width of icon) = 1384, subtracting any margin if needed
        notificationIconView.setLayoutY(28);   // You can adjust the Y position based on your needs
        
        // Profile Account Icon (ImageView)
        Image profileAccountIcon = new Image("homeresources/profile.png"); // Replace with your profile account icon path
        ImageView profileAccountIconView = new ImageView(profileAccountIcon);
        profileAccountIconView.setFitWidth(44);  // Set the width to 48px
        profileAccountIconView.setFitHeight(44); // Set the height to 48px
        profileAccountIconView.setLayoutX(1200);  // Adjust X position (slightly to the right of notification icon)
        profileAccountIconView.setLayoutY(28);   // Match Y position with the notification icon
        
        // Tracker Background Pane
        Pane trackerBackground = new Pane();
        trackerBackground.setPrefSize(496, 192);
        trackerBackground.setLayoutX(760); // Positioned to the right of the graph (704 + 20 + 20 margin)
        trackerBackground.setLayoutY(140); // Aligned vertically with the graph
        trackerBackground.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-border-color: #757575;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 24px;" +
            "-fx-background-radius: 24px;" +
            "-fx-padding: 20px 7px 8px;"
        );
        
        // Quick Actions Background Pane
        Pane quickActionsBackground = new Pane();
        quickActionsBackground.setPrefSize(482, 109);
        quickActionsBackground.setLayoutX(7); // Adjusted to fit inside the tracker background
        quickActionsBackground.setLayoutY(76); // Positioned with a 30px top margin within the tracker
        quickActionsBackground.setStyle(
            "-fx-background-color: #242424;" + // Dark background
            "-fx-border-color: #757575;" + // Border color
            "-fx-border-width: 1px;" + // Border width
            "-fx-border-radius: 16px;" + // Rounded corners
            "-fx-background-radius: 16px;" + // Match border radius
            "-fx-padding: 23px 62px 17px 41px;" // Padding inside the box
        );


        // My Goals Background Pane
        Pane myGoalsBackground = new Pane();
        myGoalsBackground.setPrefSize(496, 339);
        myGoalsBackground.setLayoutX(760); // Positioned to the right of the graph (704 + 20 + 20 margin)
        myGoalsBackground.setLayoutY(362); // Positioned below the tracker background (192 + 30 margin)
        myGoalsBackground.setStyle(
            "-fx-background-color: transparent;" +
            "-fx-border-color: #757575;" +
            "-fx-border-width: 1px;" +
            "-fx-border-radius: 24px;" +
            "-fx-background-radius: 24px;" +
            "-fx-padding: 25px 31px 63px 28px;"
        );
        
        // Quick Actions Title Label
        Label quickActionsTitle = new Label("Quick actions");
        quickActionsTitle.setPrefSize(137, 25);
        quickActionsTitle.setLayoutX(20); // Margin-left: 20px
        quickActionsTitle.setLayoutY(18); // Align to the top of the Quick Actions Background
        quickActionsTitle.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 21px;" +
            "-fx-font-weight: 500;" +
            "-fx-text-fill: #ffffff;"  // White text color
        );
        
        // Icon 1 - In/Out
        Image icon1Image = new Image("homeresources/inout.png"); // Replace with your actual path
        ImageView icon1ImageView = new ImageView(icon1Image);
        icon1ImageView.setFitWidth(38.8);
        icon1ImageView.setFitHeight(36);
        icon1ImageView.setLayoutX(50); // Margin-left: 9px
        icon1ImageView.setLayoutY(20); // Adjust based on alignment
        icon1ImageView.setStyle("-fx-border-color: #ffffff; -fx-border-width: 2px;");

        // Label for Icon 1
        Label inOutLabel = new Label("In/Out");
        inOutLabel.setStyle("-fx-font-family: 'Inter'; -fx-font-size: 14px; -fx-text-fill: #fff;");
        inOutLabel.setLayoutX(52); // Align with icon
        inOutLabel.setLayoutY(60); // Below the icon

        // Icon 2 - History
        Image icon2Image = new Image("homeresources/history.png"); // Replace with your actual path
        ImageView icon2ImageView = new ImageView(icon2Image);
        icon2ImageView.setFitWidth(37);
        icon2ImageView.setFitHeight(37);
        icon2ImageView.setLayoutX(220); // Margin-left: 114px
        icon2ImageView.setLayoutY(20); // Adjust based on alignment

        // Label for Icon 2
        Label historyLabel = new Label("History");
        historyLabel.setStyle("-fx-font-family: 'Inter'; -fx-font-size: 14px; -fx-text-fill: #fff;");
        historyLabel.setLayoutX(217); // Align with icon
        historyLabel.setLayoutY(60); // Below the icon

        // Icon 3 - Invoice
        Image icon3Image = new Image("homeresources/invoice.png"); // Replace with your actual path
        ImageView icon3ImageView = new ImageView(icon3Image);
        icon3ImageView.setFitWidth(34);
        icon3ImageView.setFitHeight(40);
        icon3ImageView.setLayoutX(390); // Adjust X position
        icon3ImageView.setLayoutY(20); // Adjust based on alignment
        icon3ImageView.setStyle("-fx-background-color: #ffffff;");

        // Label for Icon 3
        Label invoiceLabel = new Label("Invoice");
        invoiceLabel.setStyle("-fx-font-family: 'Inter'; -fx-font-size: 14px; -fx-text-fill: #fff;");
        invoiceLabel.setLayoutX(387); // Align with icon
        invoiceLabel.setLayoutY(60); // Below the icon
        
        // My Goals Title Label
        Label myGoalsTitle = new Label("My Goals");
        myGoalsTitle.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 21px;" +
            "-fx-font-weight: 500;" +
            "-fx-text-fill: #ffffff;" // White text color
        );
        myGoalsTitle.setLayoutX(28); // Adjust position inside the rectangle
        myGoalsTitle.setLayoutY(25); // Vertically align within the top padding

        // Percentage Label
        Label percentageLabel = new Label("75%");
        percentageLabel.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 600;" +
            "-fx-text-fill: #9e9e9e;" // Green text color
        );
        percentageLabel.setLayoutX(28); // Align with some margin
        percentageLabel.setLayoutY(80); // Below "My Goals" title

        // Up Arrow Image
        Image upArrowImage = new Image("homeresources/arrow.png"); // Replace with your arrow image path
        ImageView upArrowImageView = new ImageView(upArrowImage);
        upArrowImageView.setFitWidth(15); // Set the width
        upArrowImageView.setFitHeight(15); // Set the height
        upArrowImageView.setLayoutX(70); // Position next to the percentage label
        upArrowImageView.setLayoutY(85); // Align with percentage label

        // Progress Bar
        Pane progressBarBackground = new Pane();
        progressBarBackground.setPrefSize(437, 9); // Background bar dimensions
        progressBarBackground.setLayoutX(28); // Align with the left margin
        progressBarBackground.setLayoutY(120); // Below percentage and arrow
        progressBarBackground.setStyle(
            "-fx-background-color: #4f4d4d;" + // Gray background color
            "-fx-border-radius: 10px;" + // Rounded corners
            "-fx-background-radius: 10px;"
        );

        Pane progressBarFill = new Pane();
        progressBarFill.setPrefSize(322, 9); // Adjust the width based on percentage
        progressBarFill.setStyle(
            "-fx-background-color: linear-gradient(to right, #73a5be, #737373);" + // Green fill
            "-fx-border-radius: 10px;" +
            "-fx-background-radius: 10px;"
        );
        // Goal Progress Text
        Label goalProgressText = new Label("added 1,000/900");
        goalProgressText.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 300;" +
            "-fx-text-fill: #9e9e9e;" + // Gray color
            "-fx-padding: 11px 254px 30px 4px;" // Match the margins specified in CSS
        );
        goalProgressText.setLayoutX(26); // Align to the left within the rectangle
        goalProgressText.setLayoutY(130); // Position it below the progress bar
        
        // Percentage Label
        Label percentage1Label = new Label("56%");
        percentage1Label.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 600;" +
            "-fx-text-fill: #9e9e9e;" // Gray text color
        );
        percentage1Label.setLayoutX(28); // Align with some margin
        percentage1Label.setLayoutY(200); // Below "My Goals" title

        // Up Arrow Image
        Image upArrowImage1 = new Image("homeresources/arrow.png"); // Replace with your arrow image path
        ImageView upArrowImage1View = new ImageView(upArrowImage1);
        upArrowImage1View.setFitWidth(15); // Set the width
        upArrowImage1View.setFitHeight(15); // Set the height
        upArrowImage1View.setLayoutX(70); // Position next to the percentage label
        upArrowImage1View.setLayoutY(205); // Align with percentage label

        // Progress Bar
        Pane progressBarBackground1 = new Pane();
        progressBarBackground1.setPrefSize(437, 9); // Background bar dimensions
        progressBarBackground1.setLayoutX(28); // Align with the left margin
        progressBarBackground1.setLayoutY(240); // Below percentage and arrow
        progressBarBackground1.setStyle(
            "-fx-background-color: #4f4d4d;" + // Gray background color
            "-fx-border-radius: 10px;" + // Rounded corners
            "-fx-background-radius: 10px;"
        );

        Pane progressBarFill1 = new Pane();
        progressBarFill1.setPrefSize(270, 9); // Adjust the width based on percentage
        progressBarFill1.setStyle(
            "-fx-background-color: linear-gradient(to right, #73a5be, #737373);" + // Green fill
            "-fx-border-radius: 10px;" +
            "-fx-background-radius: 10px;"
        );

        // Goal Progress Text
        Label goalProgressText1 = new Label("added 1,000/900");
        goalProgressText1.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 300;" +
            "-fx-text-fill: #9e9e9e;" + // Gray color
            "-fx-padding: 11px 254px 30px 4px;" // Match the margins specified in CSS
        );
        goalProgressText1.setLayoutX(26); // Align to the left within the rectangle
        goalProgressText1.setLayoutY(250); // Position it below the progress bar

        
           // Add Button Text Label
        Label addButtonText = new Label("add");
        addButtonText.setStyle(
            "-fx-font-family: 'Inter';" +
            "-fx-font-size: 17px;" +
            "-fx-font-weight: 500;" +
            "-fx-text-fill: #9e9e9e;" // White text color
        );
        addButtonText.setLayoutX(400); // Position to the right within the rectangle
        addButtonText.setLayoutY(25); // Match vertical alignment with "My Goals" text



        // Add icon and search bar to the background pane
        searchBarBackground.getChildren().addAll(searchIconView, searchBar);

        // Add everything to the main Pane
        rectangle1.getChildren().add(searchBarBackground); // Add search bar to Rectangle-1
        mainPane.getChildren().add(rectangle1); // Add Rectangle-1 to main pane
        mainPane.getChildren().add(profileImageView); // Add profile logo
        mainPane.getChildren().add(plusCircleImageView); // Add plus circle below the logo
        mainPane.getChildren().add(arrowLine); // Add the arrow line below the plus circle
        mainPane.getChildren().add(homeIconView); // Add the home icon below the arrow line
        mainPane.getChildren().add(calenderIconView); // Add the calender icon below the home logo
        mainPane.getChildren().add(graphIconView); // Add the graph icon below the home logo
        mainPane.getChildren().add(arrowLine1); // Add the arrow line below the plus circle
        mainPane.getChildren().add(invoiceIconView); // Add the arrow line below the plus circle
        // Add the box to Rectangle-1 Pane
        rectangle1.getChildren().add(rectangleBox);
        // Add bar chart to the rectangleBox
       
        rectangle1.getChildren().add(notificationIconView); // Add notification icon to Rectangle-1 Pane
        rectangle1.getChildren().add(profileAccountIconView);
        // Add the new rectangles to the main Pane
        rectangle1.getChildren().add(trackerBackground);
        rectangle1.getChildren().add(myGoalsBackground);
        // Add Quick Actions to Tracker Background
        trackerBackground.getChildren().add(quickActionsBackground);
        
        // Add Quick Actions Title to Quick Actions Background
        trackerBackground.getChildren().add(quickActionsTitle);
        
        // Add Icons and Labels to Quick Actions Background
        quickActionsBackground.getChildren().addAll(
            icon1ImageView, inOutLabel,
            icon2ImageView, historyLabel,
            icon3ImageView, invoiceLabel
        );
        // Add labels to My Goals Background
        myGoalsBackground.getChildren().add(addButtonText);
        
         // Add progress bar fill to background
        progressBarBackground.getChildren().add(progressBarFill);

        // Add components to My Goals rectangle
        myGoalsBackground.getChildren().addAll(myGoalsTitle, percentageLabel, upArrowImageView, progressBarBackground);
        // Add Goal Progress Text to the rectangle
        myGoalsBackground.getChildren().add(goalProgressText);
        
        
         // Add progress bar fill to background
        progressBarBackground1.getChildren().add(progressBarFill1);

        myGoalsBackground.getChildren().addAll(percentage1Label, upArrowImage1View, progressBarBackground1);
        // Add Goal Progress Text to the rectangle
        myGoalsBackground.getChildren().add(goalProgressText1);
        
        categoryButtons.getChildren().addAll(spendButton, incomeButton, savingsButton);
        // Adding Components to rectangleBox
        rectangleBox.getChildren().addAll(trackerTitle, trackerSubtitle, categoryButtons, notificationBackground, barChart);
        // Add to Main Pane
        rectangleBox.getChildren().add(notificationWithTime);




        // Scene and Stage setup
        Scene scene = new Scene(mainPane, 1440, 1024, Color.BLACK);
        primaryStage.setTitle("Homesection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}
