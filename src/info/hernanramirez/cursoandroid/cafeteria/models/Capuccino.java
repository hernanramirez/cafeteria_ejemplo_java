package info.hernanramirez.cursoandroid.cafeteria.models;

import info.hernanramirez.cursoandroid.cafeteria.interfaces.IColocarCremaChantilly;

/**
 * Clase para cafe capuccino con opcion a colocar chantilly con
 * una interfaz
 */

public class Capuccino extends CafeBase implements IColocarCremaChantilly
{
	
	public int lecheEspumosa;
	public int canela;

	/**
	 * Constructor
	 * @param id identidicador del objeto
	 * @param agua cantidad de agua en cc
	 * @param cafe de cafe en cc
	 * @param lecheEspumosa cantidad de leche espumosa
	 * @param canela catidad de canela en cucharadita
	 */
	
	public Capuccino(int id, int agua, int cafe, int lecheEspumosa, int canela) {
		super(id, agua, cafe);
		this.lecheEspumosa = lecheEspumosa;
		this.canela = canela;
	}
	
	public int setLeche() {
		// TODO implement me
		return 0;
	}

	public int setCanela() {
		// TODO implement me
		return 0;
	}

	public int getLeche() {
		// TODO implement me
		return 0;
	}
	
	public int getCanela() {
		// TODO implement me
		return 0;
	}
 
	@Override
	public void colocarCremaCantilly() {
		// TODO Auto-generated method stub
		System.out.println("Colocar Cantilly");
		
	}

}

