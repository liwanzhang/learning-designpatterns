package zwl.learning.designpattern.factorymethod.generalfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-21 下午2:32
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}