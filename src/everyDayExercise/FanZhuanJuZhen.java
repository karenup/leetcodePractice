package everyDayExercise;

/**
 * @author songkaiwen
 * @date 2020/12/7 1:20 下午
 */
public class FanZhuanJuZhen {
    public static int getBySum(int[][] num){
        int m = num.length, n = num[0].length;
        int head = m * (1<<(n-1));
        int result = head;

        for(int j=1;j<n;j++){
            int nOnes = 0;
            for(int i = 0;i<m;i++){
                if(num[i][0] == 1){
                    nOnes += num[i][j];
                }else{
                    nOnes += 1-num[i][j];
                }
            }
            int maxS = Math.max(nOnes,m-nOnes);
            result += maxS*(1<<(n-j-1));
        }
        return result;
    }

    public static void main(String[] args){
        int[][]num = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(getBySum(num));
    }
}
