package packageName2;

public class AADHARNUMBERASSIGNMENT {
	
	public void printAadharNO() {
		System.out.print("Your Aadhar Number is ");
		System.out.println(generateFourAadharNo()+ " " +generateFourAadharNo()+ " " +generateFourAadharNo() );
	}
	public int generateFourAadharNo() {
		return (int) (Math.random()*10000);
	}
	
	public void generateAadhar(String Passport) {
		printAadharNO();
		
	}
	public void generateAadhar(String Passport,String VoterID) {
		printAadharNO();
	}
	public void generateAadhar(String Passport,String VoterID,String PAN) {
		printAadharNO();
	}

}
