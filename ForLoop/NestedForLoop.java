package ForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        // Nested for loop to print a multiplication table
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
