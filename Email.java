package Emailapp;

import java.util.Scanner;

public class Email {
	private String firstname; 
	private String lastname;
	private  String password;
	private String department;
	private String email;
	private int mailboxcapacity = 300;
	private String alternateEmail;
	private int defaultpasswordLength=12;
	private String uniname = "bauhausuni.de";

	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println(" your name is" +"" +  this.firstname+" "+ this.lastname);
		// method for department 
		this.department = setDepartment();
		System.out.println("Departmnet" + " " +this.department);
		// set random password
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("password is:" + " ");
		// creating email by combining first and last name 
		
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+uniname;
		System.out.println("new email is" + " " + email);
		
		
		
	}

	// email assigned according to the department;
	private String setDepartment() {
		System.out.println(" your department\n1 DE\n2 CS4DM\n3 HCI" );
		Scanner in = new Scanner(System.in);
		int choice=in.nextInt();
		if (choice ==1 ) {return "DE";}
		else if(choice  == 2) {return "CS4DM";}
		else if (choice == 3) {return "HCI";}
		else {return "Bauhaus University Weimar ";}


	}
	private String randomPassword(int length){
		String passwords ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+,./:";
		char[] password =new char[length];
		for (int i=0; i< length; i++) {int rand =
		(int)Math.random()* passwords.length();
		password[i]= passwords.charAt(rand);
		System.out.println(rand);
		System.out.println(passwords.charAt(rand));
		}
		return new String(password);
		
		
			}
	
	// mail box capacity
	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	// alternate email address
	public void setalternatemail(String altmail) {
		 this.alternateEmail= altmail;
	}
	
	// change password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getmailboxcapacity() {
		return mailboxcapacity;
	}
	
	public String getalternateemail() {
		return alternateEmail;
		
	}
	public String getpassword() { return password;}
	
	public String Info() {
		return " Name:"+firstname + " " + lastname + " " +
	"UNIVERSITY:" + uniname + " mail:"+email + "mailbox capacity:" +mailboxcapacity;
	}
}
