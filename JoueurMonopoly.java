package monopoly.jeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import monopoly.evenements.Evenement;
import monopoly.proprietes.Propriete;

/**
 * 
 * @author DELVALLEE Adrien, Elodie Joly
 *Classe represantant un joueur de monopoly
 */
public class JoueurMonopoly implements Joueur {

	private int numero;
	private String nom;
	private int especes;
	private List<Joueur> adversaires;
	private boolean estElimine;
	private List<Propriete> proprietes;
	
	public JoueurMonopoly(int numero,String nom,int especes){
		this.numero = numero;
		this.nom = nom;
		this.especes = especes;
		this.estElimine = false;
		adversaires = new ArrayList<Joueur>();
		proprietes = new ArrayList<Propriete>();
		
	}
	
	public int numero() {
		return numero;
	}

	
	public String nom() {
		return nom;
	}

	@Override
	public boolean enPrison() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void emprisonner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean elimine() {
		return estElimine;
	}

	@Override
	public void eliminer() {
		// TODO Auto-generated method stub
		
	}

	public int especes() {
		return especes;
	}

	
	public boolean payer(int somme) {
		if (especes >= somme) {
			especes -= somme;
			return true;
		}
		return false;
	}

	@Override
	public void verser(int somme) {
		especes += somme;
		
	}

	@Override
	public Case position() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placerSur(Case c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Joueur> adversaires() {
		return adversaires;
	}

	@Override
	public List<Propriete> titres() {
		return proprietes;
	}

	@Override
	public List<Evenement> cartes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stack<Evenement> chosesAFaire() {
		// TODO Auto-generated method stub
		return null;
	}

}
