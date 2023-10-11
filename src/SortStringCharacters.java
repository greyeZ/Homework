public class SortStringCharacters {

  // Words are all letters until the first specialArray character e.g. ' ', ',',
  // ';', '`', '.', '?', '!'
  // Furthermore I leave all chars as they are (no toLowerCase()) therefore first
  // come all uppercase chars
  // and afterwards all lowercase characters. Therefore for example is the first
  // "To" still a "To"
  public static void main(String[] args) {
    String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
    char[] specialArray = new char[] { ' ', ',', ';', '`', '.', '?', '!' };
    String sortedText = "";
    String word = "";
    start: for (int i = 0; i < text.length(); i += 1) {

      for (char specialArrayChar : specialArray) {
        if (text.charAt(i) == specialArrayChar) {
          sortedText += sortWord(word) + specialArrayChar;
          word = "";
          continue start;
        }
      }
      word += text.charAt(i);
    }
    System.out.println(sortedText);
  }

  private static String sortWord(String word) {
    char charArray[] = word.toCharArray();
    int temp;
    for (int i = 0; i < word.length(); i += 1) {
      for (int j = i + 1; j < word.length(); j += 1) {
        if (charArray[i] > charArray[j]) {
          temp = charArray[i];
          charArray[i] = charArray[j];
          charArray[j] = (char) temp;
        }
      }
    }
    return new String(charArray);
  }
}
