import java.util.ArrayList;
public class Database {
    private BinarySearchTree<Teacher> teachers;
    private BinarySearchTree<Student> students;
    //private ArrayList<University> universities;
    private ArrayList<Course> course;
    //private ArrayList<Classroom> classrooms;



    public Database() {
        this.teachers =new BinarySearchTree<Teacher>();
        this.students=new BinarySearchTree<Student>();
        this.course=new ArrayList<Course>();
        AddTeacherForDataBase();
        AddCourse();
        AddStudentForDataBase();
    }
    public BinarySearchTree<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(BinarySearchTree<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
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
    private void AddCourse(){
        Course cs=new Course(20,"Cse344");
        Course cs1=new Course(30,"Cse241");
        course.add(cs);
        course.add(cs1);
    }
    private void AddStudentForDataBase(){ ///Database basladıgında veri oluşssun diye ekledim
        Student student=new Student("Ali","Kınık","ogrenci123");
        this.students.add(student);
    }

    public BinarySearchTree<Student> getStudents() {
        return students;
    }

    public void setStudents(BinarySearchTree<Student> students) {
        this.students = students;
    }
}

