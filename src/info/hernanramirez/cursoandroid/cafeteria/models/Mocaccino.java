package info.hernanramirez.cursoandroid.cafeteria.models;

import info.hernanramirez.cursoandroid.cafeteria.interfaces.IColocarCremaChantilly;

/**
 * Clase para cafe mocaccino con opcion a colocarle Chantilly
 * a traves de una interfaz
 */

public class Mocaccino extends CafeBase implements IColocarCremaChantilly
{
	public int lecheEspumosa;
	public int cacao;

	/*
	 * Constructor
	 * @param id identifiacodor del objeto 
	 * @param agua cantidad de agua en cc
	 * @param cafe de cafe en cc
	 * @param lecheEspumosa cantidad de leche espumante en cc
	 * @param cacao cantidad de cacao en cucharadita
	 */
	public Mocaccino(int id, int agua, int cafe, int lecheEspumosa, int cacao) {
		super(id, agua, cafe);
		// TODO Auto-generated constructor stub
		this.lecheEspumosa = lecheEspumosa;
		this.cacao = cacao;
	}
	
	
	public int setLeche() {
		// TODO implement me
		return 0;
	}

	public int setCacao() {
		// TODO implement me
		return 0;
	}

	public int getLeche() {
		// TODO implement me
		return 0;
	}

	public int getCacao() {
		// TODO implement me
		return 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see info.hernanramirez.cursoandroid.cafeteria.models.CafeBase#mostrarDatos(java.lang.String)
	 */
	
	@Override
	public void mostrarDatos(String clase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(clase);
		System.out.println("Cantidad de leche espumosa en cc: " + lecheEspumosa);
		System.out.println("Cantidad de cacao en cc: " + cacao);
	}
	
	/*
	 * (non-Javadoc)
	 * @see info.hernanramirez.cursoandroid.cafeteria.interfaces.IColocarCremaChantilly#colocarCremaCantilly()
	 */

	@Override
	public void colocarCremaCantilly() {
		System.out.println("Colocar Cantilly");
		
	}

}

