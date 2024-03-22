import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1037번 : 약수를 입력했을 때, 어떤 수의 약수인지 출력
		//가장 큰 값과 가장 작은 값을 곱해야 한다.
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int arr[] = new int[A];
		
		// A의 개수만큼 약수를 입력받는 코드
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int min = 1000000;
		// for문으로 배열을 하나씩 보면서 해당 index의 값이 max보다 클 경우, max에 대입한다.
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.print(max*min);
		
		sc.close();
	}
}
