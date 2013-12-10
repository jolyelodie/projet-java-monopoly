package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui permet au joueur de modifier son solde */
public class Depense extends EvenementMonopoly{
    /**Nom de l'évenement */
    private String nom ;
    /** Nom du joueur */
    private Joueur j ;
    /** Depense */
    private int depense ;
    
    /** Constructeur */
    Recette(Joueur j, String nom, int depense){
	super(j, nom) ;
	this.depense = depense ;
    }

    /** Execute l'évenement depense qui permet de mettre à jour le nouveau solde du joueur*/
    public void executer() {
	// à compléter
	
    }
}
