package plagrism;
// Import the File class
import java.io.*;
import java.util.Scanner;  
import java.nio.charset.*;



public class plagrism {
	

	public static String[] Substring(String s)
	{
		

		  int temp1 = s.length();
		   String[]  s1 = s.split("");
		   
		  
		  
		   String [] fs1 = new String [1000];
		   for (int k=0; k<temp1; k++)
		    {
		    	fs1[k] ="";
		    	
		    	
		    	
		    }
		    
		    int j=0;
		    
	       for (int i = 0; j!=temp1; i++)
		    
		    {
		    	
		    		
		    	for (; !s1[j].contentEquals(".")  ; j++)
		    		
		    		 
		    	{  fs1[i]+=s1[j];

	    		
		    		
		     
	                 
		    	}
		    	j++;
		    	
		    	
		    	
		    	//System.out.println("Substrings in file 1 are -> "+  fs1[i]);
		    
		 
		    
		
		    } 
		
    return fs1;		
		
		
	
		
	}
	

		
	
	 
	public static void main(String[] args) throws IOException {
		
		
		
		
	
		
		File your_file1 = new File("filef.txt"); //your text file
		Scanner sc1 = new Scanner(your_file1); // initialize your 
		//scanner with text file
		String f1 ="";
		while(sc1.hasNextLine()){
		    f1 =f1+sc1.nextLine();    
		}
		
		
		File your_file2 = new File("filef1.txt"); //your text file
		Scanner sc2 = new Scanner(your_file2); // initialize your 
		//scanner with text file
		String X ="";
		while(sc2.hasNextLine()){
		    X =X+sc2.nextLine();    
		}
		
		
		
		
	   //    long startTime = System.nanoTime();
		  // String f1 = "Hi Ali. how are you?.";
		 //  String X = "how are you";
		    
		  String[] newf1 = Substring(f1);
		  
		 
	       int m = X.length();
	 
		
	
		  for (int ii=0; !newf1[ii].contentEquals(""); ii++)
			  
		  {
			  String Y = newf1[ii].toString();
		  
			  int n = Y.length();
	
			        int[][] LCSuff = new int[m + 1][n + 1]; 
			  
			        // To store length of the longest common substring 
			        int len = 0; 
			  
			        // To store the index of the cell which contains the 
			        // maximum value. This cell's index helps in building 
			        // up the longest common substring from right to left. 
			        int row = 0, col = 0; 
			  
			      //   Following steps build LCSuff[m+1][n+1] in bottom 
			        //   up fashion. 
	    for (int i = 0; i <= m; i++) { 
			            for (int j = 0; j <= n; j++) { 
			                if (i == 0 || j == 0) 
			                    LCSuff[i][j] = 0; 
			  
			                else if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
			                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1; 
			                    if (len < LCSuff[i][j]) { 
			                        len = LCSuff[i][j]; 
			                        row = i; 
			                        col = j; 
			                    } 
			                } 
			                else
			                    LCSuff[i][j] = 0; 
			            } 
			        } 
			  
			        // if true, then no common substring exists 
			        if (len == 0) { 
			            System.out.println("No Common Substring"); 
			            return; 
			        } 
			  
			        // allocate space for the longest common substring 
			        String resultStr = ""; 
			  
			        // traverse up diagonally form the (row, col) cell 
			        // until LCSuff[row][col] != 0 
			        while (LCSuff[row][col] != 0) { 
			            resultStr = X.charAt(row - 1) + resultStr; // or Y[col-1] 
			            --len; 
			  
			            // move diagonally up to previous cell 
			            row--; 
			            col--; 
			        } 
			  
			        // required longest common substring 
			        System.out.println(" plagerism is  "+ resultStr);
			        
			       
			        
			        
			        
			     
			    } 
		 // long endTime = System.nanoTime();
	    //    System.out.println("It took " + (endTime - startTime) + " nanoseconds"); 
		
		
		
	}
}
		

	
			  
			  
			  
			  
			  
			  
		  
			  
		 
		  
		  
		  
		/*  static void printLCSubStr(String X, String Y, int m, int n) 
		    { 
		        // Create a table to store lengths of longest common 
		        // suffixes of substrings.   Note that LCSuff[i][j] 
		        // contains length of longest common suffix of X[0..i-1] 
		        // and Y[0..j-1]. The first row and first column entries 
		        // have no logical meaning, they are used only for 
		        // simplicity of program 
		        int[][] LCSuff = new int[m + 1][n + 1]; 
		  
		        // To store length of the longest common substring 
		        int len = 0; 
		  
		        // To store the index of the cell which contains the 
		        // maximum value. This cell's index helps in building 
		        // up the longest common substring from right to left. 
		        int row = 0, col = 0; 
		  
		        /* Following steps build LCSuff[m+1][n+1] in bottom 
		           up fashion. */
	/*	        for (int i = 0; i <= m; i++) { 
		            for (int j = 0; j <= n; j++) { 
		                if (i == 0 || j == 0) 
		                    LCSuff[i][j] = 0; 
		  
		                else if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
		                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1; 
		                    if (len < LCSuff[i][j]) { 
		                        len = LCSuff[i][j]; 
		                        row = i; 
		                        col = j; 
		                    } 
		                } 
		                else
		                    LCSuff[i][j] = 0; 
		            } 
		        } 
		  
		        // if true, then no common substring exists 
		        if (len == 0) { 
		            System.out.println("No Common Substring"); 
		            return; 
		        } 
		  
		        // allocate space for the longest common substring 
		        String resultStr = ""; 
		  
		        // traverse up diagonally form the (row, col) cell 
		        // until LCSuff[row][col] != 0 
		        while (LCSuff[row][col] != 0) { 
		            resultStr = X.charAt(row - 1) + resultStr; // or Y[col-1] 
		            --len; 
		  
		            // move diagonally up to previous cell 
		            row--; 
		            col--; 
		        } 
		  
		        // required longest common substring 
		        System.out.println(resultStr); 
		    } */
		
	/*		String [] newf2 = Substring(f2);
				  int n = newf1.length;
				 
				/*  if (newf1[2].equals(newf2[2]) )
				  {
					 // System.out.println( " True");
					  
				  }
				  else
				  {
					  
					  
					// System.out.println("False");
					  
					  
				 }
				  
				   
				  
				  
				
				 
				  
				 for (int i=0; !newf1[i].contentEquals(""); i++)
					
					 {
					       for (int j=0; !newf2[j].contentEquals(""); j++)
				  
					  {
					    	   if (newf1[i].equals(newf2[j]))
					  
					  {
							 
							 System.out.println(" Plageriasm found and The common line is -> " + newf1[i]);
							 
							
						 }
					  else 
					  {
						 
					  }
					    	   
					    	   
					  } 						  
							  
							  
				  
						  
						  
						  
					  } */
					  
					  
					  
					  		

			
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	


