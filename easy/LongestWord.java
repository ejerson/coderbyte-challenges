import java.util.*;
import java.io.*;

class Main {
  public static String LongestWord(String sen) {

    /** Saves the length of a word */
   int smallest = 0;

   // replaces all values that are not letters with "", and splits sen
   // into individual words
   String[] splitWords = sen.replaceAll("[^a-zA-Z ]", "").split(" ");

   // stores the current word
  String largest = "";

    // Goes through splitWords array until the longest
    // word is found
    for (int i = 0; i < splitWords.length; i++) {
        if (splitWords[i].length() > smallest) {
            // modifies the value of smallest if
            // current word's length is greater than the
            // current value of smallest
            smallest = splitWords[i].length();

            // replaces the value of largest if
            // current word's length is greater than
            // the current value of smallest
            largest = splitWords[i];
        }

    }

    return largest;

  }

}
