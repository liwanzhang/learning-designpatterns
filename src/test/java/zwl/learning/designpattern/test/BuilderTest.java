package zwl.learning.designpattern.test;

import org.junit.Test;
import zwl.learning.designpattern.builder.Builder;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:18
 */
public class BuilderTest {
    @Test
    public void builderTest() {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
