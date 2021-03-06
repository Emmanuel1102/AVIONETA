
public class MotoAutomatica extends VehiculoTransporte {

	
	MotoAutomatica(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial,double VelocidadFinal,double time){
		
		super(capacidad, peso ,frenar,acelerar,direccion,sentido,VelocidadInicial,VelocidadFinal,time);
	    acelerar= new AcelerarAutomatico();
		frenar= new FrenarAutomatico();
		this.VelocidadFinal=VelocidadFinal;
		this.VelocidadInicial=VelocidadInicial;
		this.time=time;
		
	}
	
	
	@Override
	public String desplazamiento(String direccion, boolean sentido, double VelocidadInicial) {
		
	
	  String info = "\n"+"El auto lleva la direccion  " + direccion+ "  Y su velocidad inicia en  " + VelocidadInicial;
		return info;
	}

	@Override
	double modoFrenar(double intensidad) {
		
		///////////obj,metodo
		return this.frenar.frenaM(intensidad);
	}

	@Override
	double  modoAcelerar(double VelocidadInicial,double VelocidadFinal, double time) {
	
		////////////     obj.metodo
		return this.acelerar.acelerarM(VelocidadInicial, VelocidadFinal, time);
	}


	@Override
	public String toString() {
		return  "Moto Automatica\n"+"Capacidad: " + capacidad +"\n"+ "Peso:"+ peso+"\n" +"direccion:" + direccion+"\n"+ "sentido:" + sentido+"\n" + "VelocidadInicial:"
				+ VelocidadInicial+"\n" + "VelocidadFinal:" + VelocidadFinal +"\n"+ "time:" + time ;
	}

}
