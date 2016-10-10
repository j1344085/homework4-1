package homework5;
import java.util.*;
public class MaxAndMin {
	int num;
	String q;
	int max =0;
	int min =100;
	void print(){
	do
	{
		this.q="";
		Scanner s = new Scanner(System.in);
		System.out.print("0부터 100사이의 숫자 입력(Q: 졸료)");
		
		if(s.hasNextInt()){
			this.num=s.nextInt();
		
		if(this.max<this.num)
			this.max=this.num;
		
		if(this.min>this.num)
			this.min=this.num;
	}
	else this.q=s.next();
	}
	while(!q.equals("Q"));
		
	System.out.println("가장 큰수는"+this.max+"가장 작은수 는"+this.min);
	}
	
	
	
}