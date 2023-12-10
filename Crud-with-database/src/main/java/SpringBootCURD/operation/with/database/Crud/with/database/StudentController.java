package SpringBootCURD.operation.with.database.Crud.with.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	ArrayList<StudentEntity> se = new ArrayList<>();

	@Autowired
	SessionFactory sf;

	@GetMapping("ShowData")
	public StudentEntity showdata() {
		Session ss = sf.openSession();
		StudentEntity student = ss.get(StudentEntity.class, 2);
		System.out.println(student);
		return student;
	}

	@GetMapping("showalldata")
	public List<StudentEntity> showalldata() {
		Session ss = sf.openSession();
		Query query = ss.createQuery("from StudentEntity");
		List<StudentEntity> li = query.list();
		for (StudentEntity studentEntity : li) {
			System.out.println(
					studentEntity.getId() + "  " + studentEntity.getName() + "   " + studentEntity.getRollno());
		}
		return li;
	}

	@PostMapping("inserRecord")
	public StudentEntity inserrecord() {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		StudentEntity student = new StudentEntity(8, "ram", 85);
		ss.save(student);
		tr.commit();
		return student;
	}

	@PutMapping("updateRecord")
	public StudentEntity updaterecord() {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		StudentEntity student = new StudentEntity(8, "vedant", 90);
		ss.update(student);
		tr.commit();
		System.out.println("update succesfully.........");
		return student;

	}

	@DeleteMapping("deleterecord")
	public StudentEntity deleterecord() {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		StudentEntity student = ss.get(StudentEntity.class, 2);
		ss.delete(student);
		tr.commit();
		System.out.println("delete succesfully.........");

		return student;

	}
}
