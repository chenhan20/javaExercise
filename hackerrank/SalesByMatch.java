import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int num = 0;
        // System.out.print(ar[]);
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                num += 1;
                i += 1;
            } else {
                // do nothing
            }
        }
        return num;
    }

}
