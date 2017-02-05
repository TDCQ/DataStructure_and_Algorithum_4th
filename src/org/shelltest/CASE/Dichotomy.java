package org.shelltest.CASE;

/**
 * Created by gaocheng on 2/5/2017 12:36 PM.
 * 二分法
 */
public class Dichotomy {

    /**
     * 二分法查找不大于（log以2为底N的对数）的最大整数
     * @param N 传入int参数
     * @return  -1 或者求得的结果
     */
    public static int maxLogN(int N){
        int lo = 0;
        int hi = N;


        while (lo < hi) {
            int mid = lo + (hi-lo) / 2;
            if(Math.pow(mid,2) > N) {
                hi = mid;
            } else if(Math.pow(mid, 2) <= N && (Math.pow(mid+1,2)) >= N) {
                return mid;
            } else {
                lo = mid;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        System.out.print(maxLogN(100));
    }
}
