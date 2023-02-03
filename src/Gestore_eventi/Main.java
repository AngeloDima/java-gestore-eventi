package Gestore_eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento nuovoEvento = null;
		
		
		
		int postiPrenotati = 200;
		
		
		
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

        


		//posti da prenotare 
        
        try {
        	
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
        
        s.nextLine();
        
        //fine posti da prenotare 
        
        int Sotra = postiPrenotati - PostiDaPrenotare;
              
        // stampo a video 
        
        //System.out.println(nomeEvento + "--" + dataInput + "--" + PostiDaPrenotare);
        //System.out.println("Posti rimanenti: " + Sotra );
        
        
        //disdire qualche posto
        int postiDaDisdire = 0;
        String disdireInput;
        


        
        System.out.println("Vuoi disdire qualche posto?: (S)i -- (N)o ?");
        disdireInput=s.nextLine();
     
        if (disdireInput.equalsIgnoreCase("S")) {
        	System.out.println("Quanti posti vuoi disdire? :");
        	postiDaDisdire=s.nextInt();
        	int TotDis = postiPrenotati - postiDaDisdire;
        	int TotDis2 =  PostiDaPrenotare - postiDaDisdire;
        	System.out.println("Aggiorno posti :" + TotDis);
        	System.out.println("Posti prenotati: " + TotDis2 );
        	
        } else if (disdireInput.equalsIgnoreCase("N")) {
        	System.out.println("Riassunto");
        	System.out.println("Posti rimanenti: " + Sotra );
        	System.out.println("Posti prenotati: " + PostiDaPrenotare );
        }
    
        
	}



}
