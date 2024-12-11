package dll;

import java.util.Vector;

import users.Teacher;

public class DBContext {
	
	private static String fullPath = "C:\\Users\\Happy Future\\Desktop\\OOP\\Project\\Code\\OOP_Project\\src\\data\\";
	private static DBContext db = new DBContext();
	
	public static Vector<Teacher> teacher;
	
	{
		this.teacher = new Vector<Teacher>();
		
		this.teacher.add(new Teacher("a.izbassar", "1234f"));
		this.saveTeachers();
		this.teacher = getTeachers();
	}
	
	private DBContext() {
		
	}
	
	// ...
	
	public static Vector<Teacher> getTeachers() {
		Object o = ReaderWriter.deserialize(fullPath + "teachers.txt");
		
		if (o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return null;
	}
	
	public static boolean saveTeachers() {
		return ReaderWriter.serialize(teacher, fullPath + "teachers.txt");
	}

	public static DBContext getDb() {
		return db;
	}
	
	
}