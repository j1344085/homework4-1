package homework4;
import java.util.*;
public class GuGuDan2 {
	String even;
	int exit;
	
	void init() { 
			do { 
				if((this.exit = this.input()) == 0)	//in case of loop 
		 			this.print(); 
		 	} while(this.exit == 0); //loop if not in exit state 
				 
			System.out.println("\n ���α׷�5�� �����մϴ�. \n"); 
	}
	int input() { 
		Scanner s = new Scanner(System.in); 
		System.out.print("E:¦����, O:Ȧ����(Q:����) >> "); 
		 		 
		 	if((this.even = s.next()).equals("Q")) 
				return 1; 
		 		 
			return 0; 
	 	} 
	void print() { 
		 	if(even.equals("E")) { 
				for(int i=1;i<10;i++) { 
		 			for(int j=2;j<10;j+=2) 
		 				System.out.format(" %d * %d  = %2d ", j, i, j*i); 
		 			System.out.print("\n"); 
		 		} 
		 	} 
		 	else if(even.equals("O")) { 
		 	for(int i=1;i<10;i++) { 
		 		for(int j=3;j<10;j+=2) 
		 			System.out.format(" %d * %d  = %2d ", j, i, j*i); 
		 		System.out.print("\n"); 
		 			} 
		 		} 
			} 
		} 