package site.zhanjingbo.SimpleFactoryPattern;

/**
 * 简单工厂
 * 
 * @author zhanjingbo
 *
 */
public class SimpleFactory {
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ConcreteProductA();
			// 初始化设置product
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ConcreteProductB();
			// 初始化设置product
		}
		return product;
	}
}
