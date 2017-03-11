package site.zhanjingbo.DecoratorPattern;

/**
 * 装饰基类，引入组件
 * 
 * @author zhanjingbo
 *
 */
public class Decorator implements Compoent {

	private Compoent compoent;

	public Decorator(Compoent compoent) {
		this.compoent = compoent;
	}

	public void operation() {
		this.compoent.operation();
	}

}
