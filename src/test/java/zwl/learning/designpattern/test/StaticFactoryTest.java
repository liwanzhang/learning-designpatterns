package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;
import zwl.learning.designpattern.factorymethod.staticfactory.SendFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午4:25
 */
public class StaticFactoryTest {
    @Test
    public void staticFactoryTest() {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
