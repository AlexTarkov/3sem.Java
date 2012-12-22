//package swingapplication;

/*
 * SwingApplication.java is a 1.4 example that requires
 * no other files.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SwingEdits implements DocumentListener, KeyListener {
    
    
    public void insertUpdate(DocumentEvent e) {
        sync(); 
    }
    public void removeUpdate(DocumentEvent e) {
        sync();
    }
    public void changedUpdate(DocumentEvent e) {}
    
    public void keyTyped(KeyEvent e) { 
        //sync(); System.out.print("1"); 
    }

    public void keyPressed(KeyEvent e) { 
        //sync(); System.out.print("1"); 
    }

    public void keyReleased(KeyEvent e) { 
        sync(); System.out.print("1"); 
    }
    
    final static String LOOKANDFEEL = null;
    
    private JTextField tff1,tff2;
    
    public Component createComponents() {
        
        JTextField tf1 = new JTextField("", 30);
        JTextField tf2 = new JTextField("", 30);
        //JTextField tf2 = new JTextField();
        
        this.tff1 = tf1;
        this.tff2 = tf2;
        //tff1.getDocument().addDocumentListener(this);
        //tff2.getDocument().addDocumentListener(this);
        
        tff1.addKeyListener(this);
        tff2.addKeyListener(this);
        
        //tf1.addInputMethodListener(this); //addActionListener(this);
        //tf1.addCaretListener(this);
        //tf2.addActionListener(this);

        JPanel pane = new JPanel(new GridLayout(0, 1));
        
        pane.add(tf1);
        pane.add(tf2);

        pane.setBorder(BorderFactory.createEmptyBorder(
                30, //top
                30, //left
                10, //bottom
                30) //right
                );
        return pane;

    }
    
    //==========================================================================
    
    public void sync() {
        if (tff1.getText().equals(tff2.getText())) return;
        if(tff1.hasFocus()) tff2.setText(tff1.getText());
        if(tff2.hasFocus()) tff1.setText(tff2.getText());
    }
    
    //==========================================================================
    
    
    
    public void inputMethodTextChanged(InputMethodEvent event) {
        //numClicks++;
        //label.setText(labelPrefix + numClicks);
        System.out.print("1");
        sync();
    }
    
    public void caretPositionChanged(InputMethodEvent event) {
        sync();
        System.out.print("1");
    }
    
    private static void initLookAndFeel() {
        
        // Swing allows you to specify which look and feel your program uses--Java,
        // GTK+, Windows, and so on as shown below.
        String lookAndFeel = null;
        
        if (LOOKANDFEEL != null) {
            if (LOOKANDFEEL.equals("Metal")) {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            } else if (LOOKANDFEEL.equals("System")) {
                lookAndFeel = UIManager.getSystemLookAndFeelClassName();
            } else if (LOOKANDFEEL.equals("Motif")) {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            } else if (LOOKANDFEEL.equals("GTK+")) { //new in 1.4.2
                lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            } else {
                System.err.println("Unexpected value of LOOKANDFEEL specified: "
                        + LOOKANDFEEL);
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
            }
            
            try {
                UIManager.setLookAndFeel(lookAndFeel);
            } catch (ClassNotFoundException e) {
                System.err.println("Couldn't find class for specified look and feel:"
                        + lookAndFeel);
                System.err.println("Did you include the L&F library in the class path?");
                System.err.println("Using the default look and feel.");
            } catch (UnsupportedLookAndFeelException e) {
                System.err.println("Can't use the specified look and feel ("
                        + lookAndFeel
                        + ") on this platform.");
                System.err.println("Using the default look and feel.");
            } catch (Exception e) {
                System.err.println("Couldn't get specified look and feel ("
                        + lookAndFeel
                        + "), for some reason.");
                System.err.println("Using the default look and feel.");
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Set the look and feel.
        initLookAndFeel();
        
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        JFrame frame = new JFrame("SwingApplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SwingEdits app = new SwingEdits();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);
        
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