/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutTest {
    public static void main(String[] args) {
        // создаем фрейм и устанавливаем его размер.
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setVisible(true);

        // создаем панель.
        //JPanel p = new JPanel();
        //jf.add(p);
        
        GridBagLayout experimentLayout = new GridBagLayout();
        
        jf.setLayout(experimentLayout);
        
        GridBagConstraints c = new GridBagConstraints();
        
        jf.setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.HORIZONTAL;

        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        jf.add(new JButton("Button 1"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        jf.add(new JButton("Button 2"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        jf.add(new JButton("Button 3"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        jf.add(new JButton("Long-Named Button 4"), c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        jf.add(new JButton("5"), c);
        
        jf.pack();
        
        //experimentLayout.setAlignment(FlowLayout.TRAILING);

        // к панели добавляем менеджер BorderLayout.
        //p.setLayout();

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.
//        jf.add(new JButton("1111"));
//        //jf.getLayout().
//        jf.add(new JButton("2222222222222222222"));
//        jf.add(new JButton("3"));
//        jf.add(new JButton("4444444444444"));
//        jf.add(new JButton("5"));
    }
}
