package zwl.learning.designpattern.singleton.separate;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:02
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
