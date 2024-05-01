import java.util.*;

class Student{
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString(){
        return this.rollNo + " " + this.name + " " + this.address;
    }
}

class SortByRoll implements Comparator<Student>{
    public int compare(Student student1, Student student2){
        if(student1.rollNo == student2.rollNo){
            return student1.name.compareToIgnoreCase(student2.name);
        }
        return student1.rollNo - student2.rollNo;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        return student1.name.compareToIgnoreCase(student2.name);
    }
}

public class GFG {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(111, "ADAM", "LONDON"));
        studentList.add(new Student(111, "Mayank", "london"));
        studentList.add(new Student(131, "Anshul", "nyc"));
        studentList.add(new Student(121, "Solanki", "jaipur"));
        studentList.add(new Student(101, "Aggarwal", "Hongkong"));

        // Collections.sort(studentList, new SortByRoll());
        // for(Student student: studentList){
        //     System.out.println(student.toString());
        // }

        // Collections.sort(studentList, new SortByName());
        // for(Student student: studentList){
        //     System.out.println(student.toString());
        // }


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(11);

        Collections.sort(arrayList);
        for(int num: arrayList){
            System.out.println(num);
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        
    }



}