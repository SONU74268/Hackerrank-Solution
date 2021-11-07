import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	

    private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores2) {
        super(firstName, lastName, id);
        testScores = testScores2;   
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int gradesum = 0;
        for (int i : testScores) {
            gradesum += i;
        }
        float averagegrade = gradesum/testScores.length;
        if (averagegrade >= 90 && averagegrade <= 100) {
            return 'O';
        } else if (averagegrade >= 80 && averagegrade <= 90) {
            return 'E';
        }else if (averagegrade >= 70 && averagegrade < 80) {
            return 'A';
        }else if (averagegrade >= 55 && averagegrade < 70) {
            return 'P';
        }else if (averagegrade >= 40 && averagegrade < 55) {
            return 'D';
        }else if (averagegrade < 40) {
            return 'T';
        }
        return '\n';
    }
}

class Day_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}