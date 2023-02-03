package Gestore_eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento nuovoEvento = new Evento("evento", 03/02/2023, 100, 0);
		
		Scanner s = new Scanner (System.in);
		String nomeEvento;
		String PostiDaPrenotare;
		LocalDate today = LocalDate.now();
		
		
		System.out.println("nome evento: ");
		nomeEvento = s.nextLine();
		
		System.out.println("inserisci data: ");
		String dataInput = s.nextLine();
        LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Quanti posti vuoi prenotare?: ");
        PostiDaPrenotare = s.nextLine();
        
        System.out.println(nomeEvento + dataInput + PostiDaPrenotare);
        
        
        
        
	}

}
