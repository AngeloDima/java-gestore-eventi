package Gestore_eventi;

import java.math.BigDecimal;

import java.time.LocalTime;

public class Concerto extends Evento{


	 private LocalTime ora;
	 private BigDecimal prezzo;
	public LocalTime getOra() {
		return ora;
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	public Concerto(String titolo, int data, int postiTotali, int postiPrenotati, LocalTime ora, BigDecimal prezzo) {
		super(titolo, data, postiTotali, postiPrenotati);
		this.ora = ora;
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Concerto [ora=" + ora + ", prezzo=" + prezzo + ", titolo=" + titolo + ", data=" + data + ", getOra()="
				+ getOra() + ", getPrezzo()=" + getPrezzo() + "]";
	}



}
