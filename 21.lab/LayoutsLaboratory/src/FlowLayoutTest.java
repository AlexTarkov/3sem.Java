/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
    public static void main(String[] args) {
        // создаем фрейм и устанавливаем его размер.
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 100);
        jf.setVisible(true);

        // создаем панель.
        //JPanel p = new JPanel();
        //jf.add(p);
        
        FlowLayout experimentLayout = new FlowLayout();
        
        jf.setLayout(experimentLayout);
        
        experimentLayout.setAlignment(FlowLayout.TRAILING);

        // к панели добавляем менеджер BorderLayout.
        //p.setLayout();

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.
        jf.add(new JButton("1111"));
        //jf.getLayout().
        jf.add(new JButton("2222222222222222222"));
        jf.add(new JButton("3"));
        jf.add(new JButton("4444444444444"));
        jf.add(new JButton("5"));
        
        jf.pack();
    }
}
