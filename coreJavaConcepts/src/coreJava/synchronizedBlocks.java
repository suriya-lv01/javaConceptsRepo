package coreJava;

import java.util.function.Consumer;

public class synchronizedBlocks {

	public static void main(String[] args) {
		
		Consumer<String> syncfunc	=	(String param1)->{
			synchronized(synchronizedBlocks.class) {
				System.out.println(Thread.currentThread().getName() + " step no 1: "+param1);
				
				try {
//					Thread.sleep((long) (Math.random() * 1000));
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + " step no 2: " + param1);
				
			}
			
		};

		Consumer<String> func = (String param) -> {

			synchronized (synchronizedBlocks.class) {

				System.out.println(Thread.currentThread().getName() + " step 1: " + param);

				try {
//					Thread.sleep((long) (Math.random() * 10000));
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " step 2: " + param);
			}

		};

		Thread thread1 = new Thread(() -> {
			func.accept("Parameter");
		}, "Thread 1");

		Thread thread2 = new Thread(() -> {
			func.accept("Parameter");
		}, "Thread 2");

		Thread thread3 = new Thread(() -> {
			syncfunc.accept("Param new");
		}, "Thread 3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
