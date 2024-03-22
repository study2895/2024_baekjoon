import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	int sum = 0;
		for(int i=1; i<=N; i++) {
			for(int j=2; j<=i/2; j++) 
				if(i%j==0) sum+=j; sum+=i; sum+=1;
		}
		System.out.println(sum);
		br.close();
	}
}
