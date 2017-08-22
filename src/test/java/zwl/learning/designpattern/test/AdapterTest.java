package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.adapter.Adapter;
import zwl.learning.designpattern.adapter.Targetable;

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
}
