package icu.mabbit.learning.gui.awt;

import java.awt.*;

/**
 * @Module gui
 * @Date 2023-07-16 11:38
 */
public class BorderLayoutTest
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("BorderLayout");

        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}