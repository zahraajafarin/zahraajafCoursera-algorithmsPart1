import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double i = 0;
        String champion = "";
        while (!StdIn.isEmpty()) {
            i++;
            String word = StdIn.readString();
            boolean p = StdRandom.bernoulli(1/i);
            if(p) {
                champion = word;
            }
        }
        StdOut.println(champion);
    }
}
