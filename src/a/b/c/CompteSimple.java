/**
 * 
 */
package a.b.c;

/**
 * @author rambl
 *
 */
public class CompteSimple extends Compte {
	
	private float decouvert;

	/**
	 * Constructeur avec 3 paramètres : code - solde - decouvert
	 * @param code
	 * @param solde
	 * @param decouvert
	 */
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
	
	/**
	 * Redefinition de la méthode retirer qui existe dans la classe mère Compte 
	 * mais qui ne possède pas le paramètre decouvert qui est propre à la classe CompteSimple
	 * @param mt
	 */
	@Override
	private void retirer(float mt) {
		// TODO Auto-generated method stub
		super.retirer(mt);
	}
	
	
}
 