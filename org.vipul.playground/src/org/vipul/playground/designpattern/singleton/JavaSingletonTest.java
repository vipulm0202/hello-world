package org.vipul.playground.designpattern.singleton;

public class JavaSingletonTest {

	public static void main(String[] args) {
		JavaSingleton.INSTANCE.printFavorites();
		JavaSingleton.INSTANCE.addFavorites("Saathiya");
		JavaSingleton.INSTANCE.printFavorites();
	}

}
