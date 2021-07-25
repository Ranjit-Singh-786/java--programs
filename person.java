class Person {
  String Name = "Vipin";
  int age = 24;

  public void display() {
    System.out.println("Name is " + Name + "Age is" + age);
  }

}

class PersonObj{
  public static void main(String args[]) {
    Person p1 = new Person();
    p1.display();
  }
}
