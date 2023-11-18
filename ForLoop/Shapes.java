package ForLoop;
public class Shapes {
  public static void main(String[] args) {
      displayBox();
      displayOval();
      displayArrow();
      displayDiamond();
  }

  public static void displayBox() {
      System.out.println("Box:");
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
      System.out.println();
  }

  public static void displayOval() {
      System.out.println("Oval:");
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5; j++) {
              if (i == 0 || i == 4 || j == 0 || j == 4) {
                  System.out.print("* ");
              } else {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
      System.out.println();
  }

  public static void displayArrow() {
      System.out.println("Arrow:");
      for (int i = 0; i < 5; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
      for (int i = 3; i >= 0; i--) {
          for (int j = 0; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
      System.out.println();
  }

  public static void displayDiamond() {
      System.out.println("Diamond:");
      int n = 5; // Adjust the value for the size of the diamond
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n - i; j++) {
              System.out.print(" ");
          }
          for (int j = 0; j <= i * 2; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      for (int i = n - 2; i >= 0; i--) {
          for (int j = 0; j < n - i; j++) {
              System.out.print(" ");
          }
          for (int j = 0; j <= i * 2; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
