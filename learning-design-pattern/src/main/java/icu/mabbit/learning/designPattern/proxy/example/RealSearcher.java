package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>具体查询类</h2>
 * 充当真实主题角色，实现查询功能，提供{@link #doSearch(String, String)}方法查询信息
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class RealSearcher
        implements Searcher
{
    /**
     * 模拟查询商务信息
     */
    @Override
    public String doSearch(String userId, String keyword)
    {
        System.out.println("用户'" + userId + "'使用关键词'" + keyword + "'查询商务信息！");
        return SUCCESS;
    }
}