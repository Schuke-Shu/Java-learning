package cn.mabbit.learning.basic.jdk8.basic;

/**
 * <h2>子类</h2>
 *
 * @Date 2023/11/3 22:06
 */
public class Child
        extends Parent
{
    static
    {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child block");
    }

    Child()
    {
        System.out.println("Child constructor");
    }
}