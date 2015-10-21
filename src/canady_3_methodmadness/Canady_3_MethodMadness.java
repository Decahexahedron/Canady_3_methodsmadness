package canady_3_methodmadness;

import javafx.animation.*;
import javafx.beans.property.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.util.Duration;

//translate and graphStar ended up not used much if at all
public class Canady_3_MethodMadness extends Application {

    public static final double W = 1400; // canvas dimensions.
    public static final double H = 1050;
    public static final double D = 20;  // diameter.

    @Override
    public void start(Stage stage) {
        DoubleProperty x = new SimpleDoubleProperty();
        DoubleProperty y = new SimpleDoubleProperty();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new KeyValue(x, 0),
                        new KeyValue(y, 0)

                ),
                new KeyFrame(Duration.seconds(2),
                        new KeyValue(x, W - D),
                        new KeyValue(y, H - D)
                )
        );
        timeline.setAutoReverse(true);
        timeline.setCycleCount(Timeline.INDEFINITE);

        final Canvas canvas = new Canvas(W, H);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                int i = (int) x.doubleValue();
                int a = (int) y.doubleValue();

                triangle.drawTriangle(gc, i, a);
            }
        };

        stage.setScene(
                new Scene(
                        new Group(
                                canvas
                        )
                )
        );
        stage.show();
        timer.start();
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
