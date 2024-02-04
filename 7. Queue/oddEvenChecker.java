package Lab;
import java.util.*;

public class oddEvenChecker {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		Queue <Integer> oddQueue = new Queue<Integer>();
		Queue <Integer> evenQueue = new Queue<Integer>();
		int loop = sc.nextInt();
		sc.nextLine();

		for (int i =0; i<loop; i++) {
			String numbers = sc.nextLine();
			StringTokenizer st = new StringTokenizer(numbers);
			while(st.hasMoreTokens()) {
				String nextT = st.nextToken();
				if (!(nextT.equals("0"))) {
					int number = Integer.parseInt(nextT);
					if(number % 2 == 0)
						evenQueue.enqueue(number);
					else 
						oddQueue.enqueue(number);
				}
			}
			System.out.print("\noddQueue " +oddQueue.size() + ": ");
			while(!(oddQueue.isEmpty())) {
				System.out.print(oddQueue.dequeue() + " ");
			}

			System.out.print("\nevenQueue " +evenQueue.size() + ": ");
			while(!(evenQueue.isEmpty())) {
				System.out.print(evenQueue.dequeue() + " ");
			}
		}
	}
}

