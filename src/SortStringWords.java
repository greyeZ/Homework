import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringWords {

  // Words are all letters until the first specialArray character e.g. ' ', ',',
  // ';', '.', '?', '!'
  // Capital Letters come before special characters and them before lowercase
  // letters
  public static void main(String[] args) {
    String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
    char[] specialArray = new char[] { ' ', ',', ';', '.', '?', '!' };
    List<String> words = new ArrayList<String>();
    String word = "";
    start: for (int i = 0; i < text.length(); i += 1) {

      for (char specialArrayChar : specialArray) {
        if (text.charAt(i) == specialArrayChar) {
          if (word.length() > 0) {
            words.add(word);
          }
          word = "";
          continue start;
        }
      }
      word += text.charAt(i);
    }
    sordWordArray(words);
  }

  private static void sordWordArray(List<String> words) {
    int wordIterationIndex = 0;
    for (int i = 0; i < words.size(); i += 1) {
      start: for (int j = i + 1; j < words.size(); j += 1) {
        if (words.get(i).length() <= words.get(j).length()) {
          wordIterationIndex = words.get(i).length();
        } else {
          wordIterationIndex = words.get(j).length();
        }
        for (int k = 0; k < wordIterationIndex; k += 1) {
          if (words.get(i).charAt(k) < words.get(j).charAt(k)) {
            continue start;
          }
          if (words.get(i).charAt(k) > words.get(j).charAt(k)) {
            Collections.swap(words, i, j);
            continue start;
          }
        }
      }
    }
    System.out.println(words);
  }

}
