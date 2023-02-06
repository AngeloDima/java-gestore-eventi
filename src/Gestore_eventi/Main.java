package Gestore_eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {


		
		
Scanner s= new Scanner(System.in);
		
		Evento EventoProva = null;
		
		
		
		try {
			System.out.print("Titolo evento: ");
			String titolo = s.nextLine();
			
			System.out.print("Data dell'evento (inserire anno 4 cifre): ");
			int dataAnno = Integer.parseInt(s.nextLine());
			
			System.out.print("Data dell'evento (inserire mese da 1 a 12): ");
			int dataMese = Integer.parseInt(s.nextLine());
			
			System.out.print("Data dell'evento (inserire giorno): ");
			int dataGiorno = Integer.parseInt(s.nextLine());
			
			LocalDate dataEvento = LocalDate.of(dataAnno, dataMese, dataGiorno);
			
			System.out.print("Posti totali: ");
			int postiTotali = Integer.parseInt(s.nextLine());
		
			EventoProva = new Evento(titolo, dataEvento, postiTotali);
				
		} catch (Exception e) {
			System.out.println("Alcuni campi non sono stati inseriti, Riprova");
			e.printStackTrace();
		}
		
		
		
		
		int postiPrenotati = 0;
		boolean farePrenotazione = true;
		
		while (farePrenotazione) {
			try {
				System.out.print("Vuoi prenotare dei posti? (S/N)");
				farePrenotazione = s.nextLine().equals("s");
				if (farePrenotazione) {
					System.out.print("Quanti posti vuoi prenotare? ");
					postiPrenotati = Integer.parseInt(s.nextLine());
					if (postiPrenotati < 1 || postiPrenotati > EventoProva.getPostiTotali())
						System.out.println("Numero non valido,");
					else
						farePrenotazione = false;
				}
				
			} catch (Exception error) {
				System.out.println("Input non valido");
			}
		}
		
		LocalDate adesso = LocalDate.now();
		
		for (int i=0; i < postiPrenotati; i++) {
			try {
				EventoProva.prenota(adesso);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Posti prenotati: " + EventoProva.getPostiPrenotati());
		System.out.println("Posti disponibili: " + EventoProva.getPostiTotali());
		
		
		
		
		int postiRestituiti= 0;
		boolean fareDisdetta = true;
		
		while (fareDisdetta) {
			try {
				System.out.print("Vuoi disdire dei posti? (S/N)");
				fareDisdetta = s.nextLine().equals("s");
				if (fareDisdetta) {
					if (postiPrenotati < 1) {
						System.out.println("Non ci sono posti prenotati");
						fareDisdetta = false;
					} else {
						System.out.print("Quanti posti vuoi disdire? ");
						postiRestituiti = Integer.parseInt(s.nextLine());
						if (postiRestituiti < 1 || postiRestituiti > EventoProva.getPostiPrenotati())
							System.out.println("Numero non valido, intervallo accettato da 1 a " + EventoProva.getPostiPrenotati());
						else
							fareDisdetta = false;
					}
				}
				
			} catch (Exception error) {
				System.out.println("Input non valido. Inserire solo un numero intero!");
			}
		}
		
		for (int i=0; i < postiRestituiti; i++) {
			try {
				EventoProva.disdici(adesso);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Posti prenotati: " + EventoProva.getPostiPrenotati());
		System.out.println("Posti disponibili: " + EventoProva.getPostiTotali());

		LocalTime testOra = LocalTime.of(16, 19);
		BigDecimal prezzo = new BigDecimal ("15.5784");
		Concerto ConcertoProva = null;
		try {
			ConcertoProva = new Concerto("titoloTest", EventoProva.getData(), EventoProva.getPostiTotali(), testOra, prezzo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Oggetto test concerto: " + ConcertoProva.toString());
		
		System.out.println("Fine");
		
		s.close();
	

	}
}
