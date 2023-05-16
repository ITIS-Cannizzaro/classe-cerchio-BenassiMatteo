
public class libreria {
	public static void main(String []args) {
		Libro[] libri=new Libro[10];
		libri[0]=new Libro("Harry Potter y el calìz de fuego","J.K. Rowling",2000);
		libri[1]=new Libro("Haciendo Camino","Cristina M.",2015);
		libri[2]=new Libro("Minecraft la isla","Maximillian Brooks",2017);
		libri[3]=new Libro("Cien anos de soledad","Fausto Brizzi",2013);
		libri[4]=new Libro("Lazzarillo de Tormes","Anònimo",1554);
		libri[5]=new Libro("Percy Jackson y el ladròn del rayo","Rick Riordan",2005);
		libri[6]=new Libro("Capitan calzoncillos","David Soren",2017);
		libri[7]=new Libro("Geronimo Stilton, primer viaje al reino del la fantasia","Geronimo Stilton",2016);
		libri[8]=new Libro("Asesinato para damas","Robin Stevens",2016);
		libri[9]=new Libro("Las nochas blancas","Fedor Dostoevskij",1848);
		
		for(int i=0;i<libri.length;i++) {
			System.out.println(libri[i].getTitolo()+" de " +libri[i].getAutore()+" en el: "+libri[i].getannopubblicazione());
		}
	}
}
