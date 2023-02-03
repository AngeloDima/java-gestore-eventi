package Gestore_eventi;

import java.time.LocalDate;

public class Evento {
	protected String titolo;
	protected int data;
	protected int postiTotali;
	protected int postiPrenotati;
	public Evento(String titolo, int data, int postiTotali, int postiPrenotati) {
		this.titolo = titolo;
		this.data = data;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
		
		
	}
	
	public void Prenota(int numeroPostiUtente,LocalDate date, LocalDate today) {
		numeroPostiUtente++;
		if (date.isBefore(today)) {
            throw new IllegalArgumentException("Data passata");
        }
		
		if (postiTotali <= 0) {
            throw new IllegalArgumentException("Non ci sono posti disponibili");
        }
	}
	
	public void Disdici(int numeroPostiUtente, LocalDate date, LocalDate today) {
		numeroPostiUtente--;
		
		if (date.isBefore(today)) {
            throw new IllegalArgumentException("Data passata riprova");
        }
		
		if (postiPrenotati <= 0) {
            throw new IllegalArgumentException("Non ci sono posti prenotati");
        }
	}
	
	
	
	
	@Override
	public String toString() {
		return "Evento [titolo=" + titolo + ", data=" + data + ", postiTotali=" + postiTotali + ", postiPrenotati="
				+ postiPrenotati + ", getTitolo()=" + getTitolo() + ", getData()=" + getData() + "]";
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getPostiTotali() {
		return postiTotali;
	}
	public int getPostiPrenotati() {
		return postiPrenotati;
	}

}
