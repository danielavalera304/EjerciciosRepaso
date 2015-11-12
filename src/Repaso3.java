/*
 * AUTOR: DANIELA VALERA FUENTES
 * 
 * La clase Repaso3 tiene que dibujar un rectángulo
 * con la esquina superior izquierda en el centro de la pantalla
 * 
 */
import acm.graphics.*;

public class Repaso3 extends acm.program.GraphicsProgram{
	
	//declaro una variable de instancia para almacenar el rectángulo
	//como es de instancia, se ve desde el init y desde el run
	
	GRect rectangulo;
	
	//declaro otra variable de instancia que guardará el punto X de la
	//pantalla en que empezará a pintarse el rectángulo
	int distanciaX;
	
	//declaro otra variable de instancia que guardará el punto Y de la
	//pantalla en que empezará a pintarse el rectángulo
	int distanciaY;
	
	public void init(){
		//cambio el tamaño de la pantalla
		setSize(800, 600);
		
		//creo el rectángulo de 120 de ancho por 80 de alto
		rectangulo = new GRect(120,80);
		add(rectangulo);
	}
	public void run(){
		//divido el ancho de la pantalla en 2 para saber donde está
		//la mitad exacta de la pantalla
		distanciaX= getWidth()/2;
		rectangulo.setLocation(distanciaX, 0);
		
		//divido el aLTO de la pantalla en 2 para saber donde está
		//la mitad exacta de la pantalla
				distanciaY= getHeight()/2;
				
				rectangulo.setLocation(distanciaX, distanciaY);
	}

}
