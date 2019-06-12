public class AnimalShelter {
  private Queue<Dog> dogQueue;
  private Queue<Cat> catQueue;

  public AnimalShelter() {
    this.dogQueue = new Queue<>();
    this.catQueue = new Queue<>();
  }

  public void enqueue(Dog d) {
    this.dogQueue.enqueue(d);
  }

  public void enqueue(Cat c) {
    this.catQueue.enqueue(c);
  }

  public Animal dequeue(String pref) {
    if (pref.equals("dog")) {
      return dogQueue.dequeue();
    } else if (pref.equals("cat")) {
      return catQueue.dequeue();
    } else {
      return null;
    }
  }
}

class Animal {
  public String name;

  public Animal(String name) {
    this.name = name;
  }
}
class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }
}
