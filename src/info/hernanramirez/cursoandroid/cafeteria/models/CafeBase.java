package info.hernanramirez.cursoandroid.cafeteria.models;


/**
 * Super clase para la elaboración de un cafe base
 */

public class CafeBase
{
	
	public int id;
	public int agua;
	public int cafe;

	/**
	 * Constructor
	 * @param id identifiacodor del objeto 
	 * @param agua cantidad de agua en cc
	 * @param cafe de cafe en cc
	 */
	
	public CafeBase(int id, int agua, int cafe) {
		super();
		this.id = id;
		this.agua = agua;
		this.cafe = cafe;
	}
	
	public int getAgua() {
		// TODO implement me
		return 0;
	}


	public int getCafe() {
		// TODO implement me
		return 0;
	}

	public int setCafe() {
		// TODO implement me
		return 0;
	}
	
	/*
	 * Metodo para mostar los datos de la super clase
	 */
	public void mostrarDatos(String clase) {

		System.out.println(clase);
		System.out.println("Id: " + id);
		System.out.println("Cantidad de agua en cc: " + agua);
		System.out.println("Cantidad de cafe en cc: " + cafe);
		
	}
	

}

