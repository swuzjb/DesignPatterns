package site.zhanjingbo.FactoryMethodPattern;

/**
 * 工厂方法的具体实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteFactoryB implements AbstarctFactory {

	@Override
	public Product createProduct() {
		return new ConcreteProductB();
	}

}
