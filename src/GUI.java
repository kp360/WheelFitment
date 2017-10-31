import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

/**
 * Created by Kyle on 10/26/2017.
 */
public class GUI {

    public GUI(BorderPane root) {
        GridPane buttonPane = new GridPane();
        BorderPane drawPane = new BorderPane();
        GridPane buttonSubPane = new GridPane();

        buttonPane.add(buttonSubPane, 0, 5);

        buttonPane.setVgap(3);
        buttonSubPane.setVgap(3);
        buttonSubPane.setHgap(3);
        drawPane.setPrefSize(700,700);
        buttonPane.setPrefSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);

        root.setCenter(drawPane);
        root.setRight(buttonPane);
        root.setPadding(new Insets(10, 20, 10, 20));

        createFenderElements(buttonPane);
        createTireElements(buttonSubPane);
        Separator hSep1 = new Separator();
        Separator vSep1 = new Separator();

        hSep1.setValignment(VPos.CENTER);
        vSep1.setHalignment(HPos.CENTER);
        vSep1.setOrientation(Orientation.VERTICAL);
        buttonPane.add(hSep1, 0, 4);
        buttonSubPane.add(vSep1,1,0);
     }

    private void createFenderElements(GridPane thePane){
        Label vFHLabel = new Label("Fender to Hub Height:");
        Label vFILabel = new Label("Fender to Hub Inset:");
        TextField vFHField = new TextField("mm");
        TextField vFIField = new TextField("mm");
        vFHField.setPrefColumnCount(12);
        vFIField.setPrefColumnCount(12);
        thePane.add(vFHLabel, 0, 0);
        thePane.add(vFHField, 0, 1);
        thePane.add(vFILabel, 0, 2);
        thePane.add(vFIField, 0, 3);
    }

    private void createTireElements(GridPane thePane) {
        Label oTWLabel = new Label("Old Tire Width:");
        Label nTWLabel = new Label("New Tire Width:");
        Label oTHLabel = new Label("Old Tire Profile:");
        Label nTHLabel = new Label("New Tire Profile:");
        TextField oTWField = new TextField("mm");
        TextField nTWField = new TextField("mm");
        TextField oTHField = new TextField("mm");
        TextField nTHField = new TextField("mm");

        thePane.add(oTWLabel, 0,0);
        thePane.add(oTWField,0,1);
        thePane.add(nTWLabel, 2,0);
        thePane.add(nTWField,2, 1);

    }
}
