package site.zhanjingbo.StrategyPatterns.demo.strategy;

/**
 * 垂直起飞的实现
 * 
 * @author zhanjingbo
 *
 */
public class VerticalTakeOff implements TakeOff {

	public void takeOff() {
		System.out.println("垂直起飞");
	}

}
