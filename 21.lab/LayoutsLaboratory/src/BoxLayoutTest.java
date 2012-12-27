/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutTest {
    
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    
    private static void createAndShowGUI() {
        // Создание фрейма
        
    }

    public static void main(String[ ] args) {
        // запустить приложение
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                Container pane = frame.getContentPane();
                
                pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
                
                addAButton("111", pane);
                addAButton("2", pane);
                addAButton("3333333333333333", pane);
                addAButton("444", pane);
                addAButton("5", pane);
                
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
