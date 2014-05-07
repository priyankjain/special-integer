import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//Take input using scanner for number of nodes
		System.out.println("Enter the number of nodes");
		Scanner sc=new Scanner(System.in);
		int no_of_nodes=0;
		no_of_nodes = sc.nextInt();
		
		//Create linked list object
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//Generate Random Object for random number generation
		Random rn=new Random();
		for(int i=0;i< no_of_nodes;i++){
			//1 + (a random number between 0 and 149) will give a number between 1 and 150 both inclusive 
			list.add(new Integer(i,rn.nextInt(150)+1));
		}
		//Now do sorting, which would implicitly use the compareTo() method of Integer object
		Collections.sort(list);
		
		//Do first iteration and print table with three columns
		Iterator<Integer> it =list.iterator();
		int count=1;
		
		//Use format specifiers for aligning column headers and values
		System.out.printf("%15s %15s %15s %15s %15s\n","Index"," ","Order"," ","Random number");
		while(it.hasNext()){
			Integer e=it.next();
			System.out.printf("%15d %15s %15d %15s %15d\n",count," ",e.getOrder()," ",e.getRandom_number());
			count++;
		}
		
		//Do second iteration
		int sum_random = 0;
		// lowest_random and highest_random are created to find out range
		int lowest_random = 151;// Since max random number would be 150
		int highest_random = 0;// Since min random number would be 1
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			Integer e=iterator.next();
			sum_random += e.getRandom_number(); 
			if(e.getRandom_number() < lowest_random) lowest_random = e.getRandom_number();
			if(e.getRandom_number() > highest_random) highest_random = e.getRandom_number();
		}
		System.out.println("Sum = "+sum_random);
		System.out.print("Mean = ");
		System.out.printf("%.2f\n",(float)(sum_random/list.size()));
		System.out.println("Range = "+ (highest_random-lowest_random));
		System.out.println("Median = "+ list.get((list.size()-1)/2).getRandom_number());
		int random_index = rn.nextInt(list.size());
		System.out.println("Random integer from random spot = "+ list.get(random_index).getRandom_number());
	}

}
