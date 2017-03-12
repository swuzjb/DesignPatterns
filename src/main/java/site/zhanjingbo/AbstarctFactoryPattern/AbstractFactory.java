package site.zhanjingbo.AbstarctFactoryPattern;

/**
 * 抽象工厂基类
 * 
 * @author zhanjingbo
 *
 */
public abstract class AbstractFactory {
	/**
	 * 生产A产品的具体实例
	 * 
	 * @return
	 */
	public abstract ProductA createProductA();

	/**
	 * 生产B产品的具体实例
	 * 
	 * @return
	 */
	public abstract ProductB createProductB();
}
