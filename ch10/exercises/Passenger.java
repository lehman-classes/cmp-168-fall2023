public class Passenger implements Eater {

  public void eat(Food food) {
    System.out.println("Eating " + food.getName());
  }

  public void eat(Food[] foods) {
    for (Food food : foods) {
      System.out.println("Eating " + food.getName());
    }
  }
}
