package site.zhanjingbo.StrategyPatterns;

/**
 * 策略模式调用展示
 * 
 * @author zhanjingbo
 *
 */
public class StrategyPatternMain {
	public static void main(String[] args) {
		Strategy strategyA = new ConcreteStrategyA();
		Context context = new Context(strategyA);
		context.algorihm();

		context.setStrategy(new ConcreteStrategyB());
		context.algorihm();
	}

}
