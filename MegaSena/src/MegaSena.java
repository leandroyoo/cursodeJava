import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        int x =0;
        Random generate = new Random();


         //estrutura enquanto
            // equnato a expressão for verdadeira esse bloco interno será executado
        int i = 0;
        while(i < 6 ){
            int number = generate.nextInt(60);
            System.out.println(number);

            //contador o ++ serve pra ir somando mais um para essa variável o -- subtrai
            i++;
         }

        


  /*
        //agora fazendo com o a estrutura for temos primeiro a variavel de controle e depois a condição
     for(int i = 0; i < 6;  ){
         int number = generate.nextInt(60);
         System.out.println(number);
         i++;
     }
*/




    }
}