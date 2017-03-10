package site.zhanjingbo.StrategyPatterns.demo.context;

import site.zhanjingbo.StrategyPatterns.demo.strategy.SubSonicFly;
import site.zhanjingbo.StrategyPatterns.demo.strategy.VerticalTakeOff;

/**
 * 直升机
 * 
 * @author zhanjingbo
 *
 */
public class Helicopter extends Plane {
	public Helicopter() {
		this.takeoff = new VerticalTakeOff();
		this.fly = new SubSonicFly();
	}
}
