package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class QueueDemo {
public static void main(String[] args) {
	Demo d=new Demo();
	d.show();
}
}
class Demo{
	public void show() {
		PriorityQueue<Integer> q1=new PriorityQueue<>();
		q1.add(5);
		q1.add(2);
		q1.add(8);
		q1.add(1);
		q1.add(10);
		System.out.println(q1);
		System.out.println("Head is : "+q1.peek());
		System.out.println("Removed : "+q1.remove(5));
		System.out.println(q1);
		System.out.println("Head : "+q1.peek());
	}
}
