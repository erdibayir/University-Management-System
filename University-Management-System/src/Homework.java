public class Homework implements Comparable<Homework> {
    private Course course;
    private String description;
    private String date;

    public Homework(Course course, String description) {
        this.course = course;
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String info(){
     return null;
    }

    @Override
    public int compareTo(Homework o) {
        if (this.date.compareTo(o.date)>0)
            return 1;
        else if (this.date.compareTo(o.date)<0)
            return -1;
        else
            return 0;
    }
}
