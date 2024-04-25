import homework.Employee;
import homework.Person;
import homework.Programmer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Object a = new String("test");
        a = new Programmer(LocalDate.now());
        a = 2;
        a = true;
        System.out.println("Hello world!");

//        Car c = new Car();
        Person person = new Programmer(LocalDate.now(), "Java");
        printProgrammingLanguage(person);
        Person person1 = new Employee(LocalDate.now());
        printProgrammingLanguage(person1);

        Transaction t = new Transaction(1, 100, 1);
        Transaction t2 = new Transaction(t.id(), t.amount(), 2);

        final Employee e = new Employee(LocalDate.now());
        Employee c = e;
        c = new Employee(LocalDate.now());
//        e = new Employee(LocalDate.now()); eroare de compilare
        e.setPosition("new position");

        final int aa = 5;
        int bb = aa;
        bb = 7;

    }

    public static void printProgrammingLanguage(Person p) {
        if (p instanceof Programmer programmer) {
            System.out.println(programmer.getLanguage());
        } else {
            System.out.println("Not a programmer");
        }
    }
}