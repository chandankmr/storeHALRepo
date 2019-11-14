package com.demo.serializable;

import java.io.Serializable;

public class LazySingleton implements Serializable {
private static final long serialVersionUID = 1L;

private LazySingleton() {
	
}

private static class Singleton{
	private static final LazySingleton instance=new LazySingleton();
}

public static LazySingleton getInstance() {
	return Singleton.instance;
}

private Object readResolve() {
	return Singleton.instance;	
}

}
