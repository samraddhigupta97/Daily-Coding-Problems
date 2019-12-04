import java.util.*;
//import java.io.*;
public class Queuee{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		int i,count=0;
		for(i=0;i<num;i++)
		q.add(sc.nextInt());

		System.out.println("Queue->"+q);

		while(q.size()>0){

		int z = q.poll();
		if(z!=0)
		q2.add(z);
		else
		count+=1;
	    }

		for(i=0;i<count;i++)
		q2.add(0);
		System.out.println("Queue->"+q2);


		}
}