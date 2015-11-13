/*
 * AUTOR: DANIELA VALERA FUENTES
 * 
 * La clase repaso5 añade soporte al programa para poder escuchar
 * los clic del ratón
 * Lo que hará el programa es cambiar el color de relleno
 * aleatorimente de un rectángulo cada vez que se pulse clic
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso5 extends acm.program.GraphicsProgram{
	
	//declaro una variable de instancia para guardar el rectángulo
	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();
	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120,80);
		//inserto el "escuchador" del ratón
		addMouseListeners();
	}

	public void run(){
		add(rectangulo,
				getWidth()/2 - rectangulo.getWidth()/2,
				getHeight()/2 - rectangulo.getHeight()/2);
	}
	
	//añado el método que escucha el evento del clic del ratón
	
	public void mouseClicked (MouseEvent evento){
		if (evento.getButton() == MouseEvent.BUTTON1)
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
	}
}
