package modele;

/**
 * Classe utilitaire contenant des motifs prédéfinis pour le Jeu de la Vie.
 */
public class Motif {

    // Motif "Glider"
    public static final boolean[][] GLIDER = {
            {false, true, false},
            {false, false, true},
            {true, true, true}
    };

    // Motif "Block" 
    public static final boolean[][] BLOCK = {
            {true, true},
            {true, true}
    };

    // Motif "Blinker" 
    public static final boolean[][] BLINKER = {
            {false, false, false},
            {true, true, true},
            {false, false, false}
    };

    // Motif "Toad"
    public static final boolean[][] TOAD = {
            {false, false, false, false},
            {false, true, true, true},
            {true, true, true, false},
            {false, false, false, false}
    };

    // Motif "Beacon" 
    public static final boolean[][] BEACON = {
            {true, true, false, false},
            {true, true, false, false},
            {false, false, true, true},
            {false, false, true, true}
    };

    // Constructeur privé pour empêcher l'instanciation
    private Motif() {
        throw new UnsupportedOperationException("classe ne doit pas être instanciee.");
    }
}
