package site.zhanjingbo.SimpleFactoryPattern.demo;

/**
 * 正方形实现类
 * 
 * @author zhanjingbo
 *
 */
public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("画一个正方形");
	}

	@Override
	public void erase() {
		System.out.println("消除一个正方形");
	}

}
