package homework4;
import java.util.*;
public class SumOfNumbers {
	
	void print(){
	Scanner s = new Scanner(System.in);
	System.out.print("숫자를 입력하시오.");
	int num = s.nextInt();
	num = 0;
	
	for(int i=1; i <= 10; i++)
	{
		num += i;
	}
	System.out.print("마지막까지의 합은"+num );
		
	}
}