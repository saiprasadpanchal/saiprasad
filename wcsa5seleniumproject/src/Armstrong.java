import java.util.Scanner;
	
public class Armstrong {
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter The number");

			int num = sc.nextInt();
			int Final=num;
			int numCopy=num;
			int num2=num;
			int sum=1;
			int count=0;
			while(num>0){
				int last = num%10;
				num2=num/10;
				count++;
			}

			while(numCopy>0){
				int last = numCopy%10; //12387=5,
				sum=last;
				for(int i=1; i<=count; i++){
					sum=sum+(last*last); //7*5=35, 
					i++;
				}
				numCopy/=10;
			}
			System.out.println(sum);
			System.out.println(num);
			if(sum==Final){
				System.out.println("Armstrong");
			}else{
				System.out.println("Not Armstrong");
			}


			
		}
	}



