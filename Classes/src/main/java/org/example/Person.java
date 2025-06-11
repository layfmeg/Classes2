public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private double weight;
    private double height;

    public Person(String firstName, String lastName, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + ", " +
                "Возраст: " + age + ", " +
                "Вес: " + weight + " кг, " +
                "Рост: " + height + " см");
    }
}
