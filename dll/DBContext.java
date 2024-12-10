package dll;

import java.util.Vector;

import models.Teacher;

public class DBContext {
	
	private static String fullPath = "D:\\Desktop\\oop\\practise\\week1\\university management system\\src\\data\\";
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