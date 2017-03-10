package site.zhanjingbo.StrategyPatterns.demo.context;

import site.zhanjingbo.StrategyPatterns.demo.strategy.LongDistanceTakeOff;
import site.zhanjingbo.StrategyPatterns.demo.strategy.SubSonicFly;

/**
 * 客机的实现类
 * 
 * @author zhanjingbo
 *
 */
public class AirPlane extends Plane {
	public AirPlane() {
		this.takeoff = new LongDistanceTakeOff();
		this.fly = new SubSonicFly();
	}
}
