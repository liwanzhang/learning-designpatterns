package zwl.learning.designpattern.factorymethod.generalfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-21 下午2:27
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}