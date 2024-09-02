import java.util.Scanner;

public class Tasks {
    public static boolean fibonnacci(int n) {;
        if (n == 0 || n == 1) return true;
        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }


    public static int checkString(String str) {
        int sum = 0;

        for(char c : str.toLowerCase().toCharArray()) {
            if(c == 'a')
                sum++;
        }

        return sum;
    }

    public static int soma(int i, int k) {
        int soma = 0;
        while(k < i) {
            k++;
            soma++;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        if(fibonnacci(n)) System.out.println("O número está na sequência!");
        else System.out.println("O número não está na sequência!");


        String str = sc.nextLine();
        System.out.println("A letra 'a' apareceu " + checkString(str) + " vezes");

        int i = sc.nextInt();
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();

        System.out.println(soma(i, k));
    }


}
