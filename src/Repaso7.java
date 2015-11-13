/*
 * AUTOR: DANIELA VALERA FUENTES
 * 
 * La clase repaso7 cuando se hace clic en un rectangulo central,
 * genera un nuevo rectangulo aleatorio
 */
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso7 extends acm.program.GraphicsProgram{
	
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
		if (getElementAt (evento.getX(), evento.getY() ) == rectangulo){
			GRect auxiliar = new GRect (aleatorio.nextInt(200),
										aleatorio.nextInt(200));
			auxiliar.setFilled(true);
			auxiliar.setFillColor(aleatorio.nextColor());
			add(auxiliar, aleatorio.nextInt(800), aleatorio.nextInt(600));
	}
}
}
