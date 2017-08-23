package zwl.learning.designpattern.adapter.objectadapter;

import zwl.learning.designpattern.adapter.classadapter.Source;
import zwl.learning.designpattern.adapter.classadapter.Targetable;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-23 下午3:56
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}

