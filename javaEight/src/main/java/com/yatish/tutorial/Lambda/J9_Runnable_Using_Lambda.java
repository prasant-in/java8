package com.yatish.tutorial.Lambda;

public class J9_Runnable_Using_Lambda {

	public static void main(String[] args) {
		
		/*
		 * We can use lambda expression to write the run method of the threads.  As shown below we have written a lambda expression and assigned it to a interface 'Runnable'. The Runnable
		 * interface has only one method 'run()' hence it acts as a functional interface.
		 * 
		 */
		Runnable ttt123 = () -> System.out.println("thread run method lambda expression executing");
		ttt123.run();
		
		/*
		 * We can either execute the run method as shown above 'ttt123.run()' or else we can execute this as a thread as well. The Thread class which implements 'Runnable' has a 
		 * parameterized constructor which accepts Runnable parameter. hence we can use this lambda expression variable and pass it to Thread object constructor and then that thread can
		 * be started as shown in below code.
		 * 
		 */
		Thread t1 = new Thread(ttt123);
		t1.start();

	}

}
