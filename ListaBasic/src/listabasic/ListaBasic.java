package listabasic;
import java.util.Scanner;
// tranformar em Multicoisas e inserir estruturas de repetição variadas;
public class ListaBasic {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //F = C x 1,8 + 32.
        // 1
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = teclado.nextDouble();
        double fahren = celsius * 1.8 +32;
        System.out.println("a temperatura de "+celsius + " graus C equivale a "+fahren+" graus F.");
        
        //2
        System.out.println("Digite a temperatura em Fahrenheit:");
        fahren = teclado.nextDouble();
        celsius = (fahren - 32) / 1.8;
        System.out.println("A temperatura de "+ fahren+" graus F equivale a "+ celsius+" graus C");
        
        //3
        System.out.println("Digite a sua altura, em M:");
        double altura = teclado.nextDouble();
        System.out.println("Agora digite o seu peso, em KG:");
        double peso = teclado.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("O seu IMC é de "+imc);
        
        //4
        System.out.println("Digite um valor:");
        double valor = teclado.nextDouble();
        double quadrado = valor * valor;
        double cubo = valor * valor * valor;
        System.out.println("O número "+valor +" ao quadrado é "+quadrado+" e ao cubo é "+cubo+".");
        
        
        //5
        System.out.println("CALCULADORA DE TRIÂNGULO");
        System.out.println("Digite a base do triângulo:");
        double base = teclado.nextDouble();
        System.out.println("Agora digite a altura:");
        double alturaDoTriangulo = teclado.nextDouble();
        double areaDoTriangulo = base * alturaDoTriangulo;
        System.out.println("A área do triângulo apresentado é de "+areaDoTriangulo);
        
        
        
        
    }
    
}
