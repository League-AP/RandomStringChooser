import java.util.ArrayList;

public class RandomLetterChooser extends RandomStringChooser
{
    public RandomLetterChooser( String str )
    {
    	//add code here for Part B of Question 1
    }
    
    public static String[] getSingleLetters( String str )
    {
    	char[] ray = str.toCharArray();
    	String[] ret = new String[ ray.length ];
    	for( int i = 0; i < ray.length; i++ )
    	{
    		ret[i] = ""+ray[i];    		
    	}
    	return ret;
    }
}