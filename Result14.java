import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

// Note : Just working in java 7

class Prime {
    public static void checkPrime(int... numbers){
        for (int number : numbers) {
            if (number <= 1){
                continue;
            }else if (number == 2 || number == 3){
                System.out.print(number + " ");
            }else if (number % 2 == 0){
                continue;
            }else{
                boolean isPrime = true;
                for (int i = 3; i <= Math.sqrt(number); i += 2) {
                    if (number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(number + " ");
                }
            }
                
                
                
            
            
        }
        System.out.println(" ");
    }
}

public class Result14 {
    public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
