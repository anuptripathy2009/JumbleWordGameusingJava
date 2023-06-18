import java.util.Random;
public class Words {
    String[] words = {
            "apple", "banana", "cat", "dog", "elephant",
            "flower", "guitar", "hat", "ice cream", "jacket",
            "kite", "lion", "monkey", "nest", "orange",
            "pear", "quilt", "rabbit", "sun", "tree",
            "umbrella", "violin", "watermelon", "lamp", "yogurt",
            "zebra", "car", "book", "ball", "chair",
            "desk", "door", "egg", "fish", "globe",
            "hammer", "island", "juice", "key", "lamp",
            "mango", "notebook", "ocean", "pencil", "queen",
            "rose", "shoes", "table", "unicorn", "vase"
    };



    public Random rand = new Random(); //creating a random class to use it


    public String getWord() {
        int index = rand.nextInt(words.length); // gives random value from 0 to words.length
        return this.words[index];
    }

    public String jumbled(String word) {
        char[] letters = word.toCharArray();
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }

        return new String(letters);
        }

}
