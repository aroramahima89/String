import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          String res="";  
          Stack<Character> st=new Stack<Character>();
          for(int i=1;i<s.length()-1;i++){
             if(s.charAt(i)==' '){
                 while(!st.isEmpty()){
                    char x=st.pop();
                    res+=x;
                 }
                 res+=" ";
             }
             else{
              st.push(s.charAt(i));
             }
          }
          while(!st.isEmpty()){
             char x=st.pop();
             res+=x;
          }
          
          System.out.println('"'+res+'"');
    }
}