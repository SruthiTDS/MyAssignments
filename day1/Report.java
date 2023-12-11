package week1.day1;



class Student {
	String studentName="Sruthi";
	int rollNo=4;
	String collegeName="KLU";
	int markScored=89;
	float cgpa=8.5f;
}

public class Report{
	public static void main(String[] args) {

		Student s=new Student();
		System.out.println(s.studentName);
		System.out.println(s.rollNo);
		System.out.println(s.collegeName);
		System.out.println(s.markScored);
		System.out.println(s.cgpa);


	}


}
