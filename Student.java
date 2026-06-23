public class Student{
	int id;
	String name;
	String branch;

	Student(int id,String name,String branch){
	this.id=id;
	this.name=name;
	this.branch=branch;
	}
	
	public void display(){
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("branch: " + branch);
	}
}