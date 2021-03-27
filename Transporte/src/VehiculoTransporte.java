public abstract class VehiculoTransporte {

	protected int capacidad ;
	protected int peso;
	//se lleva a cabo la compisicion
	protected Frenar frenar;
	protected Acelerar acelerar;
	protected  String direccion;
    protected boolean sentido;
    protected double VelocidadInicial;
    protected double VelocidadFinal;
    protected double time;
	
        
   VehiculoTransporte(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial,double VelocidadFinal,double time){
   
	   
	    this.capacidad = capacidad;
	    this.peso = peso;
	    this.frenar = frenar;
	    this.acelerar = acelerar;
	    this.direccion=direccion;
	    this.sentido=sentido;
	    this.VelocidadInicial=VelocidadInicial;
	    this.VelocidadFinal=VelocidadFinal;
	    this.time=time;   
	   
   } 
    
    
 //Constructor vacio 	
  VehiculoTransporte(){
	  
	  
  }	
	
  
  //Este metodo tengo pensarlo volverlo de vacio a String para que devuelva un mensaje
  abstract  String desplazamiento(String direccion, boolean sentido, double VelocidadInicial);
  
  abstract double modoFrenar(double intensidad); 
	
  abstract double modoAcelerar(double VelocidadInicial,double VelocidadFinal, double time);
	
}
