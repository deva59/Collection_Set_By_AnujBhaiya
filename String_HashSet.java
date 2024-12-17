package Collection_Set_By_AnujBhaiya;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Custom Clas Create.
//This is also Known as POJO
//Plain old java object
class Student{
    int rollNo;
    String name;

    //Create Redimed Constructor RightClick+Generates+All Option Visibles.
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    //do element alag alag he ya nahi hai
    //Using HashCode() and Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {//get input
        return Objects.hash(rollNo);//return output
    }


    //Inbuilt Function..
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}


public class String_HashSet {
    //Use ENUM Class..
    //enum means = kuch SET of values hai jiske under se Support hai
    //SIZE, COLOR
    enum Color{
        RED, YELLOW, GREEN
    }
    public static void main(String[] args) {

        //You can create enum set

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(Color.GREEN);




//        Set<Student>set = new HashSet<>();
//
//        Student s1 = new Student(1,"Devendra");
//        Student s2 = new Student(1,"Rohit");
//
//        //.equals Method Check karega dono element baraber he ya nahi
//        System.out.println(s1.equals(s2));
//
//        set.add(new Student(1,"Devendra"));
//        set.add(new Student(1,"Ram"));
//        set.add(new Student(1,"Devendra"));
//
//        System.out.println(set);



//        Set<String> set = new HashSet<>();
//
//        set.add("Deva");
//        set.add("Sai");
//        set.add("Deva");
//        set.add("Ram");
//
//        System.out.println(set);
    }
}
