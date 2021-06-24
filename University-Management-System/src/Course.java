import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Course {
    private int capacity;
    private String coursename;
    private Teacher courseteacher;
    private LinkedList<Student> students;
    private PriorityQueue<Homework> homework;
    private Stack<String> message;

    public Course(String coursename){
        this.coursename = coursename;
        this.students=new LinkedList<Student>();
        this.homework=new PriorityQueue<Homework>();
        this.message=new Stack<String>();
    }
    public Course(int capacity, String coursename) {
        this.capacity = capacity;
        this.coursename = coursename;
        this.courseteacher = courseteacher;
        this.students=new LinkedList<Student>();
        this.homework=new PriorityQueue<Homework>();
        this.message=new Stack<String>();
    }

    public PriorityQueue<Homework> getHomework() {
        return homework;
    }

    public void setHomework(PriorityQueue<Homework> homework) {
        this.homework = homework;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Teacher getCourseteacher() {
        return courseteacher;
    }

    public void setCourseteacher(Teacher courseteacher) {
        this.courseteacher = courseteacher;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }
    public void addHomework(Homework hw){
        this.homework.add(hw);
    }
    public void addMessage(String messsage){
        this.message.push(messsage);
    }

    @Override
    public String toString() {
        return "Course{"+ coursename + '\'' + '}';
    }
}
