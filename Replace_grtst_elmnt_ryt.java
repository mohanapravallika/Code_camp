package code_camp;
import java.util.*;
public class Replce_Grtest_Elmnt_Ryt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		int elements[] = new int [n];
		System.out.println("Enter Elements:");
		for(int i = 0; i<n; i++)
		{ elements[i] = sc.nextInt(); }
		 
		for (int i = 0; i < (n-1); i++)
		{
			int max = 0;
			for(int j = i+1; j < n; j++)
			{
				if (elements[j]>max)
				{ max = elements[j]; }
		    }
			elements[i] = max;
	    }
		elements[n-1] = -1;
		for(int i = 0; i<n; i++)
		{
			System.out.print(elements[i]+" ");
		}
    }
}

