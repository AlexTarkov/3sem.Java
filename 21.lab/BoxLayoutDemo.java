//import java.awt.Component;
//import java.awt.Container;
//import javax.swing.BoxLayout;
//import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
//import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BoxLayoutDemo {
    public static void addComponentsToPane(Container pane) {
        
        //pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        //pane.setLayout(new BorderLayout());
        
//        JPanel[] jpmas = new JPanel[4];
//
//        LayoutManager[] lmmas = {new BorderLayout(), new FlowLayout(), 
//            new GridLayout(), new GridBagLayout() };
//        JPanel jp;
//        for (int i=0; i < jpmas.length; i++) {
//            jpmas[i] = new JPanel();
//            jp = jpmas[i];
//            jp.setBorder(new LineBorder(Color.black));
//            jp.add(new JButton("first button"));
//            jp.add(new JButton("second button"));
//            jp.add(new JButton("3 button"));
//            jp.add(new JButton("4"));
//            jp.add(new JButton("555"));
//            jp.setLayout(lmmas[i]);
//            pane.add(jp);
//        }
        
//        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
//
//        addAButton("Button 1", pane);
//        addAButton("Button 2", pane);
//        addAButton("Button 3", pane);
//        addAButton("Long-Named Button 4", pane);
//        addAButton("5", pane);
    }

    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("BoxLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
