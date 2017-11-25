package java_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
	/*	Car myCar = new Car();
		
		myCar.setCarName("Sonata");
		myCar.setCarNumber("8383");
		myCar.setCarPrice(1000);
		
		System.out.println("object :"+myCar);
		myCar.getCarInfo();
	*/
		/*
		Bus myBus = new Bus("minibus","2314",4000);
		
		myBus.setBusNumber("Bus123414");
		myBus.setPassengerCount(70);
		
		System.out.println("object value: "+myBus);
		myBus.getCarInfo();
		
		Texi myTexi = new Texi("minitexi","cdf2525",1500);
		
		myTexi.setTexiNumber("dkdk34");
		myTexi.setPassengerCount(50);
		
		System.out.println("Object: "+myTexi);
		myTexi.getCarInfo();
		System.out.println("===============================");
		
		*/
		Student student = new Student();
		
		student.setStuName("mk");
		student.setStuAge(22);
		
		System.out.println(student.toString());
		student.schoolName();
		student.schoolAddress();
		
		System.out.println();
		
		Teacher teacher = new Teacher();
		
		teacher.setTeacherName("seo");
		teacher.setTeacherAge(40);
		
		System.out.println(teacher.toString());
		teacher.schoolName();
		teacher.schoolAddress();
		System.out.println("==================");
		
		Car car_bus = new Bus();
		Car car_texi = new Texi();
		
		car_bus.etcInfo();
		car_texi.etcInfo();
		
		Map<String, Object> dataset = new HashMap<String, Object>();
		
		dataset.put("one", "1");
		dataset.put("two", "2");
		dataset.put("three", "3");
		dataset.remove("one");
		
		System.out.println("value : " +dataset.get("one"));
		System.out.println("value : " +dataset.get("two"));
	
		
		Map<String, ArrayList<Object>> datasetlist = new HashMap<String,ArrayList<Object>>();
		
		ArrayList<Object> namelist = new ArrayList<Object>();
		
		namelist.add("mk");
		namelist.add("bb");
		namelist.add("aa");
		
		datasetlist.put("name", namelist);
		
		ArrayList<Object> agelist = new ArrayList<Object>();
		
		agelist.add(22);
		agelist.add(30);
		agelist.add(18);
		
		datasetlist.put("age", agelist);
		
		System.out.println(datasetlist);
		
		for(int i=0; i<datasetlist.get("name").size();i++)
		{
			System.out.println("name: "+datasetlist.get("name").get(i)+" / age: "+ datasetlist.get("age").get(i));
		}
		
	}
}
