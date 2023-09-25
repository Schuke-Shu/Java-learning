package icu.mabbit.learning.gui.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * <p>Panel可以看成是一个空间，但是不能单独存在</p>
 *
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class PanelTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();
        Panel panel = new Panel();

        // 设置布局
        frame.setLayout(null);
        // 坐标
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(
                new Color(40, 161, 35)
        );

        // Panel设置坐标
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(
                new Color(193, 15, 60)
        );

        frame.add(panel);
        frame.setVisible(true);

        // 监听事件
        // 监听窗口关闭事件，System.exit(0)
        frame.addWindowListener(
                // 窗口关闭时
                new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent e)
                    {
                        // 结束程序
                        System.exit(0);
                    }
                }
        );
    }
}