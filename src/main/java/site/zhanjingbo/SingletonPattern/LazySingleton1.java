package site.zhanjingbo.SingletonPattern;

/**
 * 懒汉单例实现方式1
 * 
 * @author zhanjingbo
 *
 */
public class LazySingleton1 {
	private static LazySingleton1 instance = null;

	private LazySingleton1() {
	}

	synchronized public static LazySingleton1 getInstance() {
		if (instance == null) {
			instance = new LazySingleton1();
		}
		return instance;
	}
}
