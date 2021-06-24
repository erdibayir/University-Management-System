public class Teacher extends Person implements Comparable<Teacher>{
  public Teacher(String name, String surname,String password) {
        super(name, surname,password);
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
            boolean bln=db.getCourse().contains(cs);
            if (bln==true){
                for (int i = 0; i <db.getCourse().size(); i++) {
                    if (db.getCourse().get(i).getCoursename().equals(cs.getCoursename())){
                        db.getCourse().get(i).addHomework(hw);
                    }
                }
            }
            else
                System.out.println("Not Found This Course");

    }
    public void addMessageCourse(String ms,Course cs,Database db){
        boolean bln=db.getCourse().contains(cs);
        if (bln==true){
            for (int i = 0; i <db.getCourse().size(); i++) {
                if (db.getCourse().get(i).getCoursename().equals(cs.getCoursename())){
                    db.getCourse().get(i).addMessage(ms);
                }
            }
        }
        else
            System.out.println("Not Found This Course");
    }
    public void enterGrade(int not,Student student,Course cs,Database db){
        Student st=db.getStudents().find(student);
        if (st!=null){
                st.addNot(not,cs);
        }
        else
            System.out.println("There is no such student in the system");
    }
    
    
    public Student searchStudent(Database database){
        database.getStudents();
        return null;
    }
}
