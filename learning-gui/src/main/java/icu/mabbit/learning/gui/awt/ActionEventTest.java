package icu.mabbit.learning.gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class ActionEventTest
{
    public static void main(String[] args)
    {
        // 按下按钮，触发事件
        Frame frame = new Frame();
        Button button = new Button();

        // addActionListener()需要一个ActionListener，所以构造一个ActionListener
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.add(button, BorderLayout.CENTER);
        frame.pack();

        windowClose(frame);
        frame.setVisible(true);
    }

    // 添加关闭窗口事件
    private static void windowClose(Frame frame)
    {
        frame.addWindowListener(
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

class MyActionListener
        implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("action");
    }
}