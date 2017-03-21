
//CodeGladiators 2017 Flipping Bit(Flipping a Bit)
public static int nochange_bits(String input1,int input2,int input3)
    {
	    //Write code here
	    int sol = 0;
	    StringBuilder str = new StringBuilder(input1);
	    if(input2 <=0 || input3 <=0){
	        return -1;
	    }
	    else{
	        for(int i = 0; i<input1.length();i+=input2){
	            if(str.toString().charAt(i) == '1')
	                str.setCharAt(i,'0');
	            else 
	                str.setCharAt(i,'1');
	        }
	        for(int i = 0; i<input1.length();i+=input3){
	            if(str.toString().charAt(i) == '1')
	                str.setCharAt(i,'0');
	            else 
	                str.setCharAt(i,'1');
	        }
	    }
	    String str2 = str.toString();
	    for(int i = 0; i<input1.length();i++){
	        if(input1.charAt(i) == str2.charAt(i))
	            sol++;
	    }
	    return sol;
    }