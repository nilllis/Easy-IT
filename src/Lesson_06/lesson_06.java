package Lesson_06;

/**
 * Created by пк on 27.05.2015.
 */
public class lesson_06 {

    private int i;
    private String str = "aaa";
    private double d;

    @Override
    public String toString() {
        return "lesson_06{" +
                "i=" + i +
                ", str='" + str + '\'' +
                ", d=" + d +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
