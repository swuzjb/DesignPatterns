package site.zhanjingbo.SingletonPattern;

/**
 * 懒汉单例实现方式1
 * 
 * @author zhanjingbo
 *
 */
public class LazySingleton2 {
	private volatile static LazySingleton2 instance = null;

	private LazySingleton2() {
	}

	public static LazySingleton2 getInstance() {
		if (instance == null) {
			synchronized (LazySingleton2.class) {
				if (instance == null) {
					instance = new LazySingleton2();
				}
			}
		}
		return instance;
	}
}
