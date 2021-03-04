package recursion;
import java.io.*;
import java.util.*;

public class GetMazePathsWithJumps {
	

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
		     
		        ArrayList<String> paths =   new ArrayList<>();
		      for(int h=1;h<=dc-sc;h++){
		          ArrayList<String> hpaths=getMazePaths(sr,sc+h,dr,dc);
		      
		          for(String hpath:hpaths){
		                paths.add("h"+h+hpath);  
		           }
		      }
		      
		       
		      for(int v=1;v<=dr-sr;v++){
		          ArrayList<String> vpaths=getMazePaths(sr+v,sc,dr,dc);
		          
		          for(String vpath:vpaths){
		                paths.add("v"+v+vpath);  
		           }
		      }
		      
		      for(int d=1;d<=dr-sr&&d<=dc-sc;d++){
		          ArrayList<String> dpaths=getMazePaths(sr+d,sc+d,dr,dc);
		          
		          for(String dpath:dpaths){
		                paths.add("d"+d+dpath);  
		           }
		      }
		      
		      return paths;
		  }

	}