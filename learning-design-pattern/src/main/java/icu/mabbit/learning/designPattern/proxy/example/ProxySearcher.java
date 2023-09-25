package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>代理查询类</h2>
 * 充当代理主题角色，是查询代理，
 * 维持了对{@link RealSearcher 具体查询类对象}、{@link AccessValidator 身份验证类对象}、{@link Logger 日志记录类对象}的引用
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class ProxySearcher
        implements Searcher
{
    // 维持一个对真实主题的引用
    private final RealSearcher searcher = new RealSearcher();
    private final AccessValidator validator = new AccessValidator();
    private final Logger logger = new Logger();

    @Override
    public String doSearch(String userId, String keyword)
    {
        // 如果身份验证成功，执行查询
        if (validator.validate(userId))
        {
            // 调用真实主题对象的查询方法
            String result = searcher.doSearch(userId, keyword);
            // 记录查询日志
            logger.log(userId);
            // 返回查询结果
            return result;
        }
        else
            return null;
    }
}