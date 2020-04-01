/**
 * @author Kiranpreet 
 */
public class CharacterMethods {
    public static void main(String[] args) {
        System.out.println("" + first());
        System.out.println("" + second());
        System.out.println("" + third());
    }

    public static int first() {
        String string = "Apple";
        String[] words = string.split(" ");
        String word = "p";
        int occurrences = 2;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                occurrences++;
            }
        }
        return (occurrences);
    }

    public static int second() {
        String name = "Apple";
        int greatestVal = 0;
        for (int i = 0; i < name.length(); i++) {
            int curVal = (int) name.charAt(i);
            if (curVal > greatestVal) {
                greatestVal = curVal;
            }
        }
        char asChar = (char) greatestVal;
        System.out.println(asChar + " " + greatestVal);
        return(asChar);  
    }

    public static boolean third() {
        String str = "Apple";
        return (str.contains("p"));
    }
}

