import java.util.ArrayList;
import java.util.Iterator;

public class StudentDB {
  ArrayList<Student> studentDB;

  public StudentDB() {
    studentDB = new ArrayList<Student>();
  }

  public void getName(String searchName) {
    searchName = searchName.toLowerCase();
    for (Student objStudent : studentDB) {
      String objStudentNameLC = objStudent.name.toLowerCase();
      if (objStudentNameLC.equals(searchName)) {
        System.out.println("This contains " + objStudent.name + "\nThey are " + objStudent.age + " years old"
            + "\nand has the roll no. " + objStudent.rollno);
      }
    }
  }

  public void getAge(int searchAge) {
    for (Student objStudent : studentDB) {
      if (objStudent.age == searchAge) {
        System.out.println("This contains " + objStudent.name + "\nThey are " + objStudent.age + " years old"
            + "\nand has the roll no. " + objStudent.rollno);
      }
    }
  }

  public void getRollno(int searchRollNo) {
    for (Student objStudent : studentDB) {
      if (objStudent.rollno == searchRollNo) {
        System.out.println("This contains " + objStudent.name + "\nThey are " + objStudent.age + " years old"
            + "\nand has the roll no. " + objStudent.rollno);
      }
    }
  }

  // creating arraylist, Creating user-defined class objects
  public void createList() {
    Student s1 = new Student(101, "Sonoo", 23);
    Student s2 = new Student(102, "Ravi", 21);
    Student s3 = new Student(103, "Hanumat", 21);
    studentDB.add(s1); // adding Student class object
    studentDB.add(s2);
    studentDB.add(s3);
  }

  public void setName(String name) {
  }

  public void setAge(int age) {
  }

  public void setRollno(int rollno) {
  }

  public void roll(int value) {
  }

  public void setStudent(int rollno, String name, int age) {
    Student newStudent = new Student(rollno, name, age);
    studentDB.add(newStudent);
  }

  public void printStudentList() {
    Iterator<Student> itr = studentDB.iterator();
    // traversing elements of ArrayList object
    while (itr.hasNext()) {
      Student objStudent = (Student) itr.next();
      System.out.println(objStudent.rollno + " " + objStudent.name + " " + objStudent.age);
    }
  }
}