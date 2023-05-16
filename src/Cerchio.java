public class Cerchio {
	private double raggio;
		public Cerchio(double r) {
			raggio=r;
		}
		public double diametro() {
			return raggio*2;
		}
		public double perimetro() {
			return 2*Math.PI*raggio;
		}
		public double Area() {
			return Math.PI*raggio*raggio;
		}
		public Cerchio sommaraggio(Cerchio c) {
			double nuovoraggio=raggio+c.raggio;
			return new Cerchio(nuovoraggio);
		}
	

			
		}