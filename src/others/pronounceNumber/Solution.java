package others.pronounceNumber;

/**
 * 
 * ref:http://stackoverflow.com/questions/21521520/how-to-convert-an-int-so-as-to-return-the-string-which-is-how-we-say-the-int
 * ref:http://www.rgagnon.com/javadetails/java-0426.html
 * @since May 9, 2015
 */
public class Solution {
	public static String pronounce (int number) {
		String result = "";
        int cnt = 0;
        while (number != 0) {
            int rem = number % 1000;
            result = convertLessThanOneThousand(rem) + result;
            number = number / 1000;
            cnt++;
            if (number != 0) {
                switch (cnt) {
                case 1:
                    result = " thousand," + result;
                    break;
                case 2:
                    result = " million," + result;
                    break;
                case 3:
                    result = " billion," + result;
                    break;
                }
            }
        }
        return result;
		 
	}
	
	private static String convertLessThanOneThousand(int number) {
		final String[] tensNames = {
			    "",
			    " ten",
			    " twenty",
			    " thirty",
			    " forty",
			    " fifty",
			    " sixty",
			    " seventy",
			    " eighty",
			    " ninety"
			  };
		final String[] numNames = {
			    "",
			    " one",
			    " two",
			    " three",
			    " four",
			    " five",
			    " six",
			    " seven",
			    " eight",
			    " nine",
			    " ten",
			    " eleven",
			    " twelve",
			    " thirteen",
			    " fourteen",
			    " fifteen",
			    " sixteen",
			    " seventeen",
			    " eighteen",
			    " nineteen"
			  };
		String soFar;

	    if (number % 100 < 20){
	      soFar = numNames[number % 100];
	      number /= 100;
	    }
	    else {
	      soFar = numNames[number % 10];
	      number /= 10;

	      soFar = tensNames[number % 10] + soFar;
	      number /= 10;
	    }
	    if (number == 0) 
	    	return soFar;// < 100
	    return numNames[number] + " hundred" + soFar; //100 < x < 999
	}
}
