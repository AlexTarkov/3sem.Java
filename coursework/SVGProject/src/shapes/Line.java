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
public class Line extends Shape{
    
    private float x1, y1, x2, y2;
    
    public Line() {
        
    }
    
    
    // FOR THE TESTS
    public Line(String name, float x1, float y1, float x2, float y2) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2; this.setName(name);
    }
    
    @Override // BETA REALIZATION COMPLETE
    public Line getCopy() {
        Line copy = new Line();
        copy.x1 = this.x1;
        copy.y1 = this.y1;
        copy.x2 = this.x2;
        copy.y2 = this.y2;
        copy.setName(this.getName());
        return copy;
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void setParameters(float[] params) {
        if(params.length != 4) {} // бросить эксепшн
        this.x1 = params[0];
        this.y1 = params[1];
        this.x2 = params[2];
        this.y2 = params[3];
    }
    
    @Override // BETA REALIZATION COMPLETE
    public void move(float x, float y) {
        this.x1 +=x;
        this.y1 +=y;
        this.x2 +=x;
        this.y2 +=y;
    }
    
    @Override // NOT REALIZE
    public void rotate(float angle) {   
    }

    @Override // NOT REALIZE
    public void rotate(float angle, float x, float y) {   
    }

    @Override // BETA REALIZATION COMPLETE
    public void draw(GraphicComponent gr) {
        gr.drawLine(x1, y1, x2, y2);
        System.out.println(this.getName()+".draw()|" + x1 + "|" + y1 + "|" + x2 + "|" +y2 );
    }
    
}