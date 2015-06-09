package Lesson_08;

/**
 * Created by пк on 07.06.2015.
 */
public class User_08 {
    private String name = "";
    private int age = 0;

    User_08() {
    }

//    User_08(String name, int age) {
//        this.name = name;
//        this.age = age;
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullPointerException, NoValueException {
        if (name == null) throw new NullPointerException("name is null");
        if (name.length() == 0) throw new NoValueException("you must enter a name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age) throws NumberFormatException, NullPointerException, ArithmeticException {
        if (age == null) throw new NullPointerException("age is null");

        Integer i;
        try {
            i = Integer.parseInt(age);
        } catch (NumberFormatException obj) {
            throw new NumberFormatException("Not wright! age not 4islo.");
        }

        if (i < 0 || i > 100) throw new ArithmeticException("age must > 0 and  < 100");

        this.age = i;
    }



}
