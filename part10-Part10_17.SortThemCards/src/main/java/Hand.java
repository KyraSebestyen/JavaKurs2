import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        cards = cards.stream().sorted().collect(Collectors.toList());
    }

    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = this.cards.stream()
                .mapToInt(Card::getValue)
                .sum();
        int handValue = hand.cards.stream()
                .mapToInt(Card::getValue)
                .sum();
        return Integer.compare(thisValue, handValue);
    }
}
