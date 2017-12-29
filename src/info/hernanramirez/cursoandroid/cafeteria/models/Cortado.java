package info.hernanramirez.cursoandroid.cafeteria.models;


/**
 * Clase cafe cortado
 */

public class Cortado extends CafeBase
{
	public int leche;

	/**
	 * Constructor
	 * @param id identifiacodor del objeto 
	 * @param agua cantidad de agua en cc
	 * @param cafe de cafe en cc
	 * @param leche cantidad de leche en cc
	 */
	 public Cortado(int id, int agua, int cafe, int leche) {
		super(id, agua, cafe);
		this.leche = leche;
	}

	
	public int getLeche() {
		// TODO implement me
		return 0;
	}

	@Override
	public void mostrarDatos(String clase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(clase);
		System.out.println("Cantidad de leche en cc:" + leche );
	}
	
	


}

