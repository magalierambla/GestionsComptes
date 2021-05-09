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
	public void retirer(float mt) {
		// TODO Auto-generated method stub
		//super.retirer(mt);
		if(mt<solde+decouvert) solde=solde-mt; 
		// Pour pouvoir récupérer le solde qui est définit dans la classe Compte,
		// il faut changer sa visibilité dans la classe Compte de private à protected
		// Quand solde est en visibilité protected il donne l'autorisation à la classe fille CompteSimple de pouvoir utilisé cet attribut.
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("C'est un compte simple");
	}
	
	
	
}
 