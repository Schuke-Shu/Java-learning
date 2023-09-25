package icu.mabbit.learning.designPattern.proxy.example;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * <h2>XML工具类</h2>
 *
 * @Module design-pattern
 * @Date 2023-07-16 11:38
 */
public class XmlUtil
{
    public static Object getBean()
    {
        try
        {
            // 创建DOM文档对象
            Document doc =
                    DocumentBuilderFactory
                            .newInstance()
                            .newDocumentBuilder()
                            .parse(
                                    new File(
                                            "design-pattern\\src\\main\\java\\icu\\mabbit\\learning\\designPattern\\proxy\\example\\config.xml"
                                    )
                            );

            // 获取包含类名的文本节点
            String className =
                    doc
                            .getElementsByTagName("className")
                            .item(0)
                            .getFirstChild()
                            .getNodeValue();

            // 通过类名生成实例对象并将其返回
            return Class.forName(className).newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}