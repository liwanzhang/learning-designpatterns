package zwl.learning.designpattern.abstractfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:28
 */
public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
