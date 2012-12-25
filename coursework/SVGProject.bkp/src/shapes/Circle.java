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
public class Circle extends Shape{
        
    private float x, y, r;
    
    @Override // BETA REALIZATION COMPLETE
    public Circle getCopy() {
        Circle copy = new Circle();
        copy.x = this.x;
        copy.y = this.y;
        copy.r = this.r;
        copy.setName(this.getName());
        return copy;
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void setParameters(float[] params) {
        if(params.length != 3) {} // бросить эксепшн
        this.x = params[0];
        this.y = params[1];
        this.r = params[2];
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void move(float x, float y) {
        this.x += x;
        this.y += y;
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void rotate(float angle) {    
    }

    @Override // NOT REALIZE
    public void rotate(float angle, float x, float y) {   
    }// move only

    @Override // BETA REALIZATION COMPLETE
    public void draw(GraphicComponent gr) {
        gr.drawCircle(x, y, r);
    }
}
