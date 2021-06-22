import java.util.ArrayList;
import java.util.PriorityQueue;

public class Database {
    private BinarySearchTree<Teacher> teachers;
    private BinarySearchTree<Student> students;
    //private ArrayList<University> universities;
    private ArrayList<Course> course;
    //private ArrayList<Classroom> classrooms;
    private PriorityQueue<Homework> homework;


    public Database() {
        this.teachers =new BinarySearchTree<Teacher>();
        this.students=new BinarySearchTree<Student>();
        this.course=new ArrayList<Course>();
        this.homework=new PriorityQueue<Homework>();
        AddTeacherForDataBase();
    }
    public BinarySearchTree<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(BinarySearchTree<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void AddTeacher(Teacher t){
        teachers.add(t);
    }
    public void RemoveTeacher(Teacher t){
        teachers.remove(t);
    }
    public Teacher SearchTeacher(Teacher t){
        return teachers.find(t);
    }
    private void AddTeacherForDataBase(){ ///Database teacher eklendi
        Teacher teacher=new Teacher("Osman","Hoca","Osman123");
        Teacher teacher1=new Teacher("Ali","Hoca","Ali123");
        teachers.add(teacher);
        teachers.add(teacher1);
    }
    private void AddStudentForDataBase(){ ///Database basladıgında veri oluşssun diye ekledim

    }
}
