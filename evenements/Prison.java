package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui emprisonne le joueur */
public class Prison extends EvenementMonopoly{
    /** Nom du joueur */
    private Joueur j ;
    /** Case prison */
    private static final Case prison = PRISON ;
    
    /** Constructeur */
    Prison(Joueur j){
	this.j = j ;
    }

    /** Execute l'evenement Prison */
    public void executer(){
	// deplacement dans prison
	new Deplacement(j, prison) ;
	// bloquer 3 tours
	// a compléter
    }
}
