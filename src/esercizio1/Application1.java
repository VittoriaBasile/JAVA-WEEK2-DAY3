package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import esercizio1.Thread.MyThread;

public class Application1 {
	public static Logger logger = LoggerFactory.getLogger(Application1.class);

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread("*"));
		Thread thread2 = new Thread(new MyThread("#"));

		thread1.start();
		thread2.start();

	}

}
