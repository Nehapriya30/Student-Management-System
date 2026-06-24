
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
                case 1 :System.out.print("Enter id:");
                        int id=sc.nextInt();
                        sc.nextLine(); // consume the newline character after nextInt()
                        boolean duplicate=false;
                        for(int i=0;i<students.size();i++){
                            Student d=students.get(i);
                            if(d.id==id){
                                
                                duplicate=true;
                                break;
                            }
                        }
                        if(duplicate){
                            System.out.println("student already exists!");
                            break;
                        }else{
                                System.out.print("Enter name:");
                                String name=sc.nextLine();
      
                                System.out.print("Enter branch:");
                                String branch=sc.nextLine();
                                Student s=new Student(id,name,branch);
                                students.add(s);
                                System.out.println("Student added successfully");
                                break;
                            
                            }
                        
                    
                        

                case 2 :if(students.isEmpty()){
                            System.out.println("No students to display");
                        
                        }else{
                            System.out.println("Displaying students:");
                            for(int i=0;i<students.size();i++){
                                Student c=students.get(i);
                                c.display();

                            }
                            System.out.println("Displayed students");
                        }
                        break;
                case 3 :System.out.println("Enter id for searching:");
                        int ch=sc.nextInt();
                        boolean found = false;
                        for(int i=0;i<students.size();i++){
                            Student d=students.get(i);
                            if(d.id==ch){
                                found = true;
                                d.display();
                                System.out.println("Student found");
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Student not found");
                        }
                        
                        break;
                case 4 :System.out.println("Enter id for deleting:");
                        int cho=sc.nextInt();
                        found = false;
                        for(int i=0;i<students.size();i++){
                            Student de=students.get(i);
                            if(de.id==cho){
                                found = true;
                                students.remove(de);
                                System.out.println("Student deleted");
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Student not found");
                        }
                        
                        break;
                case 5 :System.out.println("Enter id for updating:");
                        cho=sc.nextInt();
                        found = false;
                        for(int i=0;i<students.size();i++){
                            Student de=students.get(i);
                            if(de.id==cho){
                                found = true;
                                System.out.print("Enter new id:");
                                int newId=sc.nextInt();
                                de.id=newId;
                                sc.nextLine(); // consume the newline character after nextInt()
                                System.out.print("Enter new name:");
                                String newName=sc.nextLine();
                                de.name=newName;
                                System.out.print("Enter new branch:");
                                String newBranch=sc.nextLine();
                                de.branch=newBranch;
                                System.out.println("Student updated");
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Student not found");
                        }
                        
                        break;
                case 6 :
                        System.out.println("Exit");
                        break;
                default:System.out.println("Invalid choice");

            }
        }    
    }
    
}
