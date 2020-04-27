import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Phương trình bậc nhất");
        System.out.println("Cho phương trình ax+b=c nhập các hằng số: ");
        System.out.println("Nhập a: ");
        int a=scanner.nextInt();
        System.out.println("Nhập b: ");
        int b=scanner.nextInt();
        System.out.println("Nhập c: ");
        int c=scanner.nextInt();

        if (a!=0){
            int kq= (c-b)/a;
            System.out.println("Phương trình có nghiệm: "+kq);
        }else
        if (b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
