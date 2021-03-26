public abstract class VehiculoTransporte {

	protected int capacidad ;
	protected int peso;
	//se lleva a cabo la compisicion
	protected Frenar frenar;
	protected Acelerar acelerar;
	protected  String direccion;
    protected boolean sentido;
    protected double VelocidadInicial;
	
        
   VehiculoTransporte(int capacidad, int peso, Frenar frenar, Acelerar acelerar, String direccion,boolean sentido, double VelocidadInicial){
   
   } 
    
    
 //Constructor vacio que definio	
  VehiculoTransporte(){
	  
	  
  }	
	
  abstract  void desplazamiento(String direccion, boolean sentido, double VelocidadInicial);
  
  abstract Frenar modoFrenar(); 
	
  abstract Acelerar modoAcelerar();
	
}
