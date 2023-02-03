package Gestore_eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Evento nuovoEvento;

	public static void main(String[] args) {
		
		

		
		int postiPrenotati = 200;
		
		
		
		Scanner s = new Scanner (System.in);
		String nomeEvento;
		int PostiDaPrenotare;
		LocalDate today = LocalDate.now();
		
		
		System.out.print("nome evento: ");
		nomeEvento = s.nextLine();
		
		System.out.print("inserisci data --dd/MM/yyyy--: ");
		String dataInput = s.nextLine();
        LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
		if (data.isBefore(today)) {
            throw new IllegalArgumentException("Data passata");
        }

        


		
        
        try {
        	
             System.out.print("Quanti posti vuoi prenotare?: ");
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
        
        s.nextLine();
        
        
        
        int Sotra = postiPrenotati - PostiDaPrenotare;
              

        int postiDaDisdire = 0;
        String disdireInput;
        


        
        System.out.print("Vuoi disdire qualche posto?: (S)i -- (N)o ?   ");
        disdireInput=s.nextLine();
     
        if (disdireInput.equalsIgnoreCase("S")) {
        	System.out.print  ("Quanti posti vuoi disdire?: ");
        	postiDaDisdire=s.nextInt();
        	int TotDis = postiPrenotati - postiDaDisdire;
        	int TotDis2 =  PostiDaPrenotare - postiDaDisdire;
        	
        	System.out.println("-------------------------------");
        	System.out.println("-------------------------------");
        	
        	System.out.println("Aggiorno posti :" + TotDis);
        	System.out.println("Posti prenotati: " + TotDis2 );
        	
        } else if (disdireInput.equalsIgnoreCase("N")) {
        	
        	System.out.println("-------------------------------");
        	System.out.println("-------------------------------");
        	
        	System.out.println("Riassunto");
        	System.out.println("Posti rimanenti: " + Sotra );
        	System.out.println("Posti prenotati: " + PostiDaPrenotare );
        }
        
        System.out.println("Evento: " + nomeEvento);
        System.out.println("Programma terminato");
        
    	System.out.println("-------------------------------");
    	System.out.println("-------------------------------");
    
        
	}



}
