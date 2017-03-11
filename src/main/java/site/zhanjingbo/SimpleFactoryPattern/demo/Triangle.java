package site.zhanjingbo.SimpleFactoryPattern.demo;

/**
 * 三角形
 * 
 * @author zhanjingbo
 *
 */
public class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("画一个三角形");
	}

	@Override
	public void erase() {
		System.out.println("消除一个三角形");
	}

}
