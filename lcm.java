import java.util.Arrays;

public class lcm {
    public static void main(String[] args) {
        int arr[] = new int[] { 3, 4, 5, 1 };
        int pp = findlcm(arr, arr.length);
        Arrays.sort(arr);
        int pd=findlcm(arr, arr.length);
        System.out.println(pp);
        System.out.println(pd);


    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int findlcm(int arr[], int n) {
        int ans = arr[1];
        for (int i = 2; i < n; i++)
            ans = (((arr[i] * ans)) /
                    (gcd(arr[i], ans)));
        return ans;
    }
}
