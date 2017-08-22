package zwl.learning.designpattern.adapter;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:41
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
