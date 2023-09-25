package icu.mabbit.learning.algorithm.sort;

/**
 * <h2>测试数据</h2>
 *
 * @Module algorithm
 * @Date 2023-07-16 11:41 周日
 */
public class Data
{
    public static final int[] TEST;

    static {
        TEST = new int[100000];

        for (int i = 0; i < TEST.length; i++)
            TEST[i] = (int) (Math.random() * 10000 + 1);
    }
}