import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Hasta que tabla de multiplicar quieres");
        int tablas=entrada.nextInt();
        System.out.print("* |  ");
        for(int i=1;i<=tablas;i++){
            System.out.print(i+"  ");
        }
        System.out.println(" ");

        for(int j=0;j<=tablas;j++){
            System.out.print("---");
        }
        System.out.println();

        for (int k=1;k<=tablas;k++){
            System.out.print(k+" | ");
            for(int h=1;h<=tablas;h++){
                System.out.print(k*h+"  ");
            }
            System.out.println();
        }

    }
}
