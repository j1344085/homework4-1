package homework4;
import java.util.*;
public class SumOfNumbers {
	
	void print(){
	Scanner s = new Scanner(System.in);
	System.out.print("���ڸ� �Է��Ͻÿ�.");
	int num = s.nextInt();
	num = 0;
	
	for(int i=1; i <= 10; i++)
	{
		num += i;
	}
	System.out.print("������������ ����"+num );
		
	}
}