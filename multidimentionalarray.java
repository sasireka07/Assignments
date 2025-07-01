package assignments;

public class multidimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3D array to store 5 semester with 6 subject each semester have sem and mark details
		String[][][] semester= new String[5][6][2];
//Semester 1 with subject
		semester[0][0][0]="Mathematics";
		semester[0][1][0]="Physics";
		semester[0][2][0]="Chemistry";
		semester[0][3][0]="Computer Programming";
		semester[0][4][0]="Engg drawing";
		semester[0][5][0]="Basic Electrical engg";
		
		//Semester 1 with status(marks)
		semester[0][0][1]="Pass(78)";
		semester[0][1][1]="Pass(85)";
		semester[0][2][1]="Fail(21)";
		semester[0][3][1]="Pass(74)";
		semester[0][4][1]="Pass(88)";
		semester[0][5][1]="Pass(79)";
		
		
		//Semester 2 with subject
				semester[1][0][0]="MathematicsII";
				semester[1][1][0]="Mechanics";
				semester[1][2][0]="EVS";
				semester[1][3][0]="Basic Electronics";
				semester[1][4][0]="Engg Physics";
				semester[1][5][0]="Enginerring graphics";
				
				//Semester 2 with status(marks)
				semester[1][0][1]="Pass(82)";
				semester[1][1][1]="Pass(77)";
				semester[1][2][1]="Pass(93)";
				semester[1][3][1]="Fail(19)";
				semester[1][4][1]="Fail(24)";
				semester[1][5][1]="Pass(90)";
				
				System.out.println("Semester 2 Subject 4 name :"+semester[1][3][0]);
				System.out.println("Semester 2 Subject 5 name :"+semester[1][4][0]);
				
		//Semester 3 with status(marks)
				
				semester[2][0][0]="Data Structure";
				semester[2][1][0]="Discrete Mathematics";
				semester[2][2][0]="Digital Electronics";
				semester[2][3][0]="Operating System";
				semester[2][4][0]="Signals and Systems";
				semester[2][5][0]="Object oriented programming";
				
		     //Semester 3 with status(marks)
				semester[2][0][1]="Pass(88)";
				semester[2][1][1]="Pass(81)";
				semester[2][2][1]="Pass(76)";
				semester[2][3][1]="Fail(32)";
				semester[2][4][1]="Pass(85)";
				semester[2][5][1]="Pass(78)";
				
//Semester 4 with status(marks)
				
				semester[3][0][0]="Algorithm";
				semester[3][1][0]="Computer Networks";
				semester[3][2][0]="Database systems";
				semester[3][3][0]="Microprocessor";
				semester[3][4][0]="Communicating engg";
				semester[3][5][0]="Software engg";
				
		     //Semester 4 with status(marks)
				semester[3][0][1]="Pass(91)";
				semester[3][1][1]="Pass(73)";
				semester[3][2][1]="Fail(19)";
				semester[3][3][1]="Pass(80)";
				semester[3][4][1]="Pass(76)";
				semester[3][5][1]="Pass(87)";
				
				
//Semester 5 with status(marks)
				
				semester[4][0][0]="Prob& Status";
				semester[4][1][0]="Machine Learning";
				semester[4][2][0]="Compiler design";
				semester[4][3][0]="Theory of computation";
				semester[4][4][0]="Embedded systems";
				semester[4][5][0]="Computer Graphics";
				
		     //Semester 5 with status(marks)
				semester[4][0][1]="Pass(86)";
				semester[4][1][1]="Pass(88)";
				semester[4][2][1]="Pass(84)";
				semester[4][3][1]="Pass(95)";
				semester[4][4][1]="Pass(73)";
				semester[4][5][1]="Pass(90)";
				
		System.out.println("Semester 4 Subject 3 name :"+semester[3][2][0]);
		System.out.println("Semester 4 subject 3 and the Status(Marks) name :"+semester[3][2][1]);
		System.out.println("Semester 4 Subject 6 name :"+semester[3][5][0]);
		System.out.println("Semester 4 subject 6 and the Status(Marks) name :"+semester[3][5][1]);
		
		
		
		
		
		
		
		
		
	}

}
