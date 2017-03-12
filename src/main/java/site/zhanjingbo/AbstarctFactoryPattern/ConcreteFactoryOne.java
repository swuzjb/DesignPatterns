package site.zhanjingbo.AbstarctFactoryPattern;

/**
 * 抽象方法的具体实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteFactoryOne extends AbstractFactory {
	@Override
	public ProductA createProductA() {
		return new ConcreteProductA();
	}

	@Override
	public ProductB createProductB() {
		return new ConcreteProductB();
	}
}
