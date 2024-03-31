import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	/*
	static long get_decimal(long a) { //2진수 -> 10진수 함수
		long decimal_num = 0;
		long cnt = 0; //이진수를 십진수로 변환 시 2 제곱에 사용되는 카운팅
		while (a!=0) {
			decimal_num += (a%10)*Math.pow(2, cnt);
			a/=10;
			cnt++;
		}
		return decimal_num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		
		long ans = get_decimal(a) + get_decimal(b);
		
		ArrayList<Integer> arr = new ArrayList<>();
		while (ans!=0) {
			arr.add((int) (ans%2));
			ans/=2;
		}
		for (int i=arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i));
		}
	}
	*/
	
	// 2진수 입력 -> 10진수 변환 및 덧셈 -> 2진수 변환 및 결과출력
	// 나와 같은 알고리즘으로 진행하였으나 long을 사용해도 길이 80인 입력에 대해서 inputMismatch(길이가 긴 입력값을 수용하지 못함) 오류가 발생해서 아래 코드를 가져옴.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String 클래스로 입력받음. BigInteger 인자값이 문자열이기 때문.
		String a = sc.next();
		String b = sc.next();
		//BigInteger는 굉장히 큰 수의 셈을 하는 경우 사용하기 좋은 클래스이다.
		//int와 long은 범위가 정해져있지만 BigInteger는 범위가 무한이다. 또한 메모리 크기는 int(4 Byte), long(8 Byte)라면 BigInteger는 최소 70 Byte이다.
		BigInteger A = new BigInteger(a, 2);  //A BigInteger 선언
		BigInteger B = new BigInteger(b, 2);  //B BigInteger 선언
		BigInteger sum = A.add(B);  // A.add(B)는 A+B를 의미한다. 덧셈 외에도 A.subtract(B) 뺄셈, A.multiply(B) 곱셈, A.divide(B) 나눗셈, A.remainder(B) 나머지도 활용할 수 있다.
		System.out.println(sum.toString(2));  //toString에서 정수형 숫자를 인자로 넘기면 해당 진수로 변환이 된다. sum.toString(2)는 sum의 값을 2진수로 변환한다.
		sc.close();
	}
}
