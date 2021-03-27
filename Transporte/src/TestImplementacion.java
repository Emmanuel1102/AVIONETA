
public class TestImplementacion {
	
	
	public static void main(String[]args) {

		AcelerarAutomatico acelerar= new AcelerarAutomatico();
		FrenarAutomatico frenar= new FrenarAutomatico();
		
		MotoAutomatica moto= new MotoAutomatica(10, 10, frenar, acelerar,"derecha", false, 200.1, 300.1, 10.00);
		String des= moto.desplazamiento("derecha", false, 200.1);
		Double ace= moto.modoAcelerar(200.1,300.1, 10.0);
		Double Frena =moto.modoFrenar(100.0);
		System.out.print(moto);
		System.out.print("\nDesplazamiento: "+des);
		System.out.print("\nAceleracion: "+ace);
		System.out.print("\nFrenado: "+Frena);
		
		
		System.out.print("\n#############################################\n");
		
		
		MotoEstandar motoM= new MotoEstandar(20, 20, frenar, acelerar,"izquierda", false, 0.0, 500.0, 20.00);
		String desM= motoM.desplazamiento("izquierda", false, 0.0);
		Double aceM= motoM.modoAcelerar(0.0,500.0, 20.0);
		Double FrenaM =motoM.modoFrenar(20.0);
		System.out.print(motoM);
		System.out.print("\nDesplazamiento: "+desM);
		System.out.print("\nAceleracion: "+aceM);
		System.out.print("\nFrenado: "+FrenaM);
		
		
		
		System.out.print("\n#############################################\n");
		
		
		AutomovilEstandar AutoM= new AutomovilEstandar(30, 30, frenar, acelerar,"centro", false, 0.01, 600.0, 30.00);
		String desAM= AutoM.desplazamiento("centro", false, 0.01);
		Double aceAM= AutoM.modoAcelerar(0.01,600.0, 30.0);
		Double FrenaAM =AutoM.modoFrenar(30.0);
		System.out.print(AutoM);
		System.out.print("\nDesplazamiento: "+desAM);
		System.out.print("\nAceleracion: "+aceAM);
		System.out.print("\nFrenado: "+FrenaAM);
		
		
		
	}

}
