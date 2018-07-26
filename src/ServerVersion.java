import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ServerVersion {
	    public static int processData(ArrayList<String> array) {
	      Iterator iter = array.iterator();
	      HashMap<String, String> map = new HashMap<>();
	      int count = 0;
	      while (iter.hasNext()) {
	         String server = (String)iter.next();
	         String [] arrayofstr = server.split(", ");
	         if(map.containsKey(arrayofstr[2])){
	            String val = map.get(arrayofstr[2]);
	            String [] arr1 = val.split(".");
	            String [] arr2 = (arrayofstr[3]).split(".");
//	            System.out.println(val);
	         } else {
	            map.put(arrayofstr[2],arrayofstr[3]);
	         }  
	         System.out.println(arrayofstr[3]);
	      } 
	        
	        return count;
	    }   
	    
	    public static void main (String[] args) {
	        ArrayList<String> inputData = new ArrayList<String>();
	        try {
	            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
	            while(in.hasNextLine()) {
	                String line = in.nextLine().trim();
	                if (!line.isEmpty()) // Ignore blank lines
	                    inputData.add(line);
	            }       
	            int retVal = processData(inputData);
//	            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//	            output.println("" + retVal);
//	            output.close();
	        } catch (IOException e) {
	            System.out.println("IO error in input.txt or output.txt : " + e.getMessage());
	        }   
	    }   
}
