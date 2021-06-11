package Database;
import Teacher.Teacher;

public class Database {
    private General_Classes.BinarySearchTree<Teacher> teachers;
    //private BinarySearchTree<Student> students;
    //private ArrayList<University> universities;
    //prvate ArrayList<Course> course;
    //private ArrayList<Classroom> classrooms;


    public General_Classes.BinarySearchTree<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(General_Classes.BinarySearchTree<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void AddTeacher(Teacher t){
        teachers.add(t);
    }
    public void RemoveTeacher(Teacher t){
        teachers.remove(t);
    }
}
