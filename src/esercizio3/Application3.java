package esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application3 {

	public static Logger logger = LoggerFactory.getLogger(Application3.class);

	public static void main(String[] args) {

		RegistroPresenze.aggiungiDipendente("Mario", 80);
		RegistroPresenze.aggiungiDipendente("Maria", 90);
		RegistroPresenze.aggiungiDipendente("Giuseppe", 50);

	}

}
