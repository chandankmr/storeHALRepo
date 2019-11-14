package com.demo.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int numberOfThreads=Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool=new ForkJoinPool(numberOfThreads);
		
		Long result=pool.invoke(new Sum(numbers,0,numbers.length));
		System.out.println(result);
	}
	
	static class Sum extends RecursiveTask<Long>{
		int[] array;
		int low;
		int high;
		

		public Sum(int[] array, int low, int high) {
			this.array = array;
			this.low = low;
			this.high = high;
		}


		@Override
		protected Long compute() {
			if(high-low<=10) {
				long sum=0;
				for(int i=low;i<high;++i) {
					sum+=array[i];
				}
				
				return sum;
			}

			//int mid=low+ (high-low)/2;
			int mid=(low+high)/2;
			Sum left=new Sum(array,low, mid);
			Sum right=new Sum(array,mid, high);
			left.fork();
			long rightResult=right.compute();
			long leftResult=left.join();
			try {
				java7();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return leftResult+rightResult;
		}
		
		void java7() throws IOException{
			BufferedReader br=new BufferedReader(new FileReader("C:\\digitalworkspace\\storeHal\\src\\main\\resources\\abc.txt"));
			try(br){
				System.out.println(br.readLine());
			}
		}
		
	}

}
