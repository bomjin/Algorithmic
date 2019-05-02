package com.company;

public class Exam1 {


    public static int func(int n) {  //func 의 mission은 0~n까지의 합을 구하는 것이다.
        if (n == 0)
            return 0;  // n=0이라면 합은 0이다.
else
        return n + func(n-1); // n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.
    }


}
