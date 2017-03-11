package site.zhanjingbo.SimpleFactoryPattern;

public class SimpleFactoryPatternMain {
	public static void main(String[] args) {
		Product product;
		product = SimpleFactory.getProduct("A"); // 通过工厂类创建产品对象
		product.methodSame();
		product.methodDiff();
	}
}
