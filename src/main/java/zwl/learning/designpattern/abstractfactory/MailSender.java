package zwl.learning.designpattern.abstractfactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 上午11:22
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
