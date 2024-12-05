package StringPrecctis;

import java.util.Scanner;
import java.util.Stack;

public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Enter your string in a program :");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans =wordReverse(str);
        System.out.println(ans);
    }
    public static String wordReverse (String args) {
        Stack<String>str2=new Stack<>();
        String [] str=args.split("\\s+");
        for(String st:str){
          str2.push(st);
        }
        String pt="";
       while(!str2.isEmpty()){
        pt+=str2.pop();
        pt+=" ";
       }
        return pt;
    }
    
}
