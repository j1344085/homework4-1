package homework4;
import java.util.*;
public class ExamForWhile {
 
	public static void main(String[] args) {
		int num;
		do{
		Scanner s = new Scanner(System.in);
		System.out.println("1 :1���� �Է��� ������ ���ϱ�");
		System.out.println("2 :�ִ밪/�ּҰ� ���ϱ�");
		System.out.println("3 :�Է¹��������� �հ�� ��ձ��ϱ�");
		System.out.println("4 :���ϴ� ������ ����ϱ�");
		System.out.println("5 :¦����/Ȧ���� ����ϱ�");
		System.out.println("6 �����ϱ�");
		System.out.println("���ϴ� �޴��� >>");
		
		num = s.nextInt();
		
		if(num == 1)
			new SumOfNumbers().print();
		else if(num == 2)
			new MaxAndMin().print();
		else if(num == 3)
			new SumAndAvg().init();
		else if(num == 4)
			new GuGuDan().init();
		else if(num == 5)
			new GuGuDan2().init();
	} while(num != 6);
	
	System.out.println("���α׷� ����!");
		
		
	}
 
}