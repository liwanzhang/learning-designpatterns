package zwl.learning.designpattern.factorymethod.staticfactory;

import zwl.learning.designpattern.factorymethod.generalfactory.MailSender;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;
import zwl.learning.designpattern.factorymethod.generalfactory.SmsSender;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:47
 */
public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
