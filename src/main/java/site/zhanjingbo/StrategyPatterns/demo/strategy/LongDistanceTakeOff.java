package site.zhanjingbo.StrategyPatterns.demo.strategy;

/**
 * 长距离起飞的策略实现
 * 
 * @author zhanjingbo
 *
 */
public class LongDistanceTakeOff implements TakeOff {
	public void takeOff() {
		System.out.println("长距离起飞");
	}
}
