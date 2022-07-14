package lesson6;

public class People {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name = new String();
    private int age;
    private String gender = new String();

    public People(){
    }

    public People(String name,int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


}
