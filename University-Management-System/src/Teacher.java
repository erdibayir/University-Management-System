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
    public Student searchStudent(Database database){
        database.getStudents();
        return null;
    }
}
