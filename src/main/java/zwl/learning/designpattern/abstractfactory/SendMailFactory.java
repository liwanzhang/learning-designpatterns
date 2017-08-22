package zwl.learning.designpattern.abstractfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:27
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}
