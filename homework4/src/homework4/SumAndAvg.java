package homework4;
import java.util.*;
public class SumAndAvg {
	int num;
	double avg;
	int exit, total = 0, totcnt = 0;
 	void init() { 
		do { 
			this.exit = this.input(); 
		} while(this.exit == 0); //loop if not in exit state 
	 		 
	 	print(); 
 	}
 	int input() { 
  		Scanner s = new Scanner(System.in); 
 		 System.out.print("���ڸ� �Է�(Q:����) >> ");	 
 		 		 
 		 	if(s.hasNextInt()) { 
 				this.total += s.nextInt(); 
 		 		this.totcnt += 1; 
 		 	} 
 		 	else if(s.next().equals("Q")) 
 		 		return 1; 
 		 		 
 		 	return 0; 
 		} 



 	void print() { 
 		 	if( totcnt > 0) {	//if more than zero entries have been made 
 		 		this.avg = total/(double)totcnt; 
 		 		System.out.printf("\n �հ�� %d�̰�, ����� %.2f�Դϴ�. \n", total, avg); 
 			} 
 			System.out.println("\n ���α׷�3�� �����մϴ�. \n"); 
 		} 
 	} 