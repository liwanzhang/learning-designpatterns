package zwl.learning.designpattern.factorymethod.multiplefactory;

import zwl.learning.designpattern.factorymethod.generalfactory.MailSender;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;
import zwl.learning.designpattern.factorymethod.generalfactory.SmsSender;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:44
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
