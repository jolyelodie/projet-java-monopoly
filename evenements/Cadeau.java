package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui permet de gérer les cadeaux du joueur */
public class Cadeau extends EvenementMonopoly{
    /**Nom de l'évenement */
    private String nom ;
    /** Nom du joueur */
    private Joueur j ;
    
    /** Constructeur */
    Recette(Joueur j, String nom){
	super(j, nom) ;
    }

    /** Execute l'évenement cadeau qui permet de mettre à jour le nouveau solde du joueur*/
    public void executer() {
	// à compléter
	
    }
}
