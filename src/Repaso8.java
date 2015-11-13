/*
 * AUTOR: DANIELA VALERA FUENTES
 * 
 * La clase repaso7 cuando se hace clic en un rectangulo central,
 * genera un nuevo rectangulo aleatorio
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso8 extends acm.program.GraphicsProgram{
	
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
		//este if me hace que lo siguiente que ponga se desarrolle solo en el rectangulo
		if (getElementAt (evento.getX(), evento.getY() ) == rectangulo){
			if (getElementAt (evento.getX()- rectangulo.getWidth()/2, evento.getY() ) == rectangulo){
			rectangulo.move(10, 0);
			}
			else{
					rectangulo.move(-10, 0);
			}
	}
}
}
