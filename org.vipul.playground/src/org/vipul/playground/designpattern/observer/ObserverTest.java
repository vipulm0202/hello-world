package org.vipul.playground.designpattern.observer;

import org.vipul.playground.designpattern.observer.MyModel.Person;

public class ObserverTest {

	public static void main(String[] args) {
		MyModel model=new MyModel();
		MyObserver observer = new MyObserver(model);
		
		for (Person person : model.getPersons()) {
		      person.setLastName(person.getLastName() + "1");
		    }
		
		for (Person person : model.getPersons()) {
		      person.setFirstName(person.getFirstName() + "1");
		    }
	}

}
