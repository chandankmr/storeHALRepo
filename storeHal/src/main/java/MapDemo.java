import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapDemo {
	
	private static final int MAX_T=5;
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		Map<Integer,String> hashtable=new Hashtable<>();
		Map<Integer,String> synchronizedMap=Collections.synchronizedMap(new HashMap<>());
		Map<Integer,String> concurrentMap=new ConcurrentHashMap<>();
		testPerformance(map);
		testPerformance(hashtable);
		testPerformance(synchronizedMap);
		testPerformance(concurrentMap);
	}
	private static void testPerformance(Map<Integer,String> map){
		System.out.println(map.getClass());
		long averageTime[]= {0};
		
		for(int i=0;i<5;i++) {
			long startTime=System.nanoTime();
			ExecutorService pool= Executors.newFixedThreadPool(MAX_T);
			for(int j=0;j<MAX_T;j++) {
				pool.execute(
						new Runnable() {

							@Override
							public void run() {
								for (long i=0l;i<500000000l;i++) {
									Integer randomNumber=(int) Math.ceil(Math.random()*550000);
									//Retrieving value. we are not using it anywhere
									//String strValue=map.get(randomNumber);
									
									// put value
									map.put(randomNumber, "Chandan");
									
									//shut down
									pool.shutdown();
									
									// Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is
									// interrupted, whichever happens first.
									try {
										pool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
						 
									long entTime = System.nanoTime();
									long totalTime = (entTime - startTime) / 1000000L;
									averageTime[0] += totalTime;
									System.out.println("500K entries added/retrieved in " + totalTime + " ms");
								}
							}
							
						}
						);
			}
		}
		

		System.out.println("For " + map.getClass() + " the average time is " + averageTime[0]  + " ms\n");		
		
	}

}
