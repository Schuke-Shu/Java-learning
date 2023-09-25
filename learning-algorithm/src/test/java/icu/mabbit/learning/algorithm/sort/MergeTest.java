package icu.mabbit.learning.algorithm.sort;

import org.junit.jupiter.api.Test;

import static icu.mabbit.learning.algorithm.sort.Data.TEST;

/**
 * <h2>归并排序测试</h2>
 *
 * @Module algorithm
 * @Date 2023-07-16 18:42 周日
 */
public class MergeTest
{
    @Test
    void test()
    {
//        System.out.println(Arrays.toString(TEST));

        long pre = System.currentTimeMillis();
        Merge.sort(TEST);
        long cur = System.currentTimeMillis();

//        System.out.println(Arrays.toString(TEST));

        System.out.println("排序完成，用时：" + (cur - pre) + "ms");
    }
}
