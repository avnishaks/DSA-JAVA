package Array_String;

import java.util.*;

public class  arms {
    public static boolean isPossible(String str, int target) {
        if (str.isEmpty() && target == 0)
            return true;

        for (int i = 1; i <= str.length(); i++) {
            int num = Integer.parseInt(str.substring(0, i));
            if (num <= target && isPossible(str.substring(i), target - num)) {
                return true;
            }
        }
        return false;
    }

        public static int punishmentNumber(int n) {
            int sumPunishment = 0;

            for (int i = 1; i <= n; i++) {
                int iSquared = i * i;
                String iSquaredStr = String.valueOf(iSquared);

                boolean partitionSum = isPossible(iSquaredStr,i);

                if (partitionSum) {
                    sumPunishment += iSquared;
                }
            }

            return sumPunishment;
        }

        public static void main(String[] args) {
            int n = 37;
            int result = punishmentNumber(n);
            System.out.println(result);  // Output: 1478
        }
}


