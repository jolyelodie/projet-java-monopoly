package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui permet au joueur de remplir son solde */
public class Recette extends EvenementMonopoly{
    /**Nom de l'évenement */
    private String nom ;
    /** Nom du joueur */
    private Joueur j ;
    /** Recette */
    private int recette ;
    
    /** Constructeur */
    Recette(Joueur j, String nom, int recette){
	super(j, nom) ;
	this.recette = recette ;
    }

    /** Execute l'évenement recette qui permet de mettre à jour le nouveau solde du joueur*/
    public void executer() {
	j.verser(recette) ;
	
    }
}
