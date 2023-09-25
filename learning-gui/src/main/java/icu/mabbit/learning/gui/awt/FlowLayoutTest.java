package icu.mabbit.learning.gui.awt;

import java.awt.*;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class FlowLayoutTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame();

        // 组件-按钮
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");

        // 设置为流式布局
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(200, 200);

        // 添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}