public class Main {
  public static void main(String[] args) {
    Pet cat = new Pet("Felix", "Bengal", "male", 2, true);
    Pet dog = new Pet("Lester", "Chihuahua", "male", 3, true);

    cat.call("meow");
    cat.eat("fish");
    cat.sleep();

    dog.call("woof");
    dog.eat("bone");
    dog.sleep();

  }
}
