package Lab;

public class Kata2 {

    public String winner(String[] deckSteve, String[] deckJosh) {
        String[] cards = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
        int stevewins = 0;
        int joshwins = 0;
        for (int i = 0; i < deckSteve.length; i++) {
            int stevepoints = indexOf(cards, deckSteve[i]);
            int joshpoints = indexOf(cards, deckJosh[i]);

            if (stevepoints > joshpoints) {
                stevewins++;
            } else if (joshpoints > stevepoints) {
                joshwins++;
            }
        }
        return (stevewins == joshwins) ? "Tie" : (stevewins > joshwins) ? "Steve wins " + stevewins + " to " + joshwins : "Josh wins " + joshwins + " to " + stevewins;
    }

    private int indexOf(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1; // Handle the case where the target is not found in the array
    }
}
