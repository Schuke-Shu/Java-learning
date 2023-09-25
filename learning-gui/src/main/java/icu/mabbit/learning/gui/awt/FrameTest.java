package icu.mabbit.learning.gui.awt;

import java.awt.*;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class FrameTest
{
    public static void main(String[] args)
    {
//        Frame frame = new Frame(); // 默认标题为""
        Frame frame = new Frame("Java图形界面窗口");
        // 设置窗口是否可见
        frame.setVisible(true);
        // 设置窗口大小
        frame.setSize(400, 400);
        // 设置背景颜色
        frame.setBackground(
                new Color(85, 150, 68)
        );
        // 初始位置
        frame.setLocation(200, 200);
        // 设置是否可调整窗口大小
        frame.setResizable(false);
    }
}