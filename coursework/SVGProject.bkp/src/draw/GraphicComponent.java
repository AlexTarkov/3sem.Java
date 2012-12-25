/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Graphics;
import static java.lang.Math.*;

/**
 *
 * @author alex
 */
public class GraphicComponent {
    
    private Graphics graphic;

    public GraphicComponent(Graphics g) {
        this.graphic = g;
    }

    public GraphicComponent() {
    }
    
    public void setGraphic(Graphics gr) {
        this.graphic = gr;
    }
    
    public Graphics getGraphic() {
        return this.graphic;
    }
    
    public void drawLine(float x1, float y1, float x2, float y2) {
        this.graphic.drawLine(round(x1), round(y1), round(x2), round(y2));
    }
    
    public void drawRectangle(float x1, float y1, float width, float height) {
        this.graphic.drawRect(round(x1), round(y1), round(width), round(height));
    }
    
    public void drawCircle(float x1, float y1, float r) {
        this.graphic.drawOval(round(x1), round(y1), round(r), round(r));
    }
    
    public void drawOval(float x1, float y1, float width, float height) {
        this.graphic.drawOval(round(x1), round(y1), round(width), round(height));
    }
    
}
