package DemoExtends;

import java.beans.JavaBean;

public class Teacher extends People{
    String name;

    @Override
    public void test()
    {
        System.out.println("ttt");
    }

    Teacher()
    {

    }
    public Teacher(int age,String name)
    {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {


    }

}
