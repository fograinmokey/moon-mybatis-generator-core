package com.moon.mybatis.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
public class Generator {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                GeneratorFrame frame = new GeneratorFrame();
                frame.setTitle("MyBatis Generator, Made By quzile!"); //
                frame.setLocation((dim.width - frame.getWidth()) / 2, (dim.height - frame.getHeight()) / 2);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
