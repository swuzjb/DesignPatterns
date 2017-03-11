package site.zhanjingbo.SimpleFactoryPattern.demo;

/**
 * 圆形实现
 * 
 * @author zhanjingbo
 *
 */
public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("画一个圆");
	}

	@Override
	public void erase() {
		System.out.println("擦除一个圆");
	}

}
