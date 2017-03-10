package site.zhanjingbo.StrategyPatterns;

/**
 * 环境类，调用策略的实例
 * 
 * @author zhanjingbo
 *
 */
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	/**
	 * 策略调用
	 */
	public void algorihm() {
		this.strategy.algorithm();
	}
	/**
	 * 动态设置策略
	 * 
	 * @param strategy
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
