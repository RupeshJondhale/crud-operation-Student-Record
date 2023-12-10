package SpringBootCURD.operation.with.database.Crud.with.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

	@Id
	int id;
	String name;
	int rollno;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
}
