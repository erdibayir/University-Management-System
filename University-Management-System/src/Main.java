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

                } else if (choose == 2) {
                    System.out.println("***AddMessageCourse***");

                } else if (choose == 3) {
                    System.out.println("***EnterGrade***");
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
