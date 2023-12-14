package cn.mabbit.learning.basic.jdk8.basic;

/**
 * <h2>标签</h2>
 *
 * @Date 2023/11/3 21:05
 */
public class Label
{
    public static void main(String... args)
    {
        // 标签用于标记一个语句或语句块，break或continue操作标签时相当于该标签对应的语句或语句块中执行了一次break或continue
        label:
        for (int i = 1; i < 10; i++)
        {
            System.out.println("outside: " + i);
            for (int j = 1; j < 10; j++)
            {
                System.out.println("inside: " + j);
                if (j == 6)
                    break label;
            }
        }
    }
}