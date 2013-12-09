package monopoly.jeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import monopoly.evenements.Evenement;
import monopoly.proprietes.Propriete;

/**
 *@author DELVALLEE Adrien, Elodie JOLY
 *Classe represantant un joueur de monopoly
 *Modifie le : 9 décembre 2013
 */
public class JoueurMonopoly implements Joueur {

		public static ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>(); 
        private int numero;
        private String nom;
        private int especes;
        private boolean estElimine;
        private List<Propriete> proprietes;
        private Case position;
        private Stack<Evenement> chosesAFaire = new Stack<Evenement>();
        private ArrayList<Evenement> cartesPossedees = new ArrayList<Evenement>();
        private boolean estEnPrison;
        /**
         * Crée un joueur de monopoly
         * @param numero
         * @param nom
         * @param especes
         */
        public JoueurMonopoly(int numero,String nom,int especes){
                this.numero = numero;
                this.nom = nom;
                this.especes = especes;
                this.estElimine = false;
                proprietes = new ArrayList<Propriete>();
                listeJoueur.add(this);
                estEnPrison = false;
                
        }
         //Retourne le numero du joueur
        public int numero() {
                return numero;
        }
         //Retourne le nom du joueur
        public String nom() {
                return nom;
        }

        //Verifie si le joueur est en prison
        public boolean enPrison() {
               return estEnPrison;
        }

        @Override
        public void emprisonner() {
                this.estEnPrison = true;
                
        }

        @Override
        public boolean elimine() {
                return estElimine;
        }

        @Override
        public void eliminer() {
                this.estElimine = true;
                
        }

        //Retourne la monaie disponible
        public int especes() {
                return especes;
        }

        //Retire "somme" au crédit du joueur
        public boolean payer(int somme) {
                if (especes >= somme) {
                        especes -= somme;
                        return true;
                }
                return false;
        }

        //Ajoute "somme" au solde du joueur
        public void verser(int somme) {
                especes += somme;
                
        }

        
        public Case position() {
                return position;
        }

        
        public void placerSur(Case c) {
               this.position = c;
        	
        }

        //Retourne la liste des adversaires
        public List<Joueur> adversaires() {
                return listeJoueur;
        }

        @Override
        public List<Propriete> titres() {
                return proprietes;
        }

        @Override
        public List<Evenement> cartes() {
               return cartesPossedees;
        }

        @Override
        public Stack<Evenement> chosesAFaire() {
                return chosesAFaire;
        }
        
       
}
