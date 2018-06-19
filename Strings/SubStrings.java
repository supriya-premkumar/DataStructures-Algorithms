/**
 * Write a function that takes a string and return a list of lists with all possible substring combinations based on
 * given list of acceptable substrings words cannot repeat
 */

import java.util.ArrayList;


public class SubStrings{
    public static void main(String[] args){
        String arg = "abcd";
        System.out.println(SubString(arg));

    }


    /**
     * Using java substring method
     * SubString: method that calculates the substrings combinations.
     * @param input, String
     * @return result, ArrayList<ArrayList<String>>
     */
    public static ArrayList<ArrayList<String>> SubString(String input){
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

        for(int i =0; i<input.length(); ++i){
            for(int j=i+1; j<=input.length(); j++){
                ArrayList<String> subStr = new ArrayList<>();
                subStr.add(input.substring(i,j));
               result.add(subStr);

            }
//            result.add(subStr);

        }
        return result;
    }

    /**
     * Without using java substring
     * SubString2: method that calculates Substring combinations of a given string
     * @param input, String
     * @return result, ArrayList<ArrayList<String>>
     */
    public static ArrayList<ArrayList<String>> SubString2(String input){
        ArrayList<String> subStr = new ArrayList<String>();
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

        for(int i=0; i<input.length(); i++){
            for(int j=0; j<input.length(); j++){

            }
        }


    }



}