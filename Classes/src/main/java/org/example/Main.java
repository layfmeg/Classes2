import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = {"Кирилл", "Алексей", "Мария", "Оля", "Иван", "Даша", "Миша", "Катя"};
        String[] lastNames = {"Иванов", "Петров", "Сидоров", "Кузнецова", "Смирнова", "Федоров", "Орлова", "Тихонов"};

        Person[] people = new Person[100];
        Random rand = new Random();

        for (int i = 0; i < people.length; i++) {
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            int age = rand.nextInt(70) + 10;
            double weight = 40 + rand.nextDouble() * 60;
            double height = 140 + rand.nextDouble() * 50;
            people[i] = new Person(firstName, lastName, age, weight, height);
        }

        for (int i = 0; i < 5; i++) {
            people[i].printInfo();
        }
    }
}