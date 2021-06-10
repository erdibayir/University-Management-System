public class Database {
    private BinarySearchTree<Teacher> teachers;
    //private BinarySearchTree<Student> students;
    //private ArrayList<University> universities;
    //prvate ArrayList<Course> course;
    //private ArrayList<Classroom> classrooms;


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
}
