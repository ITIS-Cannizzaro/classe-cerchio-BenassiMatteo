import java.util.Scanner;

public class usocerchio {
public static void main(String[] args) {
		
		Scanner a1=new Scanner(System.in);
		System.out.println("inserisci il raggio del primo cerchio");
		double r1=a1.nextInt();
		System.out.println("inserisci il raggio del secondo cerchioo");
		double r2=a1.nextInt();
		Cerchio c1=new Cerchio (r1);
		Cerchio c2=new Cerchio(r2);
		System.out.println("diametro del primo cerchio: "+c1.diametro());
		System.out.println("perimetro del primo cerchio: "+c1.perimetro());
		System.out.println("Area del primo cerchio: "+c1.Area());
		System.out.println("diametro del secondo cerchio: "+c2.diametro());
		System.out.println("perimetro del secondo cerchio: "+c2.perimetro());
		System.out.println("Area del secondo cerchio: "+c2.Area());
		Cerchio c3=c1.sommaraggio(c2);
		System.out.println("diametro del terzo cerchio: "+c3.diametro());
		System.out.println("perimetro del terzo cerchio: "+c3.perimetro());
		System.out.println("Area del terzo cerchio: "+c3.Area());
		
	}
}