package site.zhanjingbo.SimpleFactoryPattern.demo;

/**
 * 形状制造简单工厂
 * 
 * @author zhanjingbo
 *
 */
public class ShapeFactory {
	public static Shape createShape(String str) {
		Shape shape = null;
		switch (str) {
		case "Circle":
			shape = new Circle();
			break;
		case "Square":
			shape = new Square();
			break;
		case "Triangle":
			shape = new Triangle();
			break;
		default:
			throw new UnSupportedShapeException();
		}
		return shape;
	}
}
