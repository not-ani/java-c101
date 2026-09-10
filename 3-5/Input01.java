import javax.swing.JOptionPane;

public class Input01 {
  public static void main(String[] args) {
    // Create a JOptionPane.
    // Store the input as a String and print it.
    String i = JOptionPane.showInputDialog("Enter a number:");
    System.out.println(i);

    // Parse the input as an int.
    // Print its value +1
    int num = Integer.parseInt(i);
    System.out.println(num + 1);

    // Try creating a dialog, parsing it, and initializing an int in a single line.
    // You should have only one semicolon (;) in this line.
    int sN = Integer.parseInt(JOptionPane.showInputDialog("Enter another number:"));
    System.out.println(sN);
  }
}
