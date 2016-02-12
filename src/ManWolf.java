import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ManWolf {

	
	private static final int q0 = 0;
	private static final int q1 = 1;
	private static final int q2 = 2;
	private static final int q3 = 3;
	private static final int q4 = 4;
	private static final int q5 = 5;
	private static final int q6 = 6;
	private static final int q7 = 7;
	private static final int q8 = 8;
	private static final int q9 = 9;
	private static final int q10 = 10;
	public int state;
	private int newState;
	
		public void reset() {	
			state = q0;
			//System.out.println(state);
			}
	
		 
			  
		  
		 public boolean accepted() {
			// TODO Auto-generated method stub
			  //System.out.println(state==q7);
			  return state==q7;
			
		}


		/*
		   * The transition function represented as an array.
		   * The next state from current state s and character c
		   * is at delta[s,c-'0'].
		   */
		  static private int[][] DFAArray = 
			    {{q10,q1,q10,q10},
			     {q10,q0,q10,q2},				
				 {q8,q10,q3,q2},
				 {q10,q4,q2,q10},
				 {q5,q3,q10,q10},				
				 {q4,q10,q8,q6},			
				 {q10,q7,q10,q5},			
				 {q10,q6,q10,q10},				
				 {q2,q9,q10,q10},
				 {q10,q8,q5,q10},
				 {q10,q10,q10,q10}};
		  /**
		   * Make one transition on each char in the given
		   * string.
		   * @param in the String to use
		   */
		  
		  public void process(String[] args) {
			 
		    for (int i = 0; i < args.length; i++)  {
		    	System.out.println("currentstate: " +state);
		    	System.out.println("curchar: " +curchar);
		    		if (curchar=="w"){
		    			newState=0;
		    		}
				    if (curchar=="g"){
				    	newState=1;
				      }
				    if (curchar=="c"){
				    	newState=2;
				      }
				    if (curchar=="n"){
				    	newState=3;
				      }
				    	 
				    try {
				    	  System.out.println(newState);
				    	  System.out.println(state);
				    	 // System.out.println(newState);
				    	 // System.out.print(state = DFAArray[state][newState]);
				    	  state = DFAArray[state][newState];
				      
				        System.out.println("end state:" + state);
				      }
				      catch (ArrayIndexOutOfBoundsException ex) {
				        state = q10;
				        
				      }
		     
		    }
		    
		  }
		  
		 

	    
	

	
}

