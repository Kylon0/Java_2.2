public class Main {
    public static void main(String[] args) {
        int check = 200;
        int up = 1200;
        int sum = check + up;
        if (sum>1000) {
            sum = sum + (1*(sum/100));
        }
        System.out.println(sum);
    }
    }
