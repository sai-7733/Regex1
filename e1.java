 import java.util.regex.*;
 class Regex{
     public static void main(String args[]){
         Pattern p=Pattern.compile("ab");
         Matcher m=p.matcher("ababbababbaa");
         int c=0;
         while(m.find()){
             c++;
             System.out.println(m.start());
         }
         System.out.println(c);
     }
 }
