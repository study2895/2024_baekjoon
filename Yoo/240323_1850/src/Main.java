import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static long one_generator(long a) {
		String one = "1";
		for (long i=0; i<a-1; i++) {
			one += "1";
		}
		return Long.parseLong(one);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		long a = Long.parseLong(bf.readLine());
		long b = Long.parseLong(bf.readLine());
		
		long a_to_one = one_generator(a);
		long b_to_one = one_generator(b);
		
		while (a_to_one%b_to_one!=0) {
			long r = a_to_one%b_to_one;
			a_to_one = b_to_one;
			b_to_one = r;
		}
		
		System.out.println(b_to_one);
	}
}
