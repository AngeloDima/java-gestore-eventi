package Gestore_eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento nuovoEvento = new Evento("evento", 07/02/2023, 100, 0);
		
		Scanner s = new Scanner (System.in);
		String nomeEvento;
		int PostiDaPrenotare;
		LocalDate today = LocalDate.now();
		
		
		System.out.println("nome evento: ");
		nomeEvento = s.nextLine();
		
		System.out.println("inserisci data: ");
		String dataInput = s.nextLine();
        LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
		if (data.isBefore(today)) {
            throw new IllegalArgumentException("Data passata");
        }

        


        
        try {
            System.out.println("Inserisci il numero di posti disponibili: ");
             PostiDaPrenotare = s.nextInt();
             System.out.println("Quanti posti vuoi prenotare?: ");
             PostiDaPrenotare = s.nextInt();
              
        } catch (InputMismatchException e) {
            System.out.println("Errore: è stato inserito un valore non valido per il numero di posti");
            return;
        }

        
        
        
        
       
        while (PostiDaPrenotare == 0 || PostiDaPrenotare < 0) {
            if (PostiDaPrenotare == 0) {
            	System.out.println("Devi inserire un numero ");
            	PostiDaPrenotare = s.nextInt();
            	
            } else if (PostiDaPrenotare < 0){
            	System.out.println("Non puoi inserire un numero negativo ");
            	PostiDaPrenotare = s.nextInt();
            } else {
            	break;
            }
            
        }
        
        
        
        System.out.println(nomeEvento + dataInput + PostiDaPrenotare);
        
        
        
        
	}

}
