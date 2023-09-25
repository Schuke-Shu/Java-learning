package icu.mabbit.learning.designPattern.proxy.example;

/**
 * <h2>身份验证类（业务类）</h2>
 * 提供{@link #validate(String)}方法实现身份验证
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class AccessValidator
{
    /**
     * 模拟实现登录验证
     */
    public boolean validate(String userId)
    {
        System.out.println("在数据库中验证用户'" + userId + "'是否为合法用户");
        if (userId.equalsIgnoreCase("杨过"))
        {
            System.out.println('\'' + userId + "'登录成功！");
            return true;
        }
        else
        {
            System.out.println('\'' + userId + "'登录失败！");
            return false;
        }
    }
}