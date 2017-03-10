package site.zhanjingbo.StrategyPatterns.demo.context;

import site.zhanjingbo.StrategyPatterns.demo.strategy.Fly;
import site.zhanjingbo.StrategyPatterns.demo.strategy.TakeOff;

/**
 * 飞机的基类
 * 
 * @author zhanjingbo
 *
 */
public class Plane {
	protected TakeOff takeoff;
	protected Fly fly;

	/**
	 * 起飞特征
	 */
	public void TakeOff() {
		takeoff.takeOff();
	}

	/**
	 * 飞行特征
	 */
	public void fly() {
		fly.fly();
	}

}
