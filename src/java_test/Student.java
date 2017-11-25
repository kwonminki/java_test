package java_test;

public class Student implements SchoolInfo, Sample {
	private String stuName;
	private int stuAge;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	public String toString(){
		return "StudentA [stuName="+stuName+", stuAge="+stuAge+"]";
	}
	@Override
	public void schoolName() {
		System.out.println("School Name is Highschool");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void schoolAddress() {
		System.out.println("Seoul");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}

}
