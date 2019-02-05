package practice;

public class Secmax {

	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int[] arr={2,4,8,7,11,77,88,1,2,4};
	        int i,secmax,max;
	      
	        max=arr[0];
	       
	        for(i=1;i<arr.length;i++)
	        {
	            if(arr[i]>max)
	            {  
	                max=arr[i];
	            } }
	        System.out.println("max="+max);
	                secmax=arr[0];
	     	    for(i=1;i<arr.length;i++)
	    	        {
	    	            if(arr[i]>secmax && arr[i]<max)
	    	            {secmax=arr[i];
	    	            } }System.out.println("secmax="+secmax);}}

 
	    	                
	            
	                
	        
	            	
	              
	        
	  
	                	
	                 
	        
	      

	    

	