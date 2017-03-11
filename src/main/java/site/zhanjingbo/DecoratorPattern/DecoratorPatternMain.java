package site.zhanjingbo.DecoratorPattern;

public class DecoratorPatternMain {
	
	public static void main(String[] args) {
		
		Compoent compoent = new ConcreteComponent();
		Decorator decorator = new ConcreteDecorator(compoent);
		decorator = new ConcreteDecoratorB(decorator);
		
		decorator.operation();
		
	}
}
