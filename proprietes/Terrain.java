package monopoly.proprietes;

import java.util.HashMap;
import monopoly.jeu.Case;

public class Terrain extends ProprieteMonopoly{

	private int niveauImmo;
	HashMap<Integer, Integer> loyers = new HashMap <Integer, Integer>(); 
	
	public Terrain(String nom, Case c, int prixAchat, Groupe grp, int loyer) {
		super(nom, c, prixAchat, grp, loyer);
		this.niveauImmo = 0;
		
	}

	@Override
	public boolean constructible() {
		if (super.groupe().proprietaireUnique()) {
			boolean constructible = true;
			int cpt = 0;
			while (cpt < this.groupe().composition().size() || constructible) {
				if (this.groupe().composition().get(cpt).hypotheque()) {
					constructible = false;
				}
			}
			return constructible;
		}
		return false;
	}

	public int loyer() {
		return loyers.get(niveauImmo);
	}

	public int niveauImmobilier() {
		return niveauImmo;
	}

}
