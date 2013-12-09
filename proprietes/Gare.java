package monopoly.proprietes;

import monopoly.jeu.Case;

public class Gare extends Monopole{
	
	public Gare(String nom, Case c, int prixAchat, Groupe grp, int loyer) {
		super(nom, c, prixAchat, grp, loyer);
		
	}

	@Override
	public int loyer() {
		// TODO Auto-generated method stub
		return 0;
	}	

}
