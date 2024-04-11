package edu.ifsc.gof.observer;

import edu.ifsc.gof.observer.model.ConcreteObserver;
import edu.ifsc.gof.observer.model.ConcreteSubject;

public class MainObserver {

	public static void main(String[] args) {

		ConcreteObserver obs1 = new ConcreteObserver("Obs1");
		ConcreteObserver obs2 = new ConcreteObserver("Obs2");
		ConcreteObserver obs3 = new ConcreteObserver("Obs3");

		ConcreteSubject topic = new ConcreteSubject();
		
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);

		obs1.setSubject(topic);
		obs2.setSubject(topic);
		obs3.setSubject(topic);
		
		topic.postMessage("Alô mundo!");
	}

}
