/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import static java.lang.Math.*;

/**
 *
 * @author alex
 */
public class GraphicComponent {
    
    private Graphics graphic;
    
    private float scale;
    
    private float scaleX, scaleY;
    
    private float reviewAreaWidth = 0, reviewAreaHeight = 0;
    private float rax, ray; //вспомогательные переменные. чтобы не пересчитывать постоянно.
    
    private final Color AREA_COLOR = Color.LIGHT_GRAY;
    
    private final Color PAINT_COLOR = Color.black;

    public GraphicComponent(Graphics g) {
        System.out.println("name = " + g.getClass().getName());
        this.graphic = (Graphics2D)g;
    }

    public GraphicComponent() {
        this.reviewAreaHeight = 0; 
        this.reviewAreaWidth = 0;
    }
    
    public void setReviewArea(float width, float height) {
        this.reviewAreaHeight = height;
        this.reviewAreaWidth = width;
        
        this.scaleX = width / 2;
        this.scaleY = height / 2;
        
        this.scale = 1;
        
    }
    
    public void setGraphic(Graphics gr) {
        this.graphic = (Graphics2D)gr;
        Rectangle a = gr.getClipBounds();
        //this.graphic.se
                
        System.out.println("ClipBounds |" + a.x + "|" + a.y + "|" + a.width + "|" + a.height );
        
    }
    
    public Graphics getGraphic() {
        return this.graphic;
    }
    
    public void paingReviewArea() {
        Rectangle cp = graphic.getClipBounds();
        
        graphic.setColor(AREA_COLOR);
        
        this.rax = round((cp.width - reviewAreaWidth) / 2);
        this.ray = round((cp.height - reviewAreaHeight) / 2);
        
        graphic.drawRect(round((cp.width - reviewAreaWidth) / 2), 
                round((cp.height - reviewAreaHeight) / 2), round(reviewAreaWidth), 
                round(reviewAreaHeight));
        //середины
        graphic.drawString("" + this.scaleX, round(rax + reviewAreaWidth / 2), round(ray - graphic.getFont().getSize()));
        graphic.drawString("" + this.scaleY, round(rax - graphic.getFont().getSize()), round(ray  + reviewAreaHeight / 2));
        //левый верхний угол
        graphic.drawString("" + (this.scaleX - reviewAreaWidth / (2 * scale)), round(rax), 
                round(ray - graphic.getFont().getSize()));
        graphic.drawString("" + (this.scaleY - reviewAreaHeight / (2 * scale)),
                round(rax - graphic.getFont().getSize()), round(ray  + graphic.getFont().getSize()));
        
        
        graphic.setColor(PAINT_COLOR);
    }
    
    public void setScale(float scale, float scaleX, float scaleY) {
        this.scale = scale;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
    }
    
    public void drawLine(float x1, float y1, float x2, float y2) {
        System.out.println("drawLine |" + x1 + "|" + y1 + "|" + x2 + "|" +y2 );
        this.graphic.drawLine(round(gsx(x1) + rax), round(gsy(y1) + ray), 
                round(gsx(x2) + rax), round(gsy(y2) + ray));
    }
    
    public void drawRectangle(float x1, float y1, float width, float height) {
        System.out.println("drawRectangle |" + x1 + "|" + y1 + "|" + width + "|" +height );
        this.graphic.drawRect(round(gsx(x1) + rax), round(gsy(y1) + ray), round(gsd(width)), round(gsd(height)));
    }
    
    public void drawCircle(float x1, float y1, float r) {
        System.out.println("drawCircle |" + x1 + "|" + y1 + "|" + r );
        this.graphic.drawOval(round(gsx(x1 - r) + rax), round(gsy(y1 - r) + ray), round(gsd(r*2)), round(gsd(r*2)));
    }
    
    public void drawOval(float x1, float y1, float width, float height) {
        this.graphic.drawOval(round(x1), round(y1), round(width), round(height));
    }
    
    public float gsx(float x) { // GET SCALE X COORDINATE
        //return (x - this.scaleX) * scale + (reviewAreaWidth / 2 - scaleX);
        return ((x - this.scaleX) * scale + (reviewAreaWidth / 2) );
    }
    
    public float gsy(float y) { // GET SCALE Y COORDINATE
        return ((y - this.scaleY) * scale + (reviewAreaHeight / 2) );
    }
    
    public float gsd(float distance) { // GET SCALE DISTANCE
        return distance * scale;
    }
    
}

//// проблема, и вообще нужно переделать.
//class Point {
//    public float x, y;
//}
