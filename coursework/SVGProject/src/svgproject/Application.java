/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svgproject;

import draw.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import shapes.*;

import java.util.HashMap;

import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JComponent;

/**
 *
 * @author alex
 */
public class Application extends javax.swing.JFrame {
    
    //==========================================================================
    private GraphicComponent graphic;
    
    private CompositeShapes picture;
    /*главная картинка-композиция. именно picture будет являться 
     * "корнем" всей картины */
    
    private HashMap<String, Shape> prototypes;
    
    private HashMap<String, Command> commands;
    
    
    //==========================================================================

    /**
     * Creates new form Application
     */
    
    public Application() {
        //super("SVG Editor");
        this.setTitle("SVG Editor");
        //this.setMaximizedBounds(Frame.MAXIMIZED_BOTH);
        //this.setm
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        initComponents();
        myInit();
    }
    
    private void myInit() {
        
        commandField.requestFocus();
        
        this.picture = new CompositeShapes();
        this.picture.setName("picture");
        
        this.graphic = new GraphicComponent();
        
        graphic.setReviewArea(800, 300); // ONLY FOR TESTS
        
        
        this.getRootPane().setDefaultButton(runButton);
        
//        //this.paintPanel.setLayout(new BoxLayout(paintPanel, BoxLayout.X_AXIS));
//        
//        
//        
//        System.out.println(this.mainPanel.getLayout().getClass().getName() + "!!!");
//        
//        //paintPanel.setSize(300, 300);
//        paintPanel.setPreferredSize(new Dimension(300, 300));
//        paintPanel.setMinimumSize(new Dimension(300, 300));
//        paintPanel.setMaximumSize(new Dimension(300, 300));
//        
//        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
//        
//        BoxLayout box = new BoxLayout(mainPanel, BoxLayout.X_AXIS);
//        
//        mainPanel.setLayout(box);
//        
//        paintPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
//        paintPanel.setAlignmentY(JComponent.CENTER_ALIGNMENT);
        
        
//        mainPanel.remove(paintPanel);
//        mainPanel.add(paintPanel, BorderLayout.CENTER);
//        
        //paintPanel.setSize(300, 300);
        
        //mainPanel.getLayout().removeLayoutComponent(paintPanel);
        
        this.prototypes = new HashMap<String, Shape>();
        
        prototypes.put("line", new Line()); 
        // намерено нет имени, что вызовет ошибку (возможно стоит присваивать стандартные)
        prototypes.put("rectangle", new Rectangle());
        prototypes.put("circle", new Circle());
        prototypes.put("comp", new CompositeShapes());
        
        this.commands = new HashMap<String, Command>();
        //======================================================================
        commands.put("add", new Command() { public void action(String[] a) {
            Shape temp = prototypes.get(a[0]).getCopy();
            temp.setName(a[1]);
            float[] params = new float[a.length-2];
            for (int i = 2; i < a.length; i++) {params[i-2] = Float.parseFloat(a[i]);}
            temp.setParameters(params);
            picture.add(temp);
        }});
        
        commands.put("rm", new Command() { public void action(String[] a) {
            picture.remove(a[0]);
        }});
        
        commands.put("cp", new Command() { public void action(String[] a) {
            Shape temp = picture.find(a[0]);
            temp = temp.getCopy();
            if(a.length == 1) {
                temp.setName(temp.getName() + Shape.COPY_SUFFIX);
            } else {
                temp.setName(a[1]);
            }
            picture.add(temp);
        }});
        
        commands.put("addto", new Command() { public void action(String[] a) {
            Shape temp = picture.find(a[0]);
            picture.remove(a[0]);
            if(a.length == 1) {
                picture.add(temp);
            } else {
                picture.find(a[1]).add(temp);
            }
        }});
        
        commands.put("move", new Command() { public void action(String[] a) {
            Shape temp = picture.find(a[0]);
            float[] params = new float[a.length-1];
            for (int i = 1; i < a.length; i++) {params[i-1] = Float.parseFloat(a[i]);}
            temp.move(params[0], params[1]);
        }});
        
        commands.put("scale", new Command() { public void action(String[] a) {
            graphic.setScale(Float.parseFloat(a[0]), Float.parseFloat(a[1]), Float.parseFloat(a[2]));
        }});
        
        commands.put("setRA", new Command() { public void action(String[] a) {
            graphic.setReviewArea(Float.parseFloat(a[0]), Float.parseFloat(a[1]));
        }});
        
        consoleArea.setText("Начало работы...");
        //javax.swing.JPanel j = new javax.swing.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        paintPanel = new javax.swing.JPanel() {
            public void paint(Graphics g) {
                super.paint(g);
                graphic.setGraphic(g);
                graphic.paingReviewArea();
                picture.draw(graphic);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        consoleArea = new javax.swing.JTextArea();
        commandField = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Редактор SVG"));

        paintPanel.setBackground(new java.awt.Color(255, 255, 255));
        paintPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        consoleArea.setEditable(false);
        consoleArea.setColumns(20);
        consoleArea.setLineWrap(true);
        consoleArea.setRows(5);
        jScrollPane1.setViewportView(consoleArea);

        runButton.setText("Выполнить");
        runButton.setFocusCycleRoot(true);
        runButton.setSelected(true);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(commandField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        //this.picture.add(new Line("line1",1, 1, 100, 100));
        parseConsole(commandField.getText());
        wtc(commandField.getText());
        commandField.setText("");
        //throw new IndexOutOfBoundsException();
    }//GEN-LAST:event_runButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }
    
    
    //==========================================================================
    public void wtc(String a) {
        this.consoleArea.setText(this.consoleArea.getText() + "\n" + a);
    }
    
    public void parseConsole(String arg) {
        String[] lexs = arg.split("[ ]");
        commands.get(lexs[0]).action(Arrays.copyOfRange(lexs, 1, lexs.length));
        paintPanel.repaint();
    }
    
    //==========================================================================
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField commandField;
    private javax.swing.JTextArea consoleArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel paintPanel;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
}

//paintPanel = new javax.swing.JPanel() {
//            public void paint(Graphics g) {
//                super.paint(g);
//                picture.draw(new GraphicComponent(g));
//            }
//        };
