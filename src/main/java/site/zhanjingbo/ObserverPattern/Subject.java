package site.zhanjingbo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题的实现类，如有需要可以进一步将此类抽象
 * 
 * @author zhanjingbo
 *
 */
public class Subject {
	/**
	 * 维护所有观察者的队列
	 */
	private List<Observer> observers = new ArrayList<Observer>();

	/**
	 * 将观察者添加入通知队列
	 * 
	 * @param obs
	 */
	public void attach(Observer obs) {
		this.observers.add(obs);
	}

	/**
	 * 将观察者移除出通知队列
	 * 
	 * @param obs
	 */
	public void detach(Observer obs) {
		this.observers.remove(obs);
	}

	/**
	 * 通知所有观察者
	 */
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
