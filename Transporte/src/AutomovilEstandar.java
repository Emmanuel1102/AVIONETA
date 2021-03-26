
public class AutomovilEstandar extends VehiculoTransporte {

	
	AutomovilEstandar(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial){
		
		super(capacidad, peso ,frenar,acelerar,direccion,sentido,VelocidadInicial);
	    acelerar= new AcelerarManual();
		frenar= new FrenarNormal();
		
	}
	
	
	@Override
	public void desplazamiento(String direccion, boolean sentido, double VelocidadInicial) {
		
	}

	@Override
	Frenar modoFrenar() {
		return this.frenar;

	}

	@Override
	Acelerar modoAcelerar() {
		return this.acelerar;

	}

}
