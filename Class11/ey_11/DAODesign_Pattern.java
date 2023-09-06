package ey_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String stu_name;
    private int stu_id;

    public Student(String stu_name, int stu_id) {
        this.stu_name = stu_name;
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student [stu_name=" + stu_name + ", stu_id=" + stu_id + "]";
    }
}

interface StudentDAO {
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(Student student);
}

class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<>();
        Student stu1 = new Student("Aman", 123);
        Student stu2 = new Student("Patel", 456);
        students.add(stu1);
        students.add(stu2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void updateStudent(Student student) {
        for (Student stu : students) {
            if (stu.getStu_id() == student.getStu_id()) {
                stu.setStu_name(student.getStu_name());
                System.out.println("Student with id " + student.getStu_id() + " is updated");
                break;
            }
        }
    }

    @Override
    public void deleteStudent(Student student) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            if (stu.getStu_id() == student.getStu_id()) {
                iterator.remove();
                System.out.println("Student with id " + student.getStu_id() + " is removed");
                break;
            }
        }
    }
}

public class DAODesign_Pattern {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        
        System.out.println("All Students:");
        for (Student st : studentDAO.getAllStudents()) {
            System.out.println("Student [stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");
        }

       
        Student firstStudent = studentDAO.getAllStudents().get(0);
        System.out.println("Before update: " + firstStudent);
        firstStudent.setStu_name("Rana");
        studentDAO.updateStudent(firstStudent);
        System.out.println("After update: " + firstStudent);

        
        Student studentToDelete = studentDAO.getAllStudents().get(1);
        studentDAO.deleteStudent(studentToDelete);
        System.out.println("After deletion:");
        for (Student st : studentDAO.getAllStudents()) {
            System.out.println("Student [stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");
        }
    }
}