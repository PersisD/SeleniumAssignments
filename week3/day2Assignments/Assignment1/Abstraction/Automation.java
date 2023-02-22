package week3.day2Assignments;

public class Automation extends MultipleLanguage {

	@Override
	public void ruby() {
		System.out.println("Ruby an interpreted language like Python");
		
	}

	public void java() {
		System.out.println("Java is a general-purpose, class-based, object-oriented programming language");
		
	}

	public void selenium() {
		System.out.println("Selenium is an open-source tool that automates web browsers");
		
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.ruby();
		auto.python();
	}

}
