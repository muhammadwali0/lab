public class DuplicateChecker {

  public static void main(String[] args) {
    String[] names = { "ali", "Sara", "azam", "Ali", "ALI" };
    boolean[] isDone = new boolean[names.length];

    for (int i = 0; i < names.length; i++) {

      if (isDone[i]) {
        continue;
      }

      boolean duplFound = false;

      for (int j = i + 1; j < names.length; j++) {

        if (names[i].equalsIgnoreCase(names[j])) {
          duplFound = true;
          isDone[j] = true;
        }

      }

      if (duplFound) {
        System.out.printf("%s is a duplicate item.%n", names[i]);
      }

    }

  }

}
