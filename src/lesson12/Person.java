package lesson12;

public class Person {
    private int age = 30;
    private String name = "Дамир";

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age != this.age) {
            throw new Exception("Не угадал возраст");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!this.name.equals(name)) {
            throw new Exception("Не угадал Имя");
        }
        this.name = name;
    }
}
