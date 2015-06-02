package Lesson_07;

/**
 * Created by пк on 02.06.2015.
 */
public class Student implements Comparable<Student> {

    private String name;
    private String secondName;
    private int age;

    Student(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nStudent{" + name + ", " + secondName + ", " + age + "}";
    }

    @Override
    public int compareTo(Student obj) {
        //return this.getName().compareTo(obj.getName());
        return this.getSecondName().compareTo(obj.getSecondName());
    }

    ;


}
