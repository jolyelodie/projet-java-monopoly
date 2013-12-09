package monopoly.proprietes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import monopoly.jeu.CaseMonopoly;
import monopoly.jeu.JoueurMonopoly;

public class GroupeMonopoly implements Groupe{
	
	private String nom;
	private int prixConstruct;
	private List<Propriete> listeProprietes;
	public static HashMap<String,Groupe> listeGroupe = new HashMap<String, Groupe>();
	
	public GroupeMonopoly(String nom, int prixConstruc){
		this.nom = nom;
		this.prixConstruct = prixConstruct;
		listeProprietes = new ArrayList<Propriete>();
		listeGroupe.put(nom, this);
	}

	public String nom() {
		return nom;
	}

	public int coutImmo() {
		return prixConstruct;
	}

	public List<Propriete> composition() {
		return listeProprietes;
	}

	public Groupe get(String nom) {
		if(listeGroupe.containsKey(nom)){
			return listeGroupe.get(nom);
		}
		return null;
	}

	public boolean proprietaireUnique() {
		int numero = listeProprietes.get(0).proprietaire().numero();
		boolean identique = true;
		int cpt = 1;
		if (numero == 0) {
			return false;
		}else{
			while (identique || cpt < listeProprietes.size()) {
				if (listeProprietes.get(cpt).proprietaire().numero() != numero) {
					identique = false;
				}
				cpt++;
			}
		}
		return identique;
	}

}
