import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<?> list) {
    // TODO fix method declaration
    System.out.println("Feeding birds" + list);
    list.forEach(Bird::eat);
    // TODO feed birds in the cycle
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting a bird to a section");
    bird.checkWings();
    list.add(bird);
    list.forEach(System.out::println);
    // TODO check flying bird wings
    // TODO add a bird to the list and print it
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<Bird> list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    list.forEach(System.out::println);
    // TODO add a bird to list
    // TODO print birds in the cycle
  }
}