package coreJava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class gson {

	public static void main(String args[]) {
		String jsonStr = "{\"name\":\"Mahesh\",\"age\":\"21\"}";
		System.out.println(jsonStr);

		GsonBuilder gsonbuilder = new GsonBuilder();
		gsonbuilder.setPrettyPrinting();
		Gson gson = gsonbuilder.create();

		Student student = gson.fromJson(jsonStr, Student.class);
		System.out.println(gson.toJson(student));
	}

}
