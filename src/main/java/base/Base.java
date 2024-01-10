package base;

import com.microsoft.playwright.*;

public class Base {

    public void validate(String actualValue, String expectedValue, String message){
        if (actualValue.equals(expectedValue)){
            System.out.println(message);
        }else {
            System.out.println("Validation failed for "+expectedValue);
        }

    }



}