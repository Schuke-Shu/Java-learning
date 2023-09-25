package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>客户端测试类</h2>
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class Client
{
    public static void main(String[] args)
    {
        Searcher searcher; // 针对抽象编程，客户端无需分辨真实主题类和代理类
        searcher = (Searcher) XmlUtil.getBean();
        String result = searcher.doSearch("杨过", "玉女心经");
    }
}