package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.command.Command;
import zwl.learning.designpattern.command.Invoker;
import zwl.learning.designpattern.command.MyCommand;
import zwl.learning.designpattern.command.Receiver;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-21 下午2:18
 */
public class CommandTest {
    @Test
    public void commandTest() {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
