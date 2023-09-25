package icu.mabbit.learning.gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class TextTest
{
    public static void main(String[] args)
    {
        // 启动
        new MyFrame2();
    }
}

class MyFrame2
        extends Frame
{
    public MyFrame2()
    {
        TextField textField = new TextField();
        add(textField);

        // 监听文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        // 按下回车键即可触发
        textField.addActionListener(myActionListener2);

        // 设置替换文本
        // 在文本框中显示的是替换后的字符，实际获取的是输入的字符，类似输入密码时可将密码显示替换为星号
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}

class MyActionListener2
        implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TextField textField = (TextField) e.getSource(); // 获得资源（一个对象）
        System.out.println(textField.getText()); // 获得输入框的文本
        textField.setText(""); // 将文本框中的文本设置为空字符串，可清空文本框
    }
}