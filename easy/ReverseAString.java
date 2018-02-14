import java.util.*;
import java.io.*;

class ReverseAString {
  public static String FirstReverse(String str) {

    StringBuilder build = new StringBuilder();

     // appends the value of str onto build
     build.append(str);

     // reverse the string inside build
     build.reverse();

     // returns a reversed string 
    return build.toString();

  }


}
