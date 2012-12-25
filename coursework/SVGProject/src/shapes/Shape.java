package shapes;

import draw.GraphicComponent;
import java.util.*;

/**
 *
 * @author alex
 */
public abstract class Shape implements Prototype<Shape>, Memento, Iterable<Shape> {
    
    private String name;
    
    public static final String COPY_SUFFIX = "_c"; //по хорошему бы счетчик
    //паблик только для доступа из CompositeShapes
    //ВООБЩЕ ЧТО ОН ТУТ ДЕЛАЕТ??? ГДЕ ЭТО ДОЛЖНО БЫТЬ??
    
    // Prototype methods
    @Override
    public abstract Shape getCopy();
        
    // Iterable methods
    @Override
    public Iterator<Shape> iterator() {return null;} // необходимо добавить генерацию исключения
    
    
    // Shape methods
    public void add(Shape a) {} // необходимо добавить генерацию исключения
    public void remove(String name) {} // необходимо добавить генерацию исключения
    //с другой стороны логично было бы ничего не делать, если пришел запрос на, 
    //фактически, удаление потомка с определенным именем
    public boolean isComposite() {
        return false;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void setParameters(float[] params);
    public abstract void move(float px, float py);
    public abstract void rotate(float angle, float x, float y); // прыжок выше головы по времени. можно не успеть.
    public abstract void rotate(float angle); // относительно центра
    public abstract void draw(GraphicComponent gr);
    
    public Shape find(String name) {
        //сознательно нет проверки на себя, возможно зря
        return null;
    }
    
//    public static Shape getByName(Shape p, String name) {
//        Shape res;
//        
//        if (!p.isComposite()) {}; //бросить эксепшн
//        
//        Iterator<Shape> it = p.iterator(); // хотя возможно тут уже кинется эксепнш
//        while(it.hasNext()) {
//            Shape temp = it.next();
//            if(temp.getName().equals(name)) {
//                return temp;
//            } else if(temp.isComposite()) {
//                
//            }
//        }
//        
//    }
    
//==============================================================================
//    // Iterator methods
//    @Override
//    public boolean hasNext() {return false;}
//    @Override
//    public Shape next() {return null;} // необходимо добавить генерацию исключения
//    @Override
//    public void remove() {} //не уверен, что нужно использовать

    
}
