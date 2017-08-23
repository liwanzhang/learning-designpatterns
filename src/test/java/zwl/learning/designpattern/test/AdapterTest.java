package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.adapter.classadapter.Adapter;
import zwl.learning.designpattern.adapter.classadapter.Source;
import zwl.learning.designpattern.adapter.classadapter.Targetable;
import zwl.learning.designpattern.adapter.interfaceadapter.SourceSub1;
import zwl.learning.designpattern.adapter.interfaceadapter.SourceSub2;
import zwl.learning.designpattern.adapter.interfaceadapter.Sourceable;
import zwl.learning.designpattern.adapter.objectadapter.Wrapper;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:57
 */
public class AdapterTest {
    @Test
    public void adpterTest() {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    @Test
    public void objectAdpterTest() {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

    @Test
    public void interfaceAdpterTest() {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();

    }


}
