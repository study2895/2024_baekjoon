import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static String[] splitNum(String a) { //a를 쪼개서 배열에 넣는 함수
		String[] arr = new String[100000];
		int cnt = 0;
		for (String s : a.split("")) {
			arr[cnt++] = s;
		}
		return arr;
	}
	
	static String[] andNum(String[] a, String[] b) {
		String[] result = new String[a.length];
		for (int i=0; i<a.length; i++) {
			if (a[i]=="0" & b[i]=="0") {
				result[i]="0";
			}
			else if ((a[i]=="1" & b[i]=="0") | (a[i]=="0" & b[i]=="1")) {
				result[i]="0";
			}
			else result[i]="1";
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		String[] arrA = splitNum(a);
		String[] arrB = splitNum(b);
		
		String[] andAB = andNum(arrA, arrB);
		
		for (int i=0; i<arrA.length; i++) {
			System.out.print(Arrays.toString(andAB));
		}
	}
}
