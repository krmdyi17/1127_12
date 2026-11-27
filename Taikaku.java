import java.util.Scanner;

class Taikaku{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] A = new int[N+1][N+1];
        
        for(int i=1; i<N+1; i++){
            for(int j=1; j<N+1; j++){
            A[i][j] = sc.nextInt();
        }
    }

        int sum = 0;

        for(int i=1; i<N+1; i++){
            sum += A[i][i];
            sum += A[i][N+1-i];
        }
    
    if(N % 2 == 1){
        sum -= A[(N+1)/2][(N+1)/2];
    }
        System.out.println(sum);
}
}



    

    
