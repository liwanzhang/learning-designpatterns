package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.abstractfactory.Provider;
import zwl.learning.designpattern.abstractfactory.SendMailFactory;
import zwl.learning.designpattern.abstractfactory.Sender;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:29
 */
public class AbstractFactoryTest {
    @Test
    public void abstractFactoryTest() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
