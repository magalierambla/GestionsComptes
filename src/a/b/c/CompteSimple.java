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
	 * Constructeur avec 3 param�tres : code - solde - decouvert
	 * @param code
	 * @param solde
	 * @param decouvert
	 */
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}
	
	/**
	 * Redefinition de la m�thode retirer qui existe dans la classe m�re Compte 
	 * mais qui ne poss�de pas le param�tre decouvert qui est propre � la classe CompteSimple
	 * @param mt
	 */
	@Override
	private void retirer(float mt) {
		// TODO Auto-generated method stub
		super.retirer(mt);
	}
	
	
}
 