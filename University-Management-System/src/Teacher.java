public class Teacher extends Person implements Comparable<Teacher>{
    public Teacher(String name, String surname) {
        super(name, surname);
    }
    @Override
    public int compareTo(Teacher o) {
        if (this.getName().compareTo(o.getName())<0)
                return -1;
        else if(this.getName().compareTo(o.getName())>0)
            return 1;
        return 0;
    }
    public void addHomework(Homework hw,Course cs,Database db){

    }
    public void addMessageCourse(String ms,Course cs,Database db){

    }
    public void enterGrade(int not,Student student,Course cs,Database db){

    }
    
    
    public Student searchStudent(Database database){
        database.getStudents();
        return null;
    }
}
