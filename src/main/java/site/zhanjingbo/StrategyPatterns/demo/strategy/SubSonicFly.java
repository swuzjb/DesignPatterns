package site.zhanjingbo.StrategyPatterns.demo.strategy;

/**
 * 亚音速飞行策略的实现
 * 
 * @author zhanjingbo
 *
 */
public class SubSonicFly implements Fly {
	public void fly() {
		System.out.println("亚音速飞行");
	}
}
