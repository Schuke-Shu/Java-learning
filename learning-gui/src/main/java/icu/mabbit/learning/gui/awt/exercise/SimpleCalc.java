package icu.mabbit.learning.gui.awt.exercise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <h2>简易计算器</h2>
 *
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class SimpleCalc extends Frame
{
    public SimpleCalc()
    {
        // 三个文本框
        TextField n1 = new TextField(10); // 字符数
        TextField n2 = new TextField(10); // 字符数
        TextField n3 = new TextField(20); // 字符数

        // 一个按钮
        Button button = new Button("=");
        button.addActionListener(
                e ->
                {
                    // 1. 获取被加数与加数
                    int i1 = Integer.parseInt(n1.getText());
                    int i2 = Integer.parseInt(n2.getText());

                    // 3. 进行加法操作，然后清除框中内容
                    String s = Integer.toString(i1 + i2);
                    n1.setText("");
                    n2.setText("");

                    // 2. 将结果放入结果框
                    n3.setText(s);
                }
        );

        // 一个标签
        Label label = new Label("+");

        // 布局
        setLayout(new FlowLayout());

        add(n1);
        add(label);
        add(n2);
        add(button);
        add(n3);

        pack();
        setVisible(true);
        addWindowListener(
                new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );
    }
}