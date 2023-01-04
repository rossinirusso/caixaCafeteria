package Cafes;
import java.util.Scanner;

public class Principal {
    
   public static void main(String args[]){

   double precosCafe[] = new double[3];
   double precosComps[] = new double[3];
   String nomeCafe = new String();

   precosCafe[0] = 7.5;
   precosCafe[1] = 4.3;
   precosCafe[2] = 10.0;
   
   double precoComp = 0; 
   precosComps[0] = 5.0;
   precosComps[1] = 8.0;
   precosComps[2] = 2.0;
   



   Scanner entrada = new Scanner(System.in);

   System.out.println("Digite o código do tipo do café (0: Americano/1: Expresso/2: Sem Cafeína)");
   int tipo = entrada.nextInt();

   if(tipo ==0){
      nomeCafe = "Americano";
   }
   
   else if(tipo==1){
      nomeCafe="Expresso";

   }

   else if(tipo==2){
      nomeCafe = "Sem cafeína";

   }
   
   System.out.println("Deseja adicionar algum complemento? (0: não ou 1: sim)");
   int comp = entrada.nextInt();
   
   Cafe c = new Cafe(nomeCafe);

   

   while (comp==1){
    System.out.println("Insira o código do 1º complemento desejado (0: leite, 1: chocolate, 2: canela)");
    c.adicionarComplementos(entrada.nextInt()); 
    System.out.println("Deseja adicionar mais algum complemento? (0: não ou 1: sim)");
    comp = entrada.nextInt();
    
    


   }
    

   System.out.println("############### NOTA FISCAL ###############");
   System.out.println(c.getCafe());
   System.out.printf("Preço do café: %f\n ",precosCafe[tipo]);
   
   
   int tamanho = c.getQuantidadecomple();
   



   for(int i=0;i<c.getQuantidadecomple();i++){
     
   precoComp = precoComp+ precosComps[c.complementos(i)];
   }

   System.out.printf("Preço dos complementos: %f\n ",precoComp);

   double total = precoComp+precosCafe[tipo];

   System.out.printf("Total: %f\n",total);

    



   


}
}