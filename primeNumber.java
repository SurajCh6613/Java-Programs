public class primeNumber {
     public static void main(String[] args) {
        int n=10;
        int[]prime=new int[n];

        for(int i=0; i<n; i++){
            prime[i]=i;
        }
        prime[0]=0;
        prime[1]=0;
        for(int i=2; i*i<=n; i++){
            if(i==0){
                continue;
            }
            for(int j=i+1; j<=n-2; j++){
                if(j==i){
                    continue;
                }
                else{
                    if(j%i==0){
                        prime[j]=0;
                    }
                }
            }
        }
        // System.out.println(prime);
        for(int i=0; i<n; i++){
        System.out.println(prime[i]);
        }
        
     }
    
        
}
