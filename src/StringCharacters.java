public class StringCharacters {
  public static void main(String[] args) {
    String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
    int spaces = 0,
        vowels = 0,
        letters = 0;
    // YOUR CODE HERE
    char[] specialArray = new char[] { 'a', 'e', 'i', 'o', 'u', ' ', ',', ';', '`', '.', '?', '!' };

    start: for (int i = 0; i < text.length(); i += 1) {
      for (char specialArrayChar : specialArray) {
        if (text.charAt(i) == specialArrayChar) {
          switch (specialArrayChar) {
            case 'a', 'e', 'i', 'o', 'u':
              vowels += 1;
              letters += 1;
              continue start;
            case ' ':
              spaces += 1;
              continue start;
            default:
              // as i understand special characters like ',', ';', '`', '.', '?', '!' are
              // not letters
              continue start;
          }
        }
      }
      letters += 1;
    }

    System.out.println(
        "The text contained vowels: " + vowels + "\n" + " consonants: " + (letters - vowels) + "\n" + " spaces: "
            + spaces);
  }
}
