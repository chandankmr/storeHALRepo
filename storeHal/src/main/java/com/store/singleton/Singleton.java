package com.store.singleton;

public class Singleton {

private Singleton() {
	
}

private static class InnerSingleton{
	private static Singleton instance=new Singleton();
}
public Singleton getInstance() {
	return InnerSingleton.instance;
}

}

/*Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded,
 *  InnerSingleton class is not loaded into memory and only when someone calls the getInstance method, 
 *  this class gets loaded and creates the Singleton class instance.

This is the most widely used approach for Singleton class as it doesn’t require synchronization.*/
