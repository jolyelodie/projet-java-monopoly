package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui permet de déplacer le joueur sur une case du plateau */
public class Deplacement extends EvenementMonopoly{
    /** Nombre de case dans le plateau */
    private static final int nbCasePlateau = 40 ;
    /** Nom de l'evenement */
    private String nom ;
    /** Nom de la case où le joueur doit se déplacer */
    private Case deplace ;
    /** Nom du joueur */
    private Joueur j ;
    /** Nombre de case a déplacer */
    private int nbCaseDeplace ;
    /** Constructeur */
    Deplacement(Joueur j,String nom, Case deplace){
	super(j,nom) ;
	this.deplace = deplace ;
    }

    /** Constructeur pour lancer des */
    Deplacement(Joueur j, String nom, int nbCaseDeplace){
	super(j, nom);
	this.nbCaseDeplace = nbCaseDeplace ;
    }

    /** Execute l'événement de déplacement */
    public void executer(){
	//récupere la case où se trouve le joueur
	Case position = j.position() ;
	// récupére le num de la case où se trouve le joueur
	int numCasePosition = position.numero() ;
	// calcul le nombre de case à déplacer
	int numCaseDeplace = nbCaseDeplace + numCasePosition ;
	// condition de deplacement
	if(numCasePlace > nbCasePlateau){
	    numCasePlace = numCasePlace - nbCasePlateau ;
	}
	// récupére la case où le joueur doit se déplacer
	place = place.get(numCasePlace) ;
	// positionne le joueur
	j.placerSur(place) ;
    }    
}
