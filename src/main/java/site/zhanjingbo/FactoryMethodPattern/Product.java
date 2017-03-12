package site.zhanjingbo.FactoryMethodPattern;

/**
 * 产品抽象类
 * 
 * @author zhanjingbo
 *
 */
public abstract class Product {
	// 公共方法的实现
	public void methodSame() {
		System.out.println("通用实现");
	}

	// 声明抽象业务方法
	public abstract void methodDiff();
}
