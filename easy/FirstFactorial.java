import java.util.*;
import java.io.*;

class FirstFactorial {
  public static int factorial(int num) {
      // Solved using recursion
       if (num == 0)
            return 1;
        else
            return (num * FirstFactorial(num - 1));
  }

}

// 1. If num is not equal to 0 keep calling the method recursively
