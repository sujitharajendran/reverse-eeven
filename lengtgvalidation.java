package guviproject;
import java.util.*;
public class lengtgvalidation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	String k="";
	String   str[]=new String[a.length()];
for(int i=0;i<b.length;i++){
	if(i%2==0){
		
		for(int i1=b[i].length()-1;i1>=0;i1--){
		System.out.print(b[i].charAt(i1));
	}
		System.out.print(" ");
	} 
		else{
			
			System.out.print(b[i]);
			System.out.print(" ");
		}


	
}
//String ss=new StringBuffer(k).reverse().toString();
//System.out.print(ss+" ");
	/*for(int j=0;j<a.length();j++){
	if(j%2==1){
		str[j]=b[j];
		System.out.println("the odd are"+str[j]);
	}


	}*/
	}
}
