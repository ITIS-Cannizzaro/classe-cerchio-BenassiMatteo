
public class Libro {
private String titolo;
private String autore;
private int annopubblicazione;
public Libro (String titolo, String autore, int annopubblicazione) {
	this.titolo=titolo;
	this.autore=autore;
	this.annopubblicazione=annopubblicazione;
}
public String getTitolo() {
	return titolo;
}
public String getAutore() {
	return autore;
}
public int getannopubblicazione() {
	return annopubblicazione;
}
}
