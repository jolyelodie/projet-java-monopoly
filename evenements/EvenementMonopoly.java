package monopoly.evenements ;

import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe gère les évenements du jeu monopoly deposer le : 10/12/2013 mis a jour le : 10/12/2013*/
public abstract class EvenementMonopoly implements Evenement{
    /**Nom de l'événement */
    private String nom ;
    /** Nom du joueur concerné par l'événement */
    private Joueur j;

    /** Constructeur avec en parametre l'evenement */
    EvenementMonopoly(Joueur j, String nom){
	this.nom = nom ;
	this.j = j ;
    }

    /** Intitulé de l'événement (i.e en principe de la case associée ou de la carte*/
    public String nom(){
	System.out.println("Appel de la methode String nom() dans EvenementMonopoly");
	return nom ;
    }
    
    /** Le joueur qui subit l'événement */
    public Joueur cible() {
	System.out.println("Appel de la methode Joueur cible() dans EvenementMonopoly");
	return j ;
    }
    
    /** Execute l'événement methode abstraite, dépend de l'événement*/
    public abstract void executer(){};

    /** Affiche le nom du joueur associé a un événement */
    public String toString() {
	return "Le joueur " + j + " a pour événement " + nom ;
    }
}
