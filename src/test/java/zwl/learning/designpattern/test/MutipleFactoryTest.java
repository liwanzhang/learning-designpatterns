package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;
import zwl.learning.designpattern.factorymethod.multiplefactory.SendFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午4:23
 */
public class MutipleFactoryTest {
    @Test
    public void mutipleFactoryTest() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
