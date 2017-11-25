package java_test;

public class Teacher implements SchoolInfo, Sample {
	private int teacherAge;
	private String teacherName;
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public String toString(){
		return "Teacher [teacherName="+teacherName+", teacher Age="+teacherAge+"]";
	}
	@Override
	public void schoolName() {
		System.out.println("School Name is study");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void schoolAddress() {
		System.out.println("Gangnam");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}
	
}
