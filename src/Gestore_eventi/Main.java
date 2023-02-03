package Gestore_eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		LocalDate today = LocalDate.now();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Inserisci una data (gg/mm/aaaa): ");
        String dataUtente = s.nextLine();
        LocalDate date = LocalDate.parse(dataUtente, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Hai inserito questa data: " + dataUtente);
        
        
        if (date.isBefore(today)) {
            throw new IllegalArgumentException("Data inserita non valida, la data deve essere futura");
        }
        
        System.out.println("Inserisci il numero di posti: ");
        int numeroPostiUtente = s.nextInt();
        if (numeroPostiUtente <= 0) {
            throw new IllegalArgumentException("Il numero di posti totali deve essere positivo");
            
        }
        System.out.println("Hai inserito questi posti: " + numeroPostiUtente);
        
        

	}

}
