import java.util.*;

public class MnemonicsPhoneNumber{
  private static final String[] MAPPING = {"0","1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

  public static void main(String[] args){
    phoneMnemonics("65");

  }

  public static List<String> phoneMnemonics(String phoneNumber){
    char[] partialMnemonic = new char[phoneNumber.length()];
    List<String> result = new ArrayList<String>();
    phoneMnemonicHelper(phoneNumber, 0, partialMnemonic, result);
    return result;

  }

  public static void phoneMnemonicHelper(String phoneNumber, int digit, char[] partialMnemonic, List<String> result){

    if(digit == phoneNumber.length()){
      result.add(new String(partialMnemonic));
      System.out.println("Main ArrayList Result: " + result);
      return;
    }

    for(int i=0; i<MAPPING[phoneNumber.charAt(digit) - '0'].length(); ++i){
      char c = MAPPING[phoneNumber.charAt(digit) - '0'].charAt(i);
      System.out.println("digit: " + digit );
      partialMnemonic[digit] = c;
      System.out.println("c: " + c);
      System.out.println("partialMnemonic char Array" + Arrays.toString(partialMnemonic));
      System.out.println("**************************************************************");
      phoneMnemonicHelper(phoneNumber, digit+1, partialMnemonic, result);

    }




    }


}
