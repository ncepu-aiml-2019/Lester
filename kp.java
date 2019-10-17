import java.util.Scanner;

public class kp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String k = in.nextLine();
		in.close();
		String []a = k.trim().split(" ");
		int []b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.parseInt(a[i]);
		}
		int m=0;
		int n=0;
		for(int i =0;i<a.length;i++)
		{
			int x=b[i];
			int y =0;
			for(int j=0;j<a.length;j++) {
				if(b[j]==x)
					y++;
			}
			if(y>=n) {
				n=y;m=x;
			}
		}
		if(n>a.length/2) {
			System.out.println(m);
		}
		else
			System.out.println(-1);
	}

	}


