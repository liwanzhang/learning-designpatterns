package zwl.learning.designpattern.abstractfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:26
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
