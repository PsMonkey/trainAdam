
public class First {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i < n*2-1 ; i += 1){
            for(int b = 0 ; b <= i && b <= (n - 1) * 2 - i; b += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
