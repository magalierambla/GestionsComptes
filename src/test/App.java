/**
 * 
 */
package test;

import a.b.c.*; 
/**
 * @author rambl
 * Je ne peux pas cr�er un nouveau Compte car classe abstraite,
 * Je peux cr�er un nouveau CompteSimple (h�ritage)
 * 
 * Heritage classique
 *
 */
public class App {
	public static void main(String[] args) {
		// Compte c = new Compte();
		// Compte c = new Compte(1, 5000);
		Compte c = new CompteSimple(1, 4000, 500);
		c.verser(5000);
		c.retirer(3000);
		System.out.println(c.toString());
	}
}
