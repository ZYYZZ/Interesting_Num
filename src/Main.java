import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int y = x+cnum(x,2)+cnum(x,3)+cnum(x,4)+cnum(x,5)+cnum(x,4)+cnum(x,3)+cnum(x,2)+x;
        System.out.printf("%d+%d+%d+%d+%d+%d+%d+%d+%d=%d",
                x,cnum(x,2),cnum(x,3),cnum(x,4),cnum(x,5),
                  cnum(x,4),cnum(x,3),cnum(x,2),x,y);
    }

    public static int cnum(int x, int n){
        int y = 0;
        while (n>1){
            n = n-1;
            y = y+x*(int)(Math.pow(10,n));
        }
        return y+x;
    }
}
