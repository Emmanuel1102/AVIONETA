
public class AutomovilEstandar extends VehiculoTransporte {

	
	AutomovilEstandar(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial,double VelocidadFinal,double time){
		
		super(capacidad, peso ,frenar,acelerar,direccion,sentido,VelocidadInicial,VelocidadFinal,time);
	    acelerar= new AcelerarManual();
		frenar= new FrenarNormal();
		
	}
	
	
	@Override
	public String desplazamiento(String direccion, boolean sentido, double VelocidadInicial) {
		
		String info = "El auto lleva la direccion" + direccion+ "Y su velocidad inicia el de" + VelocidadInicial;
		return info;
	}


	@Override
	double modoFrenar(double intensidad) {
	
		return this.frenar.frenaM(intensidad);
	}


	@Override
	double modoAcelerar(double VelocidadInicial, double VelocidadFinal, double time) {
		     ////////////obj.metodo
		return this.acelerar.acelerarM(VelocidadInicial, VelocidadFinal, time);
	}



}
