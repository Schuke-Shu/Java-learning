package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>日志记录类（业务类）</h2>
 * 提供{@link #log(String)}方法保存日志
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class Logger
{
    /**
     * 模拟实现日志记录
     */
    public void log(String userId)
    {
        System.out.println("更新数据库，用户'" + userId + "'查询次数加1！");
    }
}