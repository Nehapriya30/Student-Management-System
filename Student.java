public class Student {
    int id;
    String name;
    String branch;

    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }
}