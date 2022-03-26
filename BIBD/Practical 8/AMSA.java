import java.io.*;
import java.util.*;

public class AMSA {
    
    public static int findCharCount(String stream, char XE, int random, int length) {
        int countOccurence = 0;

        for(int i = random; i < length; i++)
        {
            if(stream.charAt(i) == XE)
            {
                countOccurence++;
            }
        }


        return countOccurence;
    }

    public static int estimateValue(int XV1, int n) {
        int expValue;

        expValue = n * (2 * XV1 - 1);
        return expValue;
    }

    public static void main(String[] args) {
        int n = 15;
        String stream = "abcbdacdabdcaab";

        int randomValues[] = {3, 8, 13};
        char[] XE = new char[3];
        int[] XV = new int[3];
        int[] expValue = new int[3];
        int apprSecondMomentValue;

        for(int i = 0; i < randomValues.length; i++)
        {
            XE[i] = stream.charAt(randomValues[i] - 1);
        }

        for(int i = 0; i < randomValues.length; i++)
        {
            XV[i] = findCharCount(stream, XE[i], randomValues[i] - 1, n);
        }

        System.out.println(XE[0] + "=" + XV[0] + " " + XE[1] + "=" + XV[1] + " " + XE[2] + "=" + XV[2]);

        for(int i = 0; i < randomValues.length; i++)
        {
            expValue[i] = estimateValue(XV[i], n);
        }

        for(int i = 0; i < randomValues.length; i++)
        {
            System.out.println("Expected value for "+XE[i]+" is :: "+expValue[i]);
        }
       

        apprSecondMomentValue = Arrays.stream(expValue).sum() / 3;
        System.out.println("Second moment is:" + apprSecondMomentValue);
    }
}
