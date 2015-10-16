package canady_3_methodmadness;

import javafx.animation.*;
import javafx.beans.property.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

//translate and graphStar ended up not used much if at all
public class Canady_3_MethodMadness extends Application {
public static int counter = 0;
    public static final double W = 1000; // canvas dimensions.
    public static final double H = 1000;

    public static final double D = 20;  // diameter.

    @Override
    public void start(Stage stage) {
        DoubleProperty x = new SimpleDoubleProperty();
        DoubleProperty y = new SimpleDoubleProperty();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new KeyValue(x, 0),
                        new KeyValue(y, 0)
//                        counter += 1;
                        
                ),
                new KeyFrame(Duration.seconds(3),
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
//                gc.setFill(Color.CORNSILK);
//                gc.fillRect(0, 0, W, H);
//                gc.setFill(Color.FORESTGREEN);
//                gc.fillOval(
//                        x.doubleValue(),
//                        y.doubleValue(),
//                        D,
//                        D
//                );
                
                int i = (int) x.doubleValue();
                int a = (int) y.doubleValue();

                    gc.setStroke(Color.rgb(255, 0, 0));
                    gc.strokeLine(i + a + 360, i + a + 0, 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 128));
                    gc.strokeLine(i + a + 360, i + a + 60, 480, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 120, 540, i + a + 360);
                    gc.setStroke(Color.rgb(128, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 180, 600, i + a + 360);
                    gc.setStroke(Color.rgb(0, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 240, 660, i + a + 360);
                    gc.setStroke(Color.rgb(0, 128, 255));
                    gc.strokeLine(i + a + 360, i + a + 300, 720, i + a + 360);
//+-
                    gc.setStroke(Color.rgb(0, 255, 255));
                    gc.strokeLine(i + a + 360, i + a + 0 + 420, 720, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 128));
                    gc.strokeLine(i + a + 360, i + a + 60 + 420, 660, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 120 + 420, 600, i + a + 360);
                    gc.setStroke(Color.rgb(128, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 180 + 420, 540, i + a + 360);
                    gc.setStroke(Color.rgb(255, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 240 + 420, 480, i + a + 360);
                    gc.setStroke(Color.rgb(255, 128, 0));
                    gc.strokeLine(i + a + 360, i + a + 300 + 420, 420, i + a + 360);
//--
                    gc.setStroke(Color.rgb(255, 0, 0));
                    gc.strokeLine(i + a + 360, i + a + 300 + 420, 720 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 128));
                    gc.strokeLine(i + a + 360, i + a + 240 + 420, 660 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 180 + 420, 600 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(128, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 120 + 420, 540 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 60 + 420, 480 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 128, 255));
                    gc.strokeLine(i + a + 360, i + a + 0 + 420, 420 - 420, i + a + 360);
//-+
                    gc.setStroke(Color.rgb(255, 128, 0));
                    gc.strokeLine(i + a + 360, i + a + 0, 720 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 60, 660 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(128, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 120, 600 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 180, 540 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 128));
                    gc.strokeLine(i + a + 360, i + a + 240, 480 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 255));
                    gc.strokeLine(i + a + 360, i + a + 300, 420 - 420, i + a + 360);
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
