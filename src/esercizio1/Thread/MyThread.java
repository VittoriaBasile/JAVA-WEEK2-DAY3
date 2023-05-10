package esercizio1.Thread;

import esercizio1.Application1;

public class MyThread implements Runnable {

	private String simbolo;

	public MyThread(String simbolo) {
		setSimbolo(simbolo);

	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			Application1.logger.info(i + " = " + simbolo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Application1.logger.error(e.getMessage());
			}

		}

	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

}
