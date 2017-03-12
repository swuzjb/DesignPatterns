package site.zhanjingbo.AbstarctFactoryPattern;

/**
 * 抽象方法的具体实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteFactoryTwo extends AbstractFactory {
	@Override
	public ProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public ProductB createProductB() {
		return new ConcreteProductB2();
	}
}
