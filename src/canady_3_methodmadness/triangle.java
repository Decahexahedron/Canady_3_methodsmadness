package canady_3_methodmadness;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class triangle {
    
    public static void drawTriangle(GraphicsContext gc, int i, int a){
     gc.setStroke(Color.rgb(255, 0, 0));
                    gc.strokeLine(i + a + 360, i + a + 0,420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 128));
                    gc.strokeLine(i + a + 360, i + a + 60,  480, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 120,  540, i + a + 360);
                    gc.setStroke(Color.rgb(128, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 180,   600, i + a + 360);
                    gc.setStroke(Color.rgb(0, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 240,   660, i + a + 360);
                    gc.setStroke(Color.rgb(0, 128, 255));
                    gc.strokeLine(i + a + 360, i + a + 300,   720, i + a + 360);
//+-
                    gc.setStroke(Color.rgb(0, 255, 255));
                    gc.strokeLine(i + a + 360, i + a + 0 + 420,   720, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 128));
                    gc.strokeLine(i + a + 360, i + a + 60 + 420,  660, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 120 + 420,   600, i + a + 360);
                    gc.setStroke(Color.rgb(128, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 180 + 420,  + 540, i + a + 360);
                    gc.setStroke(Color.rgb(255, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 240 + 420,   480, i + a + 360);
                    gc.setStroke(Color.rgb(255, 128, 0));
                    gc.strokeLine(i + a + 360, i + a + 300 + 420,   420, i + a + 360);
//--
                    gc.setStroke(Color.rgb(255, 0, 0));
                    gc.strokeLine(i + a + 360, i + a + 300 + 420,   720 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 128));
                    gc.strokeLine(i + a + 360, i + a + 240 + 420,   660 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 180 + 420,   600 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(128, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 120 + 420,   540 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 0, 255));
                    gc.strokeLine(i + a + 360, i + a + 60 + 420,  480 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 128, 255));
                    gc.strokeLine(i + a + 360, i + a + 0 + 420,  420 - 420, i + a + 360);
//-+
                    gc.setStroke(Color.rgb(255, 128, 0));
                    gc.strokeLine(i + a + 360, i + a + 0,  720 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(255, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 60,   660 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(128, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 120,  600 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 0));
                    gc.strokeLine(i + a + 360, i + a + 180,  540 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 128));
                    gc.strokeLine(i + a + 360, i + a + 240,  480 - 420, i + a + 360);
                    gc.setStroke(Color.rgb(0, 255, 255));
                    gc.strokeLine(i + a + 360, i + a + 300,  420 - 420, i + a + 360);
}
}