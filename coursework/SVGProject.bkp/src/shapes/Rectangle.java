/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import draw.GraphicComponent;

/**
 *
 * @author alex
 */
public class Rectangle extends Shape{
    
    private float x, y, height, weight;
    private float angle = 0;
    
    @Override // BETA REALIZATION COMPLETE
    public Rectangle getCopy() {
        Rectangle copy = new Rectangle();
        copy.x = this.x;
        copy.y = this.y;
        copy.height = this.height;
        copy.weight = this.weight;
        copy.setName(this.getName());
        return copy;
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void setParameters(float[] params) {
        if(params.length != 4) {} // бросить эксепшн
        this.x = params[0];
        this.y = params[1];
        this.weight = params[2];
        this.height = params[3];
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void move(float x, float y) {
        this.x += x;
        this.y += y;
    }
    
    @Override // BETA REALIZATION COMPLETE ??
    public void rotate(float angle) { 
        this.angle = angle; // ???? IS THIS ALL??
    }

    @Override // NOT REALIZE
    public void rotate(float angle, float x, float y) {   
    }// move + rotate(angle)s

    @Override // BETA REALIZATION COMPLETE (BAD)
    public void draw(GraphicComponent gr) {
        if (angle==0) {
            gr.drawRectangle(x, y, weight, height);
        } else {
            //ЗАГЛУШКА!!!! НЕОБХОДИМО РАСЧИТЫВАТЬ ТОЧКИ И
            //РИСОВАТЬ С ПОМОЩЬЮ ЛИНИЙ!!!
            gr.drawRectangle(x, y, weight, height);
        }
        
    }
}
