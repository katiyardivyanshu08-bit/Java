// import java.util.*;
// class atm{
// 	private int balance;

// 	atm(){
// 		balance=0;
// 	}
// 	 void deposite( int amount){
// 		 if(amount>0){
// 			balance+=amount;
// 			System.out.println("Deposite successfully");
// 			System.out.println("total_amount : "+balance);
// 		}
// 		else System.out.println("Invalid amount");
// 	 }
// 	 void withdraw(int amount){
// 		if(amount>0 && amount<=balance){
// 			balance-=amount;
// 			System.out.println("with draw succesfully ");
// 			System.out.println("total balance : "+balance);
// 		}
// 		else if (amount>0 && amount>balance){
// 			System.out.println("Not require balance");
// 		}
// 		else System.out.println("Invalid amount");
// 	 }
// 	 void balanceInquiry(){
// 		System.out.println(balance);
// 	 }
// }

// ----------------------------------------------------------------------------------------


// class student{
// 	String name ;
// 	int student_roll ;
// 	String Course; 

// 	student(String s , int r , String c){
// 		name=s;
// 		student_roll=r;
// 		Course=c;
// 	}
// 	void display(){
// 		System.out.println(name);
// 		System.out.println(student_roll);
// 		System.out.println(Course);
// 	}
// }
// class ugcstudent extends student{
// 	int year;
// 	ugcstudent(String n , int r , String c , int y){
// 		super(n,r,c);
// 		this.year=y;
// 	}
// 	void display(){
// 		System.out.println(name);
// 		System.out.println(student_roll);
// 		System.out.println(Course);
// 		System.out.println(year);
// 	}
// }
// class pgstudent extends student{
// 	String specialization ;
// 	pgstudent(String s , int r , String c, String specialization){
// 		super(s, r, c);
// 		specialization=s;
// 	}
// 	void display(){
// 		System.out.println(name);
// 		System.out.println(student_roll);
// 		System.out.println(Course);
// 		System.out.println(specialization);
// 	}
// }

// -----------------------------------------------------------------------------------------------

// abstract class vech{
// 	int vecnumber;
// 	String brandname;
// 	vech(int n, String s){
// 		vecnumber=n;
// 		brandname=s;
// 	}
// 	abstract void display();
// }
// interface fuel{
// 	void fueltype();
// }

// class C extends vech implements fuel{
// 	int door ;
// 	C(int n , String s , int n1){
// 		super(n, s);
// 		door=n1;	
// 	}
// 	void display(){
// 		System.out.println(vecnumber+" "+brandname+" "+door);
// 	}
// 	public void fueltype(){
// 		System.out.println("Gas");
// 	}
// }
// class b extends vech implements fuel{
// 	int engcapacity ;
// 	b(int n , String s , int e){
// 		super(n, s);
// 		engcapacity=e;
// 	}
// 	void display(){
// 		System.out.println(vecnumber+" "+brandname+" "+engcapacity);
// 	}
// 	public void fueltype(){
// 		System.out.println("petrol");
		
// 	}
// }
// -------------------------------------------------------------------------
abstract class bank{
	int a;
	String name ;
	bank(int a  , String n){
		this.a=a;
		name=n;
	}
	abstract void display();
}
interface transaction{
	void ttype();
}
class savingaccount extends bank implements transaction{
	String inr;
	savingaccount(int a  , String n , String i){
		super(a, n);
		this.inr=i;
	}
	void display(){
		System.out.println("Online transaction"+inr);
	}
	public void ttype(){
		System.out.println("Online transfer");
	}
}
class currac extends bank implements transaction{
	int overlimit;
	currac(int a  , String n , int i){
		super(a, n);
		this.overlimit=i;
	}
	void display(){
		System.out.println(overlimit);
	}
	public void ttype(){
		System.out.println("cheque");
	}
}
class A{
	public static void main(String[] args) {
		savingaccount s1 = new savingaccount(23, "rajat", "5.8%");
		s1.display();
		s1.ttype();

		
		// ---------------------------------------------------------
		// C c1 = new C(123,"bmw",987);
		// b b1 = new b(456,"kawasaki",999);
		// System.out.println("--Car---");
		// c1.display();
		// c1.fueltype();
		// System.out.println("--Bike---");
		// b1.display();
		// b1.fueltype();



// ------------------------------------------------------------------------------------------------------------------------		
		// ugcstudent u1 = new ugcstudent("Rajat" , 234 ,"Btec" , 2 );
		// pgstudent p1 = new pgstudent("ram" , 94 ,"mtec" , "aiml" );
		// u1.display();
		// p1.display();

// ----------------------------------------------------------------------------------------------------------------------------		
		// Scanner sc = new Scanner(System.in);
		// atm p1 = new atm();
		// int amount;
		// int choice;
		// do{
		// 	System.out.println("1-Deposite");
		// 	System.out.println("2-Wihtdraw");
		// 	System.out.println("3-Balance_inquiry");
		// 	System.out.println("4-Exit");
		// 	choice=sc.nextInt();
		// 	switch (choice) {
		// 		case 1:
		// 			System.out.print("Enter your deposite amount : ");
		// 			amount=sc.nextInt();
		// 			p1.deposite(amount);
		// 			break;
		// 		case 2:
		// 			System.out.print("Enter withdraw amount : ");
		// 			amount=sc.nextInt();
		// 			p1.withdraw(amount);
		// 			break;
		// 		case 3:
		// 			System.out.print("Balance inquiry : ");
		// 			p1.balanceInquiry();
		// 			break;
		// 		case 4:
		// 			System.out.print("Thankyou for using atm");
		// 			break;
			
		// 		default:
		// 			System.out.print("invalid");
		// 			break;
		// 	}
		// }while(choice!=4);
		
		

// --------------------------------------------------------------------------------------------------------	    
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number 1-4 : ");
		// int choice;
		// do{
		// 	System.out.println("hello");
		// 	choice=sc.nextInt();
		// 	switch (choice) {
		// 		case 1:
		// 			System.out.println("111");
		// 			break;
			
		// 		default:
		// 			System.out.println("XXXXXXX");
		// 			break;
		// 	}
		// }while(choice!=2);
	}
}
