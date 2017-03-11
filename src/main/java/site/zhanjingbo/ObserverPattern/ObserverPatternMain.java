package site.zhanjingbo.ObserverPattern;

public class ObserverPatternMain {
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer observerA = new ConcerteObserversA();
		Observer observerB = new ConcerteObserversB();

		// 将观察者加入观察队列
		subject.attach(observerA);
		subject.attach(observerB);
		subject.notifyObservers();

		// 将观察者A移出观察队列
		subject.detach(observerA);
		subject.notifyObservers();
	}
}
