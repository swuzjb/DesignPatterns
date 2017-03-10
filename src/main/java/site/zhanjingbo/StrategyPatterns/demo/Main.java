package site.zhanjingbo.StrategyPatterns.demo;

import site.zhanjingbo.StrategyPatterns.demo.context.Helicopter;
import site.zhanjingbo.StrategyPatterns.demo.context.Plane;

/**
 * 测试类
 * 
 * @author zhanjingbo
 *
 */
public class Main {
	public static void main(String[] args) {
		Plane plane = new Helicopter();
		plane.TakeOff();
	}
}
