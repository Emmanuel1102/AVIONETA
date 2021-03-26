
public class MotoAutomatica extends VehiculoTransporte {

	
	MotoAutomatica(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial){
		
		super(capacidad, peso ,frenar,acelerar,direccion,sentido,VelocidadInicial);
	    acelerar= new AcelerarAutomatico();
		frenar= new FrenarAutomatico();
		
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
