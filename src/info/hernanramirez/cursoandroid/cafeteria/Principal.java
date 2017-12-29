package info.hernanramirez.cursoandroid.cafeteria;
import info.hernanramirez.cursoandroid.cafeteria.models.Capuccino;
import info.hernanramirez.cursoandroid.cafeteria.models.Cortado;
import info.hernanramirez.cursoandroid.cafeteria.models.Mocaccino;

/**
* El siguiente programa impementa Herencia, poliformismo
* y interfaces.
*
* @author  J. Hernan Ramriez R.
* @version 1.0
* @since   2017-12-29 
*/

public class Principal {

	public static void main(String[] args) {
		// Elaboarar un café cortado y mostar los datos
		
		Cortado cortado = new Cortado(1, 10, 20, 10);
		cortado.mostrarDatos("Cafe cortado");
		
		// Elaborar un cafe mocaccino  y mostar los datos
		Mocaccino mocaccino = new Mocaccino(2, 40, 40, 10, 5);
		mocaccino.mostrarDatos("Cafe Mocaccino");
		// colocar crema cantilly utilizando una interfaz
		mocaccino.colocarCremaCantilly();
		
		// Elaborar un cafe Capuccino  y mostar los datos
		Capuccino capuccino = new Capuccino(3, 10, 10, 20, 1);
		capuccino.mostrarDatos("Cafe capiccino");
		// colocar crema cantilly utilizando una interfaz
		capuccino.colocarCremaCantilly();

	}

}
