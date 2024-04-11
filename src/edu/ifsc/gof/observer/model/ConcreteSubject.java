package edu.ifsc.gof.observer.model;

import java.util.List;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;

public class ConcreteSubject implements Subject {

	public List<Observer> observers;
	public String message;
	
	public ConcreteSubject() {
		this.observers = observers;
	}

	@Override
	public void register(Observer obs) {
		if(!observers.contains(obs)) {
			observers.add(obs);
		}
	}

	@Override
	public void unregister(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer obs) {
		return this.message;
	}

	public void postMessage(String message) {
		System.out.println("Nova mensagem " + message);
		this.message = message;
		notifyObservers();
	}
	
}
