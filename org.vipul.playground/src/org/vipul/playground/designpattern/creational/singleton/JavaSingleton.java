package org.vipul.playground.designpattern.creational.singleton;

import java.util.ArrayList;

public enum JavaSingleton {
	INSTANCE;
    private final ArrayList<String> favoriteSongs =new ArrayList<String>();
    
    private JavaSingleton(){
    	favoriteSongs.add("Hound Dog");
    	favoriteSongs.add( "Heartbreak Hotel" );
    }
   
    public void printFavorites() {
        System.out.println(favoriteSongs);
    }
    
    public void addFavorites(String e) {
        favoriteSongs.add(e);
    }

}
