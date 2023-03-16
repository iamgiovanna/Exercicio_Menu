import javax.swing.JOptionPane;
public class Menu {

  
    public static void main(String[]agrs){

        int num; //variavel que eu peço pro usuário digitar

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número das seguintes opções \n 1 - SOMA \n 2 - SUBTRAÇÃO \n 3 - DIVISÃO \n 4 - MULTIPLICAÇÃO \n 5 - Resto Divisão \n 6 - DOBRO \n 7 - QUADRADO \n 8 - CUBO \n 9 - RAÌZ QUADRADA \n 0 - SAIR"));

        //criação de um switch case para resolver as operações indicadas pelo usuário
    
        switch(num){
            case 1:
            //soma de valores segundo o menu
            int val1 = 0, val2 = 0, soma = 0;

            val1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da soma:: "));
            val2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da soma:: "));
        
            //criando a variável e o método para a operação
            
            CalcularSoma( val1, val2);
            break; //final do primeiro switch
            
            //segundo case subtração

            case 2:
            //variáveis que irão operar na subtração
            int val1sub = 0,val2sub =0, subtracao = 0;

            val1sub = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da subtração:: "));
            val2sub = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da subtração:: "));
            //criando uma variável o método para a segundo operação do switch
             CalcularSubtracao(val1sub,val2sub);
            break; //final do segundo switch

            case 3:
            //divisão de valores

            int valdiv1 = 0, valdiv2 = 0, divisao = 0;

            valdiv1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da divisão:: "));
            valdiv2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da divisão:: "));
            
            CalcularDivisao(valdiv1,valdiv2);

            break; //final case3

            case 4:
            //recebendo números para multiplicação
            int valmult1 = 0, valmult2 = 0, multiplicação = 0;

            valmult1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da multiplicação:: "));
            valmult2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da multiplicação:: "));
        
            CalcularMultiplicacao(valmult1,valmult2);
            break;

            case 5 :
            //recebendo os valores para o resto da divisão %

            int div1 = 0,div2 = 0, restodiv =0; 

            div1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número da divisão:: "));
            div2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número da divisão:: "));
        
              CalculaRestoDivisao(div1,div2);

            break;

            case 6:

            //calcula o dobro do valor

            int valorqualquer = 0, dobro =0;

            valorqualquer = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o dobro:: "));

              CalcularDobro(valorqualquer);
            break;

            case 7:
            //calculando o quadrado

            int quadrado=0,resultadoquadrado =0;

            quadrado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular seu quadrado:: "));

            CalculaQuadrado(quadrado);
            break;

            case 8:
            //calculando o cubo

            int numcubo = 0,  cubo = 0;

            numcubo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular seu cubo "));

            CalculaCubo(numcubo);
            break;

            case 9:
            //calculo de raíz quadrada

            int raiz = 0, raizquadrada = 0;

            raiz = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular a raíz::"));

            Calcularaiz(raiz);
            break;

            default:
            //sair

            JOptionPane.showMessageDialog(null, " Operação inválida! Tente novamente mais tarde");
            
            break; 
        } //fecha o switch
    } //fecha o main
    
    static void CalcularSoma(int v1,int v2){
        //método do primeiro case 
        double soma = v1 + v2;
        
        JOptionPane.showMessageDialog(null," O valor da soma é " +soma);
    }

    static void  CalcularSubtracao(int vs1, int vs2){
        //método do segundo case
        double subtracao = vs1 - vs2;
        
        JOptionPane.showMessageDialog(null," O valor da subtração é " +subtracao);
    }

    static void  CalcularDivisao(int vdiv1, int vdiv2){
            //método do terceiro case
     double divisao = vdiv1/vdiv2;

      JOptionPane.showMessageDialog(null," O valor da divisão é " +divisao);
    }

    static void  CalcularMultiplicacao(int vmult1, int vmult2){
        //método quarto case

        double multiplicacao = vmult1 * vmult2;

        JOptionPane.showMessageDialog(null," O valor da multiplicação é " +multiplicação);

    }

    static void CalculaRestoDivisao(int dv1, int dv2){
      //case n°5
      double restodiv = (dv1/dv2)%2;
        JOptionPane.showMessageDialog(null," O valor do resto da divisão é " +restodiv);

    }

    static void  CalcularDobro(int valqualquer){
        //case n°6
        double dobro = valqualquer*2;

          JOptionPane.showMessageDialog(null," O dobro desse número é " +valqualquer);
    }

    static void CalculaQuadrado(int qua){
        //case n°7
        double resultadoquadrado = qua*qua;

        JOptionPane.showMessageDialog(null," O quadrado desse número é " +resultadoquadrado);
    }

    static void CalculaCubo(int ncubo){
        //case n°8
        double cubo = ncubo*ncubo*ncubo;

       JOptionPane.showMessageDialog(null," O cubo desse número é " +cubo);
     
    }

    static void  Calcularaiz(int raizes){
        //case 0
        double raizquadrada = Math.sqrt(raizes);

         JOptionPane.showMessageDialog(null," A raíz quadrada número é " +raizquadrada);
    }
}

