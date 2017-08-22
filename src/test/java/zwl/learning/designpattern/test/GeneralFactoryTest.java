package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.factorymethod.generalfactory.SendFactory;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:15
 */
public class GeneralFactoryTest {
    @Test
    public void generalFactoryTest() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
