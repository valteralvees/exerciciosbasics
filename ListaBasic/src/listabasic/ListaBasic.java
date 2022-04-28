package listabasic;
import java.util.Scanner;
import java.util.Calendar;

// tranformar em Multicoisas e inserir estruturas de repetição variadas;
public class ListaBasic {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //F = C x 1,8 + 32.
        // 1
     /*
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
        int escolha =0;
        System.out.println("Digite um valor:");
        double valor = teclado.nextDouble();
        System.out.println("Por favor, selecione o que você deseja ver:");
        System.out.println("1- Quadrado do número");
        System.out.println("2- Cubo do número");
        escolha = teclado.nextInt();
        switch(escolha){
            case 1:
                double quadrado = valor * valor;
                System.out.println("O número "+valor +" ao quadrado é "+quadrado);
            break;
            case 2:
                double cubo = valor * valor * valor;
                System.out.println("O número "+valor +" ao cubo é "+cubo+".");
            break;
        }
       
        
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
        
        //6
        
        System.out.println("Digite um VALOR:");
        int valorNum = teclado.nextInt();
        while(valorNum <0 || valorNum>10){
            System.out.println("Por favor, digite um número válido:");
            valorNum=teclado.nextInt();
        }
        if(valorNum %2 ==0){
            System.out.println("O número está entre 0 e 10 e é PAR");
        }else if(valorNum %2==1){
            System.out.println("O número está entre 0 e 10 e é ÍMPAR");
        }
        
        //7
        Calendar cal = Calendar.getInstance();
        double anoAtual = cal.get(Calendar.YEAR);
        System.out.println("O ano atual é "+ anoAtual );
        
        if (anoAtual %4==0){
            System.out.println("O ano atual é bissexto.");
        }else{
            System.out.println("O ano atual NÃO é bissexto");
        }
      
        //8
        System.out.println("Digite a nota da primeira unidade:");
        int nota1 = teclado.nextInt();
        System.out.println("Digite a nota da segunda unidade:");
        int nota2 = teclado.nextInt();
        float mediaSemestre = (nota1 + nota2)/ 2;
        if (mediaSemestre <4){
            System.out.println("Aluno REPROVADO, pois não atingiu nota suficiente para recuperação.");
        } else if(mediaSemestre >=4 && mediaSemestre <7){
            System.out.println("Aluno em RECUPERAÇÃO de nota. Aguarde informações sobre a prova.");
        }else if (mediaSemestre >7 && mediaSemestre <10){
            System.out.println("Aluno APROVADO, com média "+mediaSemestre);
        }else if (mediaSemestre == 10){
            System.out.println("Aluno APROVADO e PREMIADO com parabéns do sistema. Parabéns!!");
        } else{
            System.out.println("Digite uma nota válida.");
        }
        
        //9
        System.out.println("Digite um número:");
        int divisivelPor =0;
        double numPrimo = teclado.nextDouble();
        for (int i=0; i<=numPrimo; i++){
            if (numPrimo %i ==0){
                divisivelPor++;
            }
        }
        if(divisivelPor ==2){
                System.out.println("O número "+numPrimo+" é primo.");
            } else {
                System.out.println("O número "+ numPrimo +" não é primo.");
            }
      
        //10
        final int ADIVINHA = 34;
        int contador = 0;
        System.out.println("Adivinhe o número que estou pensando. Digite um número de 0 a 100.");
        int numTeste = teclado.nextInt();
        if (numTeste >0 && numTeste<100){
            do{
                if(numTeste > ADIVINHA){
                    System.out.println("Esse número é MAIOR que o meu...");
                    contador++;
                    numTeste = teclado.nextInt();
                } else if(numTeste < ADIVINHA){
                    System.out.println("Esse número é MENOR que o meu");
                    contador++;
                    numTeste = teclado.nextInt();
                } else if(numTeste == ADIVINHA){
                    System.out.println("Você acertou!!!");
                    contador = contador +10;
                }
            }while(contador<10);
        } else{
            System.out.println("Digite um número maior que 0 ou menor que 100.");
        }
        
        //11
        System.out.println("Por favor, digite núemros positivos para somar e numeros negativos para parar.");
        double numUsado = teclado.nextDouble();
        double somaNumero = 0;
        while(numUsado >0){
            somaNumero = somaNumero + numUsado;
            System.out.println("A soma entre os números é de "+ somaNumero);
            numUsado = teclado.nextDouble();
        }
        System.out.println("O programa foi finalizado");
        */
        //12
        double maior = 0;
        double numPoxa =0;
        for(int i=0; i<10; i++){
            System.out.println("Digite o "+(i+1) +" valor:");
            numPoxa = teclado.nextDouble();
            if(numPoxa > maior){
                maior = numPoxa;
            }
        }
        System.out.println("O maior dos valores é "+maior);
    }
    
}
