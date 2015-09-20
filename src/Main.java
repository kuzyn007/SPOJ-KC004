/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/KC004/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())
		{
			int SumaPoszukiwanych = 0;
			
			int poszukiwana = in.nextInt();
			int DlugoscLiczb = in.nextInt();
			for(int i=0; i<DlugoscLiczb; i++)
			{
				int SeriaLiczb = in.nextInt();
				if(poszukiwana == SeriaLiczb)
				{
					SumaPoszukiwanych = SumaPoszukiwanych + 1;
				}
			}
			System.out.println(SumaPoszukiwanych);
			in.nextLine();
		}
		
		in.close();
	}

}

