package icu.mabbit.learning.gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class ActionEventTest2
{
    public static void main(String[] args)
    {
        // 连个按钮实现同一个监听
        // 开始-停止
        Frame frame = new Frame("开始-停止");
        Button start = new Button("start");
        Button stop = new Button("stop");

        start.setActionCommand("start");
        stop.setActionCommand("stop");

        MyMonitor myMonitor = new MyMonitor();
        start.addActionListener(myMonitor);
        stop.addActionListener(myMonitor);

        frame.add(start, BorderLayout.NORTH);
        frame.add(stop, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}

class MyMonitor
        implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("按钮被点击了，msg：" + e.getActionCommand());
    }
}