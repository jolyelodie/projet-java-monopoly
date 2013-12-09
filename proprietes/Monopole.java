package monopoly.proprietes;

import monopoly.jeu.Case;

public abstract class Monopole extends ProprieteMonopoly {
	
	
	public Monopole(String nom, Case c, int prixAchat, Groupe grp, int loyer){
		super(nom, c, prixAchat, grp, loyer);
	}		

	@Override
	public int niveauImmobilier() {
		return 0;
	}
	public boolean constructible() {		
		return false;
	}

}
