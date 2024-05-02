package fr.einfolearning_tp2_calculatrice_v1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fr.einfolearning_tp2_v1.R;


public class MainActivity extends Activity {

    // Clefs pour les extras de de l'Intent
    public final static String OPERANDE_1 = "operande_1";
    public final static String OPERANDE_2 = "operande_2";
    public final static String OPERATEUR = "operateur";

    private EditText operande_1;    // Zone d'édition pour l'operande 1
    private EditText operande_2;    // Zone d'édition pour l'operande 2
    private EditText operateur;     // Zone d'édition pour l'operateur
    private Button bt_calculer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Permet de désérialiser le layout
         * (gestionnaire de placement des widgets (boutons, zones de saisies, etc.)
         * Important : Cette instruction est importante pour "qu'apparaisse' l'interface
         * utilisateur correspondant à l'activité sur le terminal
         * et pour pouvoir desérialiser les widgets (transformer les widgets en
         * instances java)
         */
        setContentView(R.layout.activity_main);

        /**
         * Désérialisation des ressources
         * Transforme les widgets (composants graphiques) en instance Java
         */

        deserialiserRessources();

        /**
         * Mise en place de l'écouteur du bouton calculer
         */
        initConnection();

        // A compléter

    }

    /**
     * Désérialise les ressources
     */
    private void deserialiserRessources() {
        this.operande_1 = (EditText) this.findViewById(R.id.et_op1);
        this.operande_2 = (EditText) this.findViewById(R.id.et_op2);
        this.operateur = (EditText) this.findViewById(R.id.et_oper);

        // A compléter
    }

    /**
     * Mise en place des écouteurs
     */
    private void initConnection() {
        /** Dans l'écouteur il faut :
         *
         * - Instancier un Intent explicite
         * - Charger les extras pour le calcul
         * - Lancer l'activité de calcul
         */

        // A compléter
        bt_calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /** On récupère le nombre de l'EditText
                 * sous forme d'une chaine de caractère à partir du
                 * widget EditText
                 *
                 * Important : le toString est obligatoire

                 */
                String sNb = operande_1.getText().toString();
                String sNb1 = operande_2.getText().toString();
                String sNb2 = operateur.getText().toString();


                int number = Integer.parseInt(sNb);
                int number1 = Integer.parseInt(sNb1);
                int number2 = Integer.parseInt(sNb2);


                Intent intent = new Intent(MainActivity.this, Calcul.class);
                    intent.putExtra("Calculer", number + number1);
                    startActivity(intent);
                    // Conversion de sNb en un nombre entier

                    // A compléter
            }
        });
    }
}
