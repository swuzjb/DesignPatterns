package site.zhanjingbo.DecoratorPattern;

/**
 * 装饰组件的具体实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Compoent component) {
		super(component);
	}

	public void operation() {
		super.operation();
		this.addOperation();
	}

	private void addOperation() {
		System.out.println("装饰扩展B");
	}
}
