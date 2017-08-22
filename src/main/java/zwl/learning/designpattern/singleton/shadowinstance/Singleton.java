package zwl.learning.designpattern.singleton.shadowinstance;

import java.util.Vector;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-22 下午6:07
 */
public class Singleton {

    private static Singleton instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

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

    public void updateProperties() {
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }
}