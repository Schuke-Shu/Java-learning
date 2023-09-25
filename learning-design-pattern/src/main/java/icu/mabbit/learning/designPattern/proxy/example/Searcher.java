package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>抽象查询类</h2>
 * 充当抽象主题角色，声明了{@link #doSearch(String, String)}方法
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public interface Searcher
{
    String SUCCESS = "查询成功！";

    String doSearch(String userId, String keyword);
}