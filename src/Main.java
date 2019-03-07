public class Main {

    public int sum(int n) {
       //필수 조건  N>=1
       //결과 1부터 n까지의 합을 반환한다.
        int ret=0;

        for(int i=1; i<= n; i++) {
            ret +=1;

        }
        return ret;

    }
 public int recursiveSum(int n) {
        if(n==1) return 1; //더 이상 쪼개지지 않을
        return n +recursiveSum(n-1);
 }

 public static void main(String[] args) {

        Main main = new Main();

        int result1 = main.sum(3);
        int result2 = main.recursiveSum(3);

        if(result1 == result2) {
            System.out.println("equal");
        }else{
                System.out.println("not equeal");
            }
        }

    }
