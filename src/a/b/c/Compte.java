package a.b.c;

public abstract class Compte {
	/**
	 * Attributs de la classe Compte
	 * private -> protected pour que solde puisse �tre utilisable dans classe h�rit�e CompteSimple
	 */
	private int code;
	protected float solde; // <= private float solde;
	
	/**
	 * Constructeur avec param�tres 
	 * @param code
	 * @param solde
	 */
	public Compte(int code, float solde) {
		this.code = code;
		this.solde = solde;
	}

	/**
	 * Constructeur sans param�tres
	 */
	public Compte() {
		
	}
	
	/**
	 * M�thode abstraite de la classe Compte
	 * Cela oblige la classe h�rit�e � red�finir afficher
	 */
	public abstract void afficher();
	
	/**
	 * M�thode verser
	 * @param mt
	 */
	public void verser(float mt) {
		solde=solde+mt;
	}
	
	/**
	 * M�thode retirer
	 * @param mt
	 */
	public void retirer(float mt) {
		solde-=mt; //<=> solde=solde-mt;
	}
	
	/**
	 * M�thode getSolde pour r�cup�rer le solde du Compte
	 * @return solde
	 */
	public float getSolde() {
		return solde;
	}
	
	/**
	 * M�thode toString
	 */
	public String toString() {
		return "Code="+code+" Solde="+solde;
	}
	
}
