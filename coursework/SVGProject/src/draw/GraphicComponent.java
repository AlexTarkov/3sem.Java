/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.*;

/**
 *
 * @author alex
 */
public class GraphicComponent {
    
    private Graphics graphic;

    public GraphicComponent(Graphics g) {
        System.out.println("name = " + g.getClass().getName());
        this.graphic = (Graphics2D)g;
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
        System.out.println("drawLine |" + x1 + "|" + y1 + "|" + x2 + "|" +y2 );
        this.graphic.drawLine(round(x1), round(y1), round(x2), round(y2));
    }
    
    public void drawRectangle(float x1, float y1, float width, float height) {
        System.out.println("drawRectangle |" + x1 + "|" + y1 + "|" + width + "|" +height );
        this.graphic.drawRect(round(x1), round(y1), round(width), round(height));
    }
    
    public void drawCircle(float x1, float y1, float r) {
        System.out.println("drawCircle |" + x1 + "|" + y1 + "|" + r );
        this.graphic.drawOval(round(x1-r), round(y1-r), round(r*2), round(r*2));
    }
    
    public void drawOval(float x1, float y1, float width, float height) {
        this.graphic.drawOval(round(x1), round(y1), round(width), round(height));
    }
    
}
