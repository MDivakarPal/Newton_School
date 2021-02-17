import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				String s[] = br.readLine().split(" ");
				int n = Integer.parseInt(s[0]);
				int m = Integer.parseInt(s[1]);
				tellAnswer(n,m);

			}

		
	}

	public static void tellAnswer(int n,int m){
		int i = 2;
		boolean check = false;
		boolean check2 = false;
		while(i<=n){
			int q = (int)Math.sqrt(i);
			for(int j=2;j<=q;j++){
				if(i%j==0){
					check = true;
				}
				if(check)
				break;
			}
			
			if(!check){
				int pow  = (int)Math.pow(i,m);
				if(pow==n){
					check2 = true;
				}
				if(pow>n){
					break;
				}
			}
			check=false;
			i++;
		}
		if(!check2){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}

	}
}