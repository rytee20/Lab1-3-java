import java.util.Scanner;

class  QuadraticEquation
{
    public static void main(String[] args) {
        double a,b,c,D;
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте, эта дужелюбная программа решает квадратные уравнения вида a*x^2+b*x+c=0!");
        System.out.println("Введите коэффиценты a, b и c");
        System.out.println("Сначала a:");
        a=in.nextDouble();
        System.out.println("Спасибо!");
        System.out.println("Теперь b:");
        b=in.nextDouble();
        System.out.println("Спасибо!");
        System.out.println("И последний - с:");
        c=in.nextDouble();
        System.out.println("Спасибо!");
        D=b*b-4*a*c;
        System.out.println("Дискриминант = " +D);
        if(D>0)
        {
            double x1,x2;
            x1=(-b-Math.sqrt(D))/(2*a);
            x2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Корни уравнения: " +x1 +" и "+x2);
        }
        else if(D==0)
        {
            double x;
            x=-b/(2*a);
            System.out.println("Корнь уравнения: " +x);
        }
        else
        {
            System.out.println("Корней нет");
        }
        
    }
}
