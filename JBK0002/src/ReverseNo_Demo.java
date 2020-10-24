
public class ReverseNo_Demo {
 public static void main(String[] args) {
	int n=1234;
	int rev=0;
	int temp=0;
	while(n>0) {
		temp=n%10;
		rev=rev*10+temp;
		n=n/10;	
	}
	System.out.println(rev);
}
}
