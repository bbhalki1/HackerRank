import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phMap = new HashMap<String,Integer>(); 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phMap.containsKey(s)){
                   System.out.println(s+"="+phMap.get(s));
                }else{
                System.out.println("Not found");    
            }
        }
        in.close();
    }
}
