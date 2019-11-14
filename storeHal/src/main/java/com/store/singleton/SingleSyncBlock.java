package com.store.singleton;

public class SingleSyncBlock {
	private static SingleSyncBlock instance=null;
private SingleSyncBlock() {
	
}

public static SingleSyncBlock getInstance() {
	if(instance==null) {
		synchronized(SingleSyncBlock.class) {
			if(instance==null) {
				instance=new SingleSyncBlock();
			}
		}
	}
	return instance;
}

}
