public class Matriz
{
    public static void main(String[] args) {
       String [][] matriz = new String [3][2];
       //atribuição de valores para a matriz
       matriz[0][0]="João";
       matriz[0][1]="Rua das Flores, 123";
       matriz[1][0]="Maria";
       matriz[1][1]="Avenida dos Anjos, 456";
       matriz[2][0]="Pedro";
       matriz[2][1]="Praça da Liberdade, 789";
      
      //impressão da matriz
      for (int i = 0; i < 3; i++){
          
             System.out.println("nome: "+ matriz[i][0]);
             System.out.println("Endereço: "+ matriz[i][1]);
             System.out.println();
      }
    } 
}
    
         
      
    
