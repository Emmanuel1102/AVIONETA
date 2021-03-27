
public class AcelerarManual implements Acelerar {



	@Override
	public double acelerarM(double VelocidadInicial, double VelocidadFinal, double time) {
	    
		double acelerar= (VelocidadFinal-VelocidadInicial)/time;
		return acelerar;
	}


}
