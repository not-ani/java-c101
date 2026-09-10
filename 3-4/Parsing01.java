public class Parsing01 {
  public static void main(String[] args) {
    // Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
    String shirtPrice = "15";
    String taxRate = "0.05";
    String gibberish = "887ds7nds87dsf";

    // Parse shirtPrice and taxRate, and print the total tax
    int price = Integer.parseInt(shirtPrice);
    double tax = Double.parseDouble(taxRate);

    System.out.println(price * tax);

    // Try to parse taxRate as an int
    int taxAsInt = Integer.parseInt(taxRate);

    // Try to parse gibberish as an int
    int gibberishAsInt = Integer.parseInt(gibberish);

    System.out.println(taxAsInt);

    System.out.println(gibberishAsInt);
  }
}
