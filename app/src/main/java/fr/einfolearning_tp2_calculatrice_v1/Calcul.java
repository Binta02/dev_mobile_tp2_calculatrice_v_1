package fr.einfolearning_tp2_calculatrice_v1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by B. LEMAIRE on 2019.
 */

public class Calcul extends Activity {

    // Affichage du résultat du calcul
    private TextView tv_calcul;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // A compléter

        /**
         * Désérialisation des ressources
         */

        deserialiserRessources();

        /**
         * Mise en place de l'écouteur du bouton calculer
         */
        initConnection();


        /**
         * Récupération de l'Intent qui a servi à lancer
         * cette activité
         */
        // A Compléter


        /**
         * Récupération des extras
         */

        // A compléter


        /**
         * Calcul du résultat et affichage du résultat
         */

        // A compléter

    }


    /**
     * Désérialise les ressources
     */
    private void deserialiserRessources() {
        // A compléter
    }

    /**
     * Mise en place des écouteurs
     */
    private void initConnection() {
        // A compléter
    }

}
