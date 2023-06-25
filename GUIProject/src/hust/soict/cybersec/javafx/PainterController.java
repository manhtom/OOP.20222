package hust.soict.cybersec.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;

public class PainterController {

    @FXML
    private VBox drawingAreaPane;
    
    @FXML
    private ToggleGroup i;
    
    @FXML
    private Paint brushColor = Color.BLACK;
    
    @FXML
    private RadioButton penButton;
    
    @FXML
    private RadioButton eraserButton;
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(DragEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);    
    	}

    @FXML
    void toolButtonPressed(ActionEvent event) {
        brushColor = (Color) i.getSelectedToggle().getUserData();
    }
    
    @FXML
    public void initialize () {
        penButton.setUserData(Color.BLACK);
        eraserButton.setUserData(Color.WHITE);
    }
}