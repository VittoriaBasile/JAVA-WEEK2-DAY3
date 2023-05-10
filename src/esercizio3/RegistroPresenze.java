package esercizio3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	private static File file = new File("registroPresenze.txt");

	private String nomeDipendente;
	private int giorniPresenze;
	private static Map<String, Integer> registroPresenze = new HashMap<>();

	public static void aggiungiDipendente(String nome, int giorniPresenze) {

		try {
			registroPresenze.put(nome, giorniPresenze);
			System.out.println("Hai aggiunto: " + nome + "=" + giorniPresenze);
			;
			FileUtils.writeStringToFile(file, nome + "@" + giorniPresenze + System.lineSeparator(), "UTF8", true);
			try {
				leggiRegistro(file, "UTF8");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String leggiRegistro(File file, String string) throws IOException {

		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF8");
			return content;
		} else {
			System.out.println("FILE NON TROVATO");
			return "";
		}

	}

	public String getNomeDipendente() {
		return nomeDipendente;
	}

	public void setNomeDipendente(String nomeDipendente) {
		this.nomeDipendente = nomeDipendente;
	}

	public int getGiorniPresenze() {
		return giorniPresenze;
	}

	public void setGiorniPresenze(int giorniPresenze) {
		this.giorniPresenze = giorniPresenze;
	}

	public static Map<String, Integer> getRegistroPresenze() {
		return registroPresenze;
	}

	public static void setRegistroPresenze(Map<String, Integer> registroPresenze) {
		RegistroPresenze.registroPresenze = registroPresenze;
	}

}
