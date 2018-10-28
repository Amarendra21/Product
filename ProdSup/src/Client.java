import java.util.Scanner;
public class Client {

	
	
	public static void main(String[] args) {
		Client c1=new Client();
		
		
		Supplier[] sup=new Supplier[10];
		Scanner in = new Scanner(System.in);
		System.out.println("CHOOSE AN OPTION");
		System.out.println("1. ADD");
		int ch = in.nextInt();
		int i = 0;
		switch(ch)
		{
		case 1: sup[i] = new Supplier();
		if(sup[++i].addSupplier());
			{
				System.out.println("Supplier Added");
			}
		}
		in.close();
	}
	
}
