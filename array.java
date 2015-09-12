import java.util.*;
public class array
{	public static void main(String args[])
	{	
	Scanner input=new Scanner(System.in);
		int masuk,i,x,j,t;
		
		int [] n=new int[3];
		System.out.println("masukan 3 bilangan ");
		for(i=0; i<3; i++)
			masuk=input.nextInt();
		for(i=0; i<3; i++)
			System.out.print(n[i]+ " ");
	t=n[0];
		for(i=0; i<3; i++)
		{	for(j=1; j<3-1; j++)
			{	if(n[j-1]>n[j])
				{	t=n[j-1];
					n[j-1]=n[j];
					n[j]=t;
				}
			}
		}System.out.println("nilai terkecil adalah " + t);
		x=n[0];
		for(i=0; i<3; i++)
		{	for(j=1; j<5-1; j++)
			{	if(n[j]>n[j-1])
				{	x=n[j];
					n[j]=n[j-1];
					n[j-1]=x;
				}
			}
		}System.out.println("nilai terbesar adalah " + x);
	
	}
}
		
		