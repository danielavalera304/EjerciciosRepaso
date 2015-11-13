/*
 * AUTOR: DANIELA VALERA FUENTES
 * 
 * La clase repaso5 a�ade soporte al programa para poder escuchar
 * los clic del rat�n
 * Lo que har� el programa es cambiar el color de relleno
 * aleatorimente de un rect�ngulo cada vez que se pulse clic
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso6 extends acm.program.GraphicsProgram{
	
	//declaro una variable de instancia para guardar el rect�ngulo
	GRect rectangulo;
	RandomGenerator aleatorio = new RandomGenerator();
	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120,80);
		//inserto el "escuchador" del rat�n
		addMouseListeners();
	}

	public void run(){
		add(rectangulo,
				getWidth()/2 - rectangulo.getWidth()/2,
				getHeight()/2 - rectangulo.getHeight()/2);
	}
	
	//a�ado el m�todo que escucha el evento del clic del rat�n
	
	public void mouseClicked (MouseEvent evento){
		//evento.getX();
		//si en la posici�n en la que se ha hecho cli
		// est� el rect�ngulo entonces lo relleno
		
		//la funci�n se llama getElementAt
		if (getElementAt (evento.getX(), evento.getY() ) == rectangulo){
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
	}
}
}