public class Chickens01 {
  public static void main(String[] args) {
    // Put yout code here
    int eggsPerChicken = 5;
    int chickenCount = 3;

    int totalEggs = chickenCount * eggsPerChicken;

    chickenCount++;
    totalEggs += chickenCount * eggsPerChicken;

    chickenCount /= 2;
    totalEggs += chickenCount * eggsPerChicken;

    System.out.println(totalEggs);
  }
}
