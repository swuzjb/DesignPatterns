package site.zhanjingbo.SingletonPattern;

public class IoDHSingleton {

	private IoDHSingleton() {
	}

	private static class HolderClass {
		private static final IoDHSingleton SINGLETON = new IoDHSingleton();
	}

	public static IoDHSingleton getInstance() {
		return HolderClass.SINGLETON;
	}
}
