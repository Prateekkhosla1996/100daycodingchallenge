package recursion;
import java.io.*;
import java.util.*;

public class getMazePaths {

	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        int m= sc.nextInt();
	        ArrayList<String> paths = getMazePaths(1,1,n,m);
	        System.out.println(paths);
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
	        //positive base case
	        if(sr==dr&&sc==dc){
	             ArrayList <String> bres = new ArrayList<>();
		            bres.add("");
		            return bres;
	        }       
	        //negative bose case
	        if(sr>dr||sc>dc){
	             ArrayList <String> bres = new ArrayList<>();
		            return bres;
	        }
	        
	        ArrayList<String> h = getMazePaths(sr, sc+1, dr, dc);
	        ArrayList<String> v = getMazePaths(sr+1, sc, dr, dc);
	        ArrayList<String> res = new ArrayList<>();
	        for(String path:h){
	            res.add("h"+path);
	        }
	        for(String path:v){
	            res.add("v"+path);
	        }
	        
	        return res;
	    }

	}