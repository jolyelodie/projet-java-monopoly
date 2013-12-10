package monopoly.evenements ;

import java.util.Random ;
import monopoly.jeu.Joueur ;
import monopoly.jeu.Case ;

/** Cette classe est un événement qui permet au joueur de tirer les dés */
public class TirerDes extends EvenementMonopoly{
    /** Nom de l'évenement */
    private String nom ;
    /** Score des dés */
    private int score ;
    /** valeur du premier lancer*/
    private int premierLancer ;
    /** valeur du deuxième lancer */
    private int deuxiemeLancer ;
    /** compteur de double */
    private int compteur ;
    /** Nom du joueur concerné par l'événement */
    private Joueur j ;

    /** Constructeur compteur par défaut*/
    TirerDes(Joueur j, String nom){
	super(j,nom) ;
	score = 0 ;
	compteur = 3 ;
	premierLancer = 0 ;
	deuxiemeLancer = 0 ;
    }

    /** Constructeur compteur modifier*/
    TirerDes(Joueur j,String nom, int compteur){
	super(j,nom) ;
	this.compteur = compteur ;
	score = 0 ;
	premierLancer = 0 ;
	deuxiemeLancer = 0 ;
    }

    /** Execute l'évenement de tirer dés : on lance 2 dés */
    public void executer(){
	Random random = new Random() ;
	premierLancer = random.nextInt(6 - 1 + 1) + 1 ;
	deuxiemeLancer = random.nextInt(6 - 1 + 1) + 1 ;
	getScore(deuxiemeLancer,premierLancer);
	if(estDouble() && setCompteur() == 0){
	    // evenement prison
	    new Prison(j) ;
	}else if(estDouble()){
	    // evenement deplacement
	    new Deplacement(j,setScore()) ;
	    // evenement tirerDes
	    new TirerDes(j,setCompteur()) ;
	}else{
	    // evenement deplacement
	    new Deplacement(j, setScore()) ;
	}
    }

    /** Additionne les dés */
    public void getScore(int premierLancer, int deuxiemeLancer){
	score = premierLancer + deuxiemeLancer ;
    }

    /** Renvoit le score des dés*/
    public int setScore(){
	return score ;
    }

    /** Verifie si c'est un double pour evenement tirer dés ou prison */
    public boolean estDouble() {
	if(premierLancer == deuxiemeLancer){
	    compteur --;
	    return true ;
	}else{
	    return false ;
	}
    }

    /** Renvoit le compteur de double pour evenement prison */
    public int setCompteur(){
	return compteur ;
    }
    
    /** Affiche le score et les valeurs des deux dés */
    public String toString() {
	return super.toString() + ", il a obtenu " + premierLancer + " et " + deuxiemeLancer + " ce qui fait " + score ;
    }
}
