package termometro_2;

import java.util.Arrays;

public class Termometro {


	private float temperaturas[];
	private int contador;
	private float contar[];
	
	public Termometro() {
		temperaturas = new float [7];
	}
	
	public void addTemperatura(float temperatura) {
		
		temperaturas[contador] = temperatura;
		contador++;

		if(contador==temperaturas.length) {
			contador = 0;
		}
		
	}
	
	public String buscarTemperatura(float temperatura) {
		int contador=0;
		int x=0;
		for(int i=0;i<=temperaturas.length;i++) {
			if(temperaturas[i]==temperatura)  {
				contador++;
			}
		}
		contar = new float [contador];
		for(int i=0;i<=temperaturas.length;i++) {
			if(temperaturas[i]==temperatura)  {
				contar[x] = i;
				x++;
			}
		}
		return Arrays.toString(contar); 
	}
	
	public String toString() {
		return Arrays.toString(temperaturas);
	}
	
}
