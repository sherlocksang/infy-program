import java.util.Scanner;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
class PersonSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no : ");
        int n = sc.nextInt();
        String names = sc.next();
        String heights = sc.next();
        //System.out.println(names);
        
        String[] res1 = names.split("[,]" ,0);
        String[] res2 = heights.split("[,]" ,0);
        
        Map<String , String>mp = new TreeMap<>(Collections.reverseOrder());
        
        for(int i =0;i<n;i++){
            mp.put(res2[i] , res1[i]);
        }
        int i =0;
        for (String url : mp.values()){
            System.out.print( url );
            if(i < n-1)System.out.print(",");
            
            i++;
        }
        //Write your logic here
        sc.close();
    }

}
