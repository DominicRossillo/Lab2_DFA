
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
	
	int [][] DFAArray = {
			//q0
			{q10,q10,q1,q10,q10},
			//q1
			{q10,q10,q0,q10,q2},
			//q2
			{q10,q8,q10,q3,q2},
			//q3
			{q10,q10,q4,q2,q10},
			//q4
			{q10,q5,q3,q10,q10},
			//q5
			{q10,q4,q10,q8,q6},
			//q6
			{q10,q10,q7,q10,q5},
			//q7
			{q10,q10,q6,q10,q10},
			//q8
			{q10,q2,q9,q10,q10},
			//q9
			{q10,q10,q8,q5,q10},
			// error state q10
			{q10,q10,q10,q10,q10}
			
			
	};
	
	static private int DFAstate(int s, char c) {
	    switch (s) {
	      case q0: switch (c) {
	            case '0': return q0;
	            case '1': return q1; 
	            default: return q3;
	          }
	      case q1: switch (c) {
	            case '0': return q2;
	            case '1': return q0;
	            default: return q3;
	          }
	      case q2: switch (c) {
	            case '0': return q1;
	            case '1': return q2; 
	            default: return q3;
	          }
	      
	      case q4: switch (c){
	      		case '0': return q1;
	      }
	      
	      case q5: switch (c){
    		    case '0': return q1;
	      }
	      
	      case q6: switch (c){
	      		case '0': return q1;
	      }
    
	      
	      
	      case q7: switch (c){
    			case '0': return q1;
	      }
    
	      case q8: switch (c){
	      		case '0': return q1;
	      }
    
	      case q9: switch (c){
    			case '0': return q1;
	      }
	      
	      default: return q3;
	    }
	    
	    
	}

	
}
