/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest {
    public static void main(String[] args) {
        // создаем фрейм и устанавливаем его размер.
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300, 300);
        jf.setVisible(true);

        // создаем панель.
        //JPanel p = new JPanel();
        //jf.add(p);
        
        jf.setLayout(new BorderLayout());

        // к панели добавляем менеджер BorderLayout.
        //p.setLayout();

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.
        jf.add(new JButton("1111"), BorderLayout.NORTH);
        //jf.getLayout().
        jf.add(new JButton("222"), BorderLayout.WEST);
        jf.add(new JButton("3"), BorderLayout.CENTER);
        jf.add(new JButton("444"), BorderLayout.EAST);
        jf.add(new JButton("5"), BorderLayout.SOUTH);
        
        jf.pack();
    }
}
