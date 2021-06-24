import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db=new Database();
        TeacherMenu(db);

    }
    public static void TeacherMenu(Database db){
        Scanner scanner=new Scanner(System.in);
        System.out.println("###TeacherMenu###");
        System.out.println("Enter The Teacher Name");
        String name=scanner.nextLine();
        System.out.println("Enter The Teacher Surname");
        String surname=scanner.nextLine();
        System.out.println("Enter The Teacher Password");
        String password=scanner.nextLine();
        Teacher tempteacher=new Teacher(name,surname,password);
        Teacher teacher=db.getTeachers().find(tempteacher);
        if (teacher!=null && teacher.getPassword().equals(password)){
            while (true) {
                System.out.println("1-AddHomework\n"
                        + "2-AddMessageCourse\n"
                        + "3-EnterGrade\n"
                        + "4-Exit");
                int choose = scanner.nextInt();
                if (choose == 1) {
                    System.out.println("***AddHomework***");
                    System.out.println("Enter The Description Of The Homework");
                    scanner.nextLine();
                    String description=scanner.nextLine();
                    System.out.println("Enter The Date (Assignments will only be entered as the day of the requested date.)");
                    String date=scanner.nextLine();

                    for (int i = 0; i <db.getCourse().size(); i++) {
                        System.out.println(i+"-"+db.getCourse().get(i).getCoursename());
                    }
                    System.out.println("Please choose which course you want to add this assignment to.");
                    int sec=scanner.nextInt();
                    if (sec<=db.getCourse().size()){
                        Course cs=db.getCourse().get(sec);
                        Homework hw=new Homework(description,date);
                        teacher.addHomework(hw,cs,db);
                    }
                    else
                        System.out.println("The given number is not in the desired range");

                } else if (choose == 2) {
                    System.out.println("***AddMessageCourse***");
                    System.out.println("Enter The Message");
                    String ms=scanner.nextLine();
                    for (int i = 0; i <db.getCourse().size(); i++) {
                        System.out.println(i+"-"+db.getCourse().get(i).getCoursename());
                    }
                    System.out.println("Please choose which course you want to add this Message");
                    int sec=scanner.nextInt();
                    if (sec<=db.getCourse().size()){
                        Course cs=db.getCourse().get(sec);
                        teacher.addMessageCourse(ms,cs,db);
                    }
                    else
                        System.out.println("The given number is not in the desired range");

                } else if (choose == 3) {
                    System.out.println("***EnterGrade***");
                    System.out.println(db.getStudents().inorder());
                    System.out.println("Enter Student Name:");
                    scanner.nextLine();
                    String studentname=scanner.nextLine();
                    System.out.println("Enter Student SurName:");
                    String studentsurname=scanner.nextLine();
                    System.out.println("Enter Student No:");
                    String studentno=scanner.nextLine();
                    Student st=new Student(studentname,studentsurname,studentno);
                    if(db.getStudents().find(st)!=null){
                       
                        System.out.println("Type the name of the course you want to enter the grade for");
                        String coursename=scanner.nextLine();
                        System.out.println("Enter The Grade");
                        int grade=scanner.nextInt();
                        Course course=new Course(coursename);
                        st.addNot(grade,course);
                        st.getstudentCourse();
                    }
                    else {
                        System.out.println("Not Found This Student");
                    }


                }
                else if (choose==4){
                    System.out.println("Exiting...");
                    break;
                }
            }
        }
        else {
            System.out.println("Username or password is incorrect");
        }
    }//TeacherMenu
}
