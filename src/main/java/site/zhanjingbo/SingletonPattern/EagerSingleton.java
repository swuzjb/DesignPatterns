package site.zhanjingbo.SingletonPattern;

/**
 * 饿汉单例模式
 * 
 * @author zhanjingbo
 *
 */
public class EagerSingleton {
	private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return EAGER_SINGLETON;
	}
}
