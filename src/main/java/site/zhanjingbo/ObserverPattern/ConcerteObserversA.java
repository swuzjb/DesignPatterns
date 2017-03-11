package site.zhanjingbo.ObserverPattern;

/**
 * A类观察者实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcerteObserversA implements Observer {
	public void update() {
		System.out.println("A类观察者收到消息");
	}
}
