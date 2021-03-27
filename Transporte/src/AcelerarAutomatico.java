
public class AcelerarAutomatico implements Acelerar{

	

	@Override
	public double acelerarM(double VelocidadInicial, double VelocidadFinal, double time) {
	    
		double acelerar= (VelocidadFinal-VelocidadInicial)/time;
		return acelerar;
	}

}
