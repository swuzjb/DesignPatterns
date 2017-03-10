package site.zhanjingbo.StrategyPatterns.demo.context;

import site.zhanjingbo.StrategyPatterns.demo.strategy.LongDistanceTakeOff;
import site.zhanjingbo.StrategyPatterns.demo.strategy.SuperSonicFly;

/**
 * 歼击机实现类
 * 
 * @author zhanjingbo
 *
 */
public class Fighter extends Plane {
	public Fighter() {
		this.takeoff = new LongDistanceTakeOff();
		this.fly = new SuperSonicFly();
	}
}
