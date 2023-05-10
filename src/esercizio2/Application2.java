package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import esercizio2.thread.MyThread;

public class Application2 {
	public static Logger logger = LoggerFactory.getLogger(Application2.class);

	public static void main(String[] args) throws InterruptedException {

		List<Integer> lista = new ArrayList<>();
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();

		for (int i = 0; i < 3000; i++) {
			Random r = new Random();
			int randomR = r.nextInt(10);
			lista.add(randomR);

		}
		System.out.println(lista);
		for (int i = 0; i < 1000; i++) {
			lista1.add(lista.get(i));
			lista2.add(lista.get(i + 1000));
			lista3.add(lista.get(i + 2000));
		}
		System.out.println(lista2);

		Thread thread1 = new MyThread(lista1);
		Thread thread2 = new MyThread(lista2);
		Thread thread3 = new MyThread(lista3);

		thread1.start();
		try {
			thread1.join();

		} catch (InterruptedException e) {
			Application2.logger.error(e.getMessage());
		}
		thread2.start();
		try {
			thread2.join();

		} catch (InterruptedException e) {
			Application2.logger.error(e.getMessage());
		}
		thread3.start();
		try {
			thread3.join();

		} catch (InterruptedException e) {
			Application2.logger.error(e.getMessage());
		}

		int somma = ((MyThread) thread1).getSomma() + ((MyThread) thread2).getSomma() + ((MyThread) thread3).getSomma();
		logger.info("La somma dei valori calcolati dai thread è: " + somma);
	}

}
