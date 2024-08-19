
import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 class student123{
     int rollno;
     String name;
     int mark;
     public student123(int rollno, String name, int mark) {
         super();
         this. rollno = rollno;
         this. name = name;
         this. mark = mark;
    }

    public int getRollno() {
        return this.rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return this.mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
       
    @Override
    public String toString() {
        return "{" +
            " rollno='" + getRollno() + "'" +
            ", name='" + getName() + "'" +
            ", mark='" + getMark() + "'" +
            "}";
    }
     
}




class StudentSort implements Comparator<student123>{
    @Override
    public int compare (student123 o1, student123 o2) {
         return o2.mark-o1.mark;
    }
}
class studentNameSort implements Comparator<student123>{
    @Override
     public int compare (student123 o1, student123 o2) {
        return (o2.name).compareTo(o1.name);
     }
    }
public class customsort{
    public static void main(String[] args) {
       student123 s1=new student123 (101, "a",6);
       student123 s2=new student123 (101, "b",8);
        student123 s3=new student123 (101, "c",7);
       student123 s4=new student123 (101, "d",9);
       ArrayList<student123> arr=new ArrayList<>();
       arr.add(s1);
       arr.add(s2);
       arr.add(s3);
       arr.add(s4);
       Collections.sort(arr,new StudentSort());
       System. out.println(arr);
       Collections.sort(arr,new studentNameSort());
       System.out.println(arr);
    }
}
