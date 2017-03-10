package site.zhanjingbo.StrategyPatterns.demo.strategy;

/**
 * 超音速飞行策略的实现
 * 
 * @author zhanjingbo
 *
 */
public class SuperSonicFly implements Fly {
	public void fly() {
		System.out.println("超音速飞行");
	}
}
