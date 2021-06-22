import java.util.Hashtable;
public class Student extends Person implements Comparable<Student>{
    private String StudentNo;
    private Hashtable<Course,Integer> lessons; ///Notu ve notun hangi course ait olduğu
    public Student(String name,String surname,String password) {
        super(name,surname,password);
        lessons= new Hashtable<>();
    }

    public String getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(String studentNo) {
        StudentNo = studentNo;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
    public void addNot(int not,Course course){
        lessons.put(course,not);
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + getName() + '\'' +
                ", Surname=" +this.getSurname()  +
                '}';
    }
}

