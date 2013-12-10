package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe détail l'événement d'une seule carte */
public class Carte extends EvenementMonopoly{
    // attributs
    private String type ;
    private String evenement ;
    private Joueur j;
    
    /** Constructeur avec comme parametre le type de Carte soit Chance ou CC, le nom de l'evenement et le nom du joueur*/
    Carte(Joueur j, String evenement, String type){
	super(j,evenement) ;
	this.type = type ;
    }

    /** Savoir si la carte a déjà été tirer*/
    public boolean estTirer() {
	System.out.println("Appel de la methode boolean estTirer() dans Carte");
	return false ;
	// à compléter
    }

    /** Savoir si la carte est disponible pour le joueur ou si elle est gardée par un autre joueur */
    public boolean estDisponible() {
	System.out.println("Appel de la methode boolean estDisponible() dans Carte");
	return false ;
	// à compléter
    }

    /** Renvoit le type de carte piochée*/
    public String setType(){
	return type ;
    }

    /** Affiche le type de carte piochée */
    public String toString() {
	return super.toString() + ", son type de carte est " + type ;
    }

    /** Execute l'évenement */
    public void executer(){
	// à compléter
    }
}
