/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import draw.GraphicComponent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class CompositeShapes extends Shape{
    
    private ArrayList<Shape> shapes;
    
    public CompositeShapes() {
        this.shapes = new ArrayList<Shape>();
    }
    
    // Prototype methods
    @Override //BETA REALIZATION COMPLETE
    public CompositeShapes getCopy(){ 
        //лучше было бы сделать обход в глубину вместо рекурсии
        CompositeShapes copy = new CompositeShapes();
        
        Iterator<Shape> it = this.iterator();
        
        while (it.hasNext()) {
            Shape temp = it.next().getCopy();
            temp.setName(temp.getName() + COPY_SUFFIX);
            copy.add(temp);
        }
        
        return copy;
    }
    //занятно, что тот факт, что тип возвращаемого значения не входит в 
    //сигнатуру играет на руку в данном случае)
    
    
    // Memento methods
    
    // Iterable methods // не понятно ЗАЧЕМ, кстати
    @Override //BETA REALIZATION COMPLETE
    public Iterator<Shape> iterator() {
        return shapes.iterator();
    }

    // CompositeShapes methods
    @Override //BETA REALIZATION COMPLETE
    public void add(Shape sh) {
        System.out.println(sh.getName()+".add()");
        this.shapes.add(sh);
        System.out.println(this.shapes.size());
    }
    @Override //BETA REALIZATION COMPLETE
    public void remove(String name) {
        Iterator<Shape> it = this.iterator();
        while (it.hasNext()) {
            Shape temp = it.next();
            if (temp.getName().equals(name)) {
                it.remove(); return;
            } else {
                temp.remove(name);
            }
        }
        
    }
    @Override //BETA REALIZATION COMPLETE
    public boolean isComposite() {
        return true;
    }
    
    @Override //BETA REALIZATION COMPLETE
    public void move(float px, float py) {
        Iterator<Shape> it = this.iterator();
        while (it.hasNext()) {
            it.next().move(px, py);
        }
    }
    
    @Override
    public void setParameters(float[] params) {
        
    } //добавить генерацию исключения (или не стоит)
    
    @Override // BETA REALIZATION COMPLETE
    public void rotate(float angle, float x, float y) {
        Iterator<Shape> it = this.iterator();
        while (it.hasNext()) {
            it.next().rotate(angle, x, y);
        }
    }
    
    @Override // NOT REALIZE
    public void rotate(float angle) {
        
    } //придется определять центр композиции, и вызывать rotate(angle, cx, cy)

    @Override // BETA REALIZATION COMPLETE
    public void draw(GraphicComponent gr) {
        System.out.println(this.getName()+".draw()");
        Iterator<Shape> it = this.iterator();
        while(it.hasNext()) {
            Shape sh = it.next();
            System.out.println(sh.getName()+".draw()");
            sh.draw(gr);
        }
    }
    
    @Override
    public Shape find(String name) {
        Iterator<Shape> it = this.iterator();
        while (it.hasNext()) {
            Shape temp = it.next();
            if (temp.getName().equals(name)) {
                return temp;
            } else if (temp.isComposite()) {
                Shape temp2 = temp.find(name);
                if(temp2 != null) return temp2;
            }
        }
        return null;
        
    }
//==============================================================================    
//    // Iterator methods
//    @Override
//    public boolean hasNext() {
//        return 
//    }
//    @Override
//    public Shape next() {return null;} // необходимо добавить генерацию исключения
//    @Override
//    public void remove() {} //не уверен, что нужно использовать
    
}
