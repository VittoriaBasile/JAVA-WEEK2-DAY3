package esercizio2.thread;

import java.util.List;

import esercizio2.Application2;

public class MyThread extends Thread {
	private List<Integer> lista;
	private int somma = 0;

	public MyThread(List<Integer> lista) {
		setLista(lista);
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		for (int i = 0; i < lista.size(); i++) {
			somma += lista.get(i);
		}
		String sum = Integer.toString(somma);
		Application2.logger.info(sum);
	}

	public int getSomma() {
		return somma;
	}

	public void setSomma(int somma) {
		this.somma = somma;
	}

}
