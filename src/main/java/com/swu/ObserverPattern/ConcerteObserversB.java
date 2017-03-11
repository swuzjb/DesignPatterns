package com.swu.ObserverPattern;

/**
 * B类观察者实现
 * 
 * @author zhanjingbo
 *
 */
public class ConcerteObserversB implements Observer {
	public void update() {
		System.out.println("B类观察者收到消息");
	}
}
