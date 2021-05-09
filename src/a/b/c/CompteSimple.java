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
	public void retirer(float mt) {
		// TODO Auto-generated method stub
		//super.retirer(mt);
		if(mt<solde+decouvert) solde=solde-mt; 
		// Pour pouvoir r�cup�rer le solde qui est d�finit dans la classe Compte,
		// il faut changer sa visibilit� dans la classe Compte de private � protected
		// Quand solde est en visibilit� protected il donne l'autorisation � la classe fille CompteSimple de pouvoir utilis� cet attribut.
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("C'est un compte simple");
	}
	
	
	
}
 