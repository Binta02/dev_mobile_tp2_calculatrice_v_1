package fr.einfolearning_tp2_calculatrice_v1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import fr.einfolearning_tp2_v1.R;

/**
 * Created by B. LEMAIRE on 2019.
 */

public class Calcul extends Activity {

    // Affichage du résultat du calcul
    private TextView tv_calcul;
    private Button bt_retour;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calcul);

        // A compléter

        /**
         * Désérialisation des ressources
         */
        afficherResultat();

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
        Intent intent = getIntent();


        /**
         * Récupération des extras
         */
        int nombre = intent.getIntExtra("NUMBER", 0);

        // A compléter


        /**
         * Calcul du résultat et affichage du résultat
         */
        tv_calcul.setText(String.valueOf(nombre));

        // A compléter

    }


    /**
     * Désérialise les ressources
     */
    private void deserialiserRessources() {
        // A compléter
        tv_calcul = findViewById(R.id.tv_res);
        bt_retour = findViewById(R.id.bt_retour);
    }

    private void afficherResultat() {
        int resultat = getIntent().getIntExtra("Calculer", 0);
        tv_calcul.setText(String.valueOf(resultat));
    }

    /**
     * Mise en place des écouteurs
     */
    private void initConnection() {

        bt_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // A compléter
    }

}
