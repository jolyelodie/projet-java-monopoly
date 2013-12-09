package monopoly.jeu;

import java.util.ArrayList;

import monopoly.evenements.Evenement;
import monopoly.proprietes.Propriete;
/**
 * 
 * @author DELVALLEE Adrien & JOLY Elodie
 * Classe créant une case du plateau
 * Ajouté le 9 décembre 2013
 */
public class CaseMonopoly implements Case {
	
	/**
	 * Liste des cases
	 */
	public static ArrayList<CaseMonopoly> listeCase = new ArrayList<CaseMonopoly>();
	/**
	 * numéro de la case
	 */
	private int numero;
	/**nom de la case*/
	private String nom;
	/**propriété associé à la case*/
	private Propriete propriete;
	/**event associé à la case*/
	private Evenement event;

	/**
	 * Constructeur de la classe
	 * @param numero 
	 * @param nom 
	 * @param propriete 
	 * @param event 
	 */
	public CaseMonopoly(int numero, String nom, Propriete propriete, Evenement event){
		this.nom = nom;
		this.numero = numero;
		this.propriete = propriete;
		listeCase.add(this);
		this.event = event;
	}
	
	//Renvoyer le numéro de la case
	public int numero() {
		return numero;
	}

	//Renvoyer la case à la position numéro
	public Case get(int numero) {
		return listeCase.get(numero);
	}

	//Retourner le nom de la case
	public String nom() {
		return nom;
	}

	//Retourne la propriété associé à la case
	public Propriete propriete() {
		return propriete;
	}

	//Retourne l'événement associé à la case
	public Evenement evenement() {
		return event;
	}

}
