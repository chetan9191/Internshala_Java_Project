package determination;

import java.util.*;

public class Fix {
   static int n;
   static int i;
   static int sc=0;
   static int ec=0;
   static double []cgpa=new double[80];
   static String [] name = new String[80];
   static int [] token = new int[80];
   static String [] name1 = new String[80];
   static int [] token1 = new int[80];
   static double []cgpa1=new double[80];
	
	static void enter(){
		//System.out.println("enter mai hai");
		++ec;
		Scanner ok = new Scanner(System.in);
		//for(int i=0;i<n;i++){
		 name[i] =ok.next();
		    cgpa[i] = ok.nextDouble();
		    token[i] = ok.nextInt();
		//}
		
	}
	
	
	static void served(){
		//System.out.println("sever mai hai");
		++sc;
		for(int p=0;p<ec;p++)
	    {
	      for(int j=0;j<ec;j++)
	      {
	    	  //cgpa
	          if(cgpa[j]<cgpa[j+1])
	          {
	           double temp=cgpa[j];
	           String s = name [j];
	           int change = token[j];
	           
	            cgpa[j]=cgpa[j+1];
	            name[j] = name[j+1];
	            token[j] = token[j+1];
	            
	            cgpa[j+1]=temp;
	            name [j+1] = s;
	            token[j+1] = change;
	            
	         
	            
	            
	          }
	          //if cgpa equal
	          if(cgpa[j]==cgpa[j+1]){
	        	  //name
	        	  if (name[j].compareTo(name[j+1])>0) {
	        		  String tempo = name[j];
	        		  int nc = token[j];
	        		  
	                  name[j] = name[j+1];
	                  token[j] = token[j+1];
	                  
	                  name[j+1] = tempo;
	                  token[j+1] = nc;
	                  
	              
	                  
	        	  }
	        	  //if name equal
	        	  if (name[j].compareTo(name[j+1])==0){
	        		 if(token[j]>token[j+1]){
	        			 int tk = token[j];
	        			 token[j] = token [j+1];
	        			 token[j+1] = tk;
	        			 
	        			 
	        		 }
	        	  }
	          }
	      }
	    }
		
		 /*for(int j=0;j<ec;j++){
		    	//System.out.println("first");
		    	System.out.println(name[j] +"\t"+ cgpa[j] +"\t"+ token[j] );
		}*/
		 
		 
		 
		 
		 
		 for(int p=1;p<ec;p++)
		    {
		      for(int j=0;j<p;j++)
		      {
		    	  //cgpa
		    	  cgpa1[j]=cgpa[j+1];
		            name1[j] = name[j+1];
		            token1[j] = token[j+1];
		        			 
		        		 
		      }
		    }
			
			/* for(int j=0;j<sc;j++){
			    	System.out.println("restore");
			    	System.out.println(name1[j] +"\t"+ cgpa1[j] +"\t"+ token1[j] );
			}*/
			 if(name1==null || cgpa1==null || token1==null)
					System.out.println("empty");
		
	}
	
	 static void fun(){
		 
		 
		 for(int p=0;p<ec-sc;p++)
		    {
		      for(int j=0;j<ec-sc;j++)
		      {
		    	  //cgpa
		          if(cgpa1[j]<cgpa1[j+1])
		          {
		           double temp=cgpa1[j];
		           String s = name1 [j];
		           int change = token1[j];
		           
		            cgpa1[j]=cgpa1[j+1];
		            name1[j] = name1[j+1];
		            token1[j] = token1[j+1];
		            
		            cgpa1[j+1]=temp;
		            name1 [j+1] = s;
		            token1[j+1] = change;
		            
		         
		            
		            
		          }
		          //if cgpa equal
		          if(cgpa1[j]==cgpa1[j+1]){
		        	  //name
		        	  if (name1[j].compareTo(name1[j+1])>0) {
		        		  String tempo = name1[j];
		        		  int nc = token1[j];
		        		  
		                  name1[j] = name1[j+1];
		                  token1[j] = token1[j+1];
		                  
		                  name1[j+1] = tempo;
		                  token1[j+1] = nc;
		                  
		              
		                  
		        	  }
		        	  //if name equal
		        	  if (name1[j].compareTo(name1[j+1])==0){
		        		 if(token1[j]>token1[j+1]){
		        			 int tk = token1[j];
		        			 token1[j] = token1 [j+1];
		        			 token1[j+1] = tk;
		        			 
		        			 
		        		 }
		        	  }
		          }
		      }
		    }
			
			 for(int j=0;j<ec-sc;j++){
			    	//System.out.println("unserved person");
			    	System.out.println(name1[j]);
			}
			 
			 
		 
		
	}

	
	public static void main(String[] args) {
		System.out.println("welcome");
		Scanner ok = new Scanner(System.in);
		String cond[]=new String[80];
		n=ok.nextInt();
		
		
		
		
		
		for(i=0;i<n;i++){	
		//System.out.println("type ENTER then name, cgpa, token else type SERVE");
		cond[i]=ok.next();
		
		
		
		 if("ENTER".equals(cond[i])){
			
				enter();
				
		}
		
		 else if("SERVED".equals(cond[i])){
			 
			   served();
		 }
		 
		 
		}
		
		/*if(name1==null&&cgpa1==null&&token1==null)
			System.out.println("empty");
		
		else*/
		
		fun();
	
		
		//System.out.println("successfully completed");
		
		
	}
	
	

}
