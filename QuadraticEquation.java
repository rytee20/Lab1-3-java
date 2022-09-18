import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		double a=0,b=0,c=0,D;
	    String temp;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Здравствуйте, эта дужелюбная программа решает квадратные уравнения вида a*x^2+b*x+c=0!");
	    System.out.println("Введите коэффиценты a, b и c");
	    System.out.println("Сначала a:");
	    temp=in.nextLine();
	    try
	    {
	    	a=Double.valueOf(temp);
		    if(a==0) throw new java.io.IOException();
		    System.out.println("Спасибо! Значение корректно :)");
	    }
	    catch (NumberFormatException e)
	    {
	        System.err.println("Вы ввели не число. Извените, я не могу так посчитать квадратное уравнение. Повторите попытку, пожалйста :(");
	    }
	    catch(java.io.IOException e)
	    {
	        System.err.println("При таком коэффициенте уравнение не будет квадратным. Попрбуйте еще раз, пожалйста :(");
	    }
	    System.out.println("Теперь введите b:");
	    temp=in.nextLine();
	    try
	    {
	        b=Double.valueOf(temp);
		    System.out.println("Спасибо! Значение корректно :)");
	    }
	    catch (NumberFormatException e)
	    {
	        System.err.println("Вы ввели не число. Извените, я не могу так посчитать квадратное уравнение. Повторите попытку, пожалйста :(");
	    }
	    System.out.println("И последний - с:");
	    temp=in.nextLine();
	    try
	    {
	        c=Double.valueOf(temp);
		    System.out.println("Спасибо! Значение корректно :)");
	    }
	    catch (NumberFormatException e)
	    {
	        System.err.println("Вы ввели не число. Извените, я не могу так посчитать квадратное уравнение. Повторите попытку, пожалйста :с");
	    }
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
        System.out.println("Здорово! Хорошего вам дня и удачи <3");
	}
}
