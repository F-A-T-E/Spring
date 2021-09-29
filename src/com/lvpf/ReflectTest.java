package com.lvpf;
import java.lang.reflect.Field;


public class ReflectTest {
	private String fname;
	private String lname;

	public ReflectTest(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public static void main(String[] args) {
		try {
			ReflectTest rt = new ReflectTest("java", "aspectj");
			fun(rt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fun(Object obj) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		System.out.println("替换之前的：");
		for (Field field : fields) {
			System.out.println(field.getName() + "=" + field.get(obj));
			if (field.getType().equals(java.lang.String.class)) {
				field.setAccessible(true);
				String org = (String) field.get(obj);
				field.set(obj, org.replaceAll("a", "b"));
			}
		}
		System.out.println("替换之后的：");
		for (Field field : fields) {
			System.out.println(field.getName() + "=" + field.get(obj));
		}
	}
}
