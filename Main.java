
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ArrayList<Student> students=new ArrayList<>();
        Scanner sc=new Scanner(System.in); 
        int choice=0;
        while(choice!=6){
            System.out.print("Enter your choice:\n1.Add student\n2.Display student\n3.Search student\n4.Delete student\n5.Update student\n6.Exit\n");
            choice=sc.nextInt();
            sc.nextLine(); // consume the newline character after nextInt()
            switch(choice){
                case 1 :
                        addStudent(students, sc);
                        break;
                case 2 :
                        displayStudents(students);
                        break;
                case 3 :
                        searchStudent(students, sc);
                        break;
                case 4 :
                        deleteStudent(students, sc);
                        break;
                case 5 :
                        updateStudent(students, sc);
                        break;
                case 6 :
                        exitProgram();
                        break;
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
                                
    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter id:");
        int id = sc.nextInt();
        sc.nextLine(); // consume the newline character after nextInt()
        boolean duplicate = false;
        for (int i = 0; i < students.size(); i++) {
            Student d = students.get(i);
            if (d.id == id) {
                duplicate = true;
                break;
            }
        }
        if (duplicate) {
            System.out.println("Student already exists!");
        } else {
            System.out.print("Enter name:");
            String name = sc.nextLine();
            System.out.print("Enter branch:");
            String branch = sc.nextLine();
            Student s = new Student(id, name, branch);
            students.add(s);
            System.out.println("Student added successfully");
        }
    }
    public static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display");
        } else {
            System.out.println("Displaying students:");
            for (Student c : students) {
                c.display();
            }
            System.out.println("Displayed students");
        }
    }
    public static void searchStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter id for searching:");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student d = students.get(i);
            if (d.id == id) {
                found = true;
                d.display();
                System.out.println("Student found");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter id for deleting:");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student d = students.get(i);
            if (d.id == id) {
                found = true;
                students.remove(d);
                System.out.println("Student deleted");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
    public static void updateStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter id for updating:");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student d = students.get(i);
            if (d.id == id) {
                found = true;
                System.out.print("Enter new id:");
                int newId = sc.nextInt();
                d.id = newId;
                sc.nextLine(); // consume the newline character after nextInt()
                System.out.print("Enter new name:");
                String newName = sc.nextLine();
                d.name = newName;
                System.out.print("Enter new branch:");
                String newBranch = sc.nextLine();
                d.branch = newBranch;
                System.out.println("Student updated");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
    public static void exitProgram() {
        System.out.println("Exiting program...");
    }
        
           
    
    
}
