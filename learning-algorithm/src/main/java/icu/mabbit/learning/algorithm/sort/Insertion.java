package icu.mabbit.learning.algorithm.sort;

/**
 * <h2>插入排序</h2>
 *
 * <p>遍历数组，将每个元素向一端移位，直到正确位置</p>
 *
 * <p><i>类似与玩扑克牌时，从牌堆中抽牌然后在手中依次比对直到正确位置</i></p>
 *
 * <p><strong>适用于少量元素的排序，最坏运行时长：{@code Θ(n^2)}</strong></p>
 * <br>
 *
 * @Module algorithm
 * @Date 2023-07-16 11:38
 */
public class Insertion
{
    /**
     * 性能测试：
     * <ol>
     *      <li>618ms</li>
     *      <li>632ms</li>
     *      <li>641ms</li>
     *      <li>611ms</li>
     *      <li>610ms</li>
     * </ol>
     * 数据量：十万个1-10000之间的随机数
     */
    public static void sort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp)
                arr[j + 1] = arr[j--];
            arr[j + 1] = temp;
        }
    }
}
