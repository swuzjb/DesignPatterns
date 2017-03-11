package site.zhanjingbo.DecoratorPattern;

/**
 * 装饰组件的具体实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Compoent component) {
		super(component);
	}

	public void operation() {
		super.operation();
		this.addOperation();
	}

	private void addOperation() {
		System.out.println("装饰扩展");
	}
}
