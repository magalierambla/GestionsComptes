package a.b.c;

public abstract class Compte {
	/**
	 * Attributs de la classe Compte
	 * private -> protected pour que solde puisse être utilisable dans classe héritée CompteSimple
	 */
	private int code;
	protected float solde; // <= private float solde;
	
	/**
	 * Constructeur avec paramètres 
	 * @param code
	 * @param solde
	 */
	public Compte(int code, float solde) {
		this.code = code;
		this.solde = solde;
	}

	/**
	 * Constructeur sans paramètres
	 */
	public Compte() {
		
	}
	
	/**
	 * Méthode abstraite de la classe Compte
	 * Cela oblige la classe héritée à redéfinir afficher
	 */
	public abstract void afficher();
	
	/**
	 * Méthode verser
	 * @param mt
	 */
	public void verser(float mt) {
		solde=solde+mt;
	}
	
	/**
	 * Méthode retirer
	 * @param mt
	 */
	public void retirer(float mt) {
		solde-=mt; //<=> solde=solde-mt;
	}
	
	/**
	 * Méthode getSolde pour récupérer le solde du Compte
	 * @return solde
	 */
	public float getSolde() {
		return solde;
	}
	
	/**
	 * Méthode toString
	 */
	public String toString() {
		return "Code="+code+" Solde="+solde;
	}
	
}
