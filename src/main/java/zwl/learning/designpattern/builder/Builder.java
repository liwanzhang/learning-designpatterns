package zwl.learning.designpattern.builder;

import zwl.learning.designpattern.factorymethod.generalfactory.MailSender;
import zwl.learning.designpattern.factorymethod.generalfactory.Sender;
import zwl.learning.designpattern.factorymethod.generalfactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:16
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
