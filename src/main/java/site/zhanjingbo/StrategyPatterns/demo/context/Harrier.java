package site.zhanjingbo.StrategyPatterns.demo.context;

import site.zhanjingbo.StrategyPatterns.demo.strategy.SuperSonicFly;
import site.zhanjingbo.StrategyPatterns.demo.strategy.VerticalTakeOff;

/**
 * 鹞式战斗机
 * 
 * @author zhanjingbo
 *
 */
public class Harrier extends Plane {
	public Harrier() {
		this.fly = new SuperSonicFly();
		this.takeoff = new VerticalTakeOff();
	}
}
