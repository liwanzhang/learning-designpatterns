package zwl.learning.designpattern.command;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-21 下午2:09
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
