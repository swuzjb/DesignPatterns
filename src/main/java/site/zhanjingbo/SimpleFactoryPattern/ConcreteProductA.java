package site.zhanjingbo.SimpleFactoryPattern;

/**
 * 产品具体实现A
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteProductA extends Product {

	@Override
	public void methodDiff() {
		System.out.println("具体产品A的特性实现");
	}

}
