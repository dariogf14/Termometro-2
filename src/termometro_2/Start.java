package termometro_2;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Termometro termometro1 = new Termometro();
		
		termometro1.addTemperatura(7);
		termometro1.addTemperatura(7);
		termometro1.addTemperatura(5);
		termometro1.addTemperatura(7);
		termometro1.addTemperatura(7);
		termometro1.addTemperatura(7);
		termometro1.addTemperatura(4);
		
		System.out.println(termometro1.buscarTemperatura(7));
		
		System.out.println(termometro1.toString());
		
	}

}
