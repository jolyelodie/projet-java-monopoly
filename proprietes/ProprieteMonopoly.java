package monopoly.proprietes;

import monopoly.jeu.Case;
import monopoly.jeu.Joueur;

public abstract class ProprieteMonopoly implements Propriete{

	private String nom;
	private Case c;
	private int prixAchat;
	private Groupe grp;
	private int loyer;
	private int niveauImmo;
	private Joueur proprio = null;
	private boolean hypotheque;


	public ProprieteMonopoly(String nom, Case c, int prixAchat, Groupe grp, int loyer){
		niveauImmo = 0;
		this.nom = nom;
		this.c = c;
		this.prixAchat = prixAchat;
		this.grp = grp;
		this.loyer = loyer;
		hypotheque = false;

	}

	public Case position() {
		return c;
	}

	public String nom() {
		return nom;
	}

	public boolean hypotheque() {
		return hypotheque;
	}

	public void hypothequer() {
		if (!hypotheque) {
			hypotheque = true;
			proprio.verser(loyer/2);	
		}

	}
	
	public boolean deshypothequer() {
		int valeurDeshypo = (loyer/2)+(loyer/2)*(10/100);
		if (hypotheque) {
			if(proprio.payer(valeurDeshypo)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}


	public int prixAchat() {
		return prixAchat;
	}


	public Groupe groupe() {
		return grp;
	}

	
	public abstract boolean constructible(); 

	
	public boolean construire() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean detruire() {
		// TODO Auto-generated method stub
		return false;
	}


	public Joueur proprietaire() {
		return proprio;
	}


	public abstract int loyer();

	public abstract int niveauImmobilier();

}
