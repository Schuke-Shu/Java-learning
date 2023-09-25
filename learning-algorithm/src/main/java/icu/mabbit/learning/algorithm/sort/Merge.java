package icu.mabbit.learning.algorithm.sort;

/**
 * <h2>归并排序</h2>
 *
 * <p>
 *     递归分解待排序的n个元素的序列为两份n/2个元素的子序列，在分解的同时排序，当待排序的长度为1时，递归“回升”
 * </p>
 *
 * <p>
 *     关键操作是已排序的子序列的合并，
 *     通过一个辅助过程{@code MERGE(A, p, q, r)}完成，其中A是一个数组，p、q和r是数组下标，满足<code>p&lt;=q&lt;r</code>。
 *     该过程假设子数组A[p..q]和A[q+1..r]都已排好序，它合并这两个子数组形成单一的已排好的子数组代替当前的子数组A[p..r]。
 * </p>
 *
 * <p>辅助过程{@code MERGE}需要的时间为{@code Θ(n)}，{@code n=r-p+1}是待合并元素的总数</p>
 *
 * <p>
 *     假设有两个子序列，都已排序，它们的合并步骤：
 *     <ol>
 *         <li>从两个序列的一端取出较大或较小的一个元素放入输出序列</li>
 *         <li>重复步骤一，直至一个序列为空</li>
 *         <li>将另一个序列剩余的元素放入输出序列</li>
 *     </ol>
 * </p>
 *
 * <p>因为只是从两个序列中各取一个元素比较，所以每个基本步骤需要常量时间，因为最多执行n个基本步骤，所以合并需要Θ(n)的时间</p>
 * <br>
 *
 * @Module algorithm
 * @Date 2023-07-16 16:52
 */
public class Merge
{
    /**
     * <h3>门面方法，用于接收数组</h3>
     * 性能测试：
     * <ol>
     *      <li>58ms</li>
     *      <li>62ms</li>
     *      <li>63ms</li>
     *      <li>61ms</li>
     *      <li>60ms</li>
     * </ol>
     * 数据量：十万个1-10000之间的随机数
     * <ol>
     *      <li>1326ms</li>
     *      <li>1294ms</li>
     *      <li>1312ms</li>
     *      <li>1313ms</li>
     *      <li>1310ms</li>
     * </ol>
     * 数据量：一千万个1-10000之间的随机数
     */
    public static void sort(int[] A) {sort(A, 0, A.length - 1);}

    /**
     * 排序
     */
    private static void sort(int[] A, int p, int r)
    {
        // p大于等于r时，递归结束
        if (p >= r) return;

        // 折半递归
        int q = (p + r) / 2;
        sort(A, p, q);
        sort(A, q + 1, r);

        // 合并
        merge(A, p, q, r);
    }

    /**
     * 合并
     */
    private static void merge(int[] A, int p, int q, int r)
    {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++)
            L[i] = A[p + i];
        for (int i = 0; i < n2; i++)
            R[i] = A[q + i + 1];

        // 哨兵值
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++)
            if (L[i] <= R[j])
                A[k] = L[i++];
            else
                A[k] = R[j++];
    }
}
