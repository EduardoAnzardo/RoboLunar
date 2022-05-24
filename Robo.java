import java.util.Scanner;

public class Robo{

    Scanner robo = new Scanner(System.in);
  
    int Bateria;
    int Passos;
    int Foto;

    int Status(){
        System.out.println("Status do Robo");
        System.out.println("Bateria do Robo: " +this.Bateria+ "%");
        System.out.println("Numero de Passos: " +this.Passos);
        System.out.println("Numero de Fotos: " +this.Foto);
        System.out.println("=======");
      
    if (Bateria > 0){
      System.out.println("Deseja caminhar para frente ou para tras? Se frente, digite 1, se deseja ir para trás, digite 2");
      int Caminhar = robo.nextInt();
      System.out.println("=======");
      System.out.println("Selecione um angulo em que deseja girar o robo");
      int angulo = robo.nextInt();
      System.out.println("=======");

      if (Caminhar == 1){
        System.out.println("O robô deu um passo para frente em um angulo de " +angulo+ " graus" );
        System.out.println("O numero de passos do robo subiu para: " + ++Passos);
        Bateria = (Bateria+ - 10);
        System.out.println("A bateria total do robô diminuiu para: " +Bateria+ " %");
        System.out.println("=======");
        System.out.println("Deseja tirar uma foto do local? Se sim, digite 1, se não, digite 2");
        int fotografar = robo.nextInt();
          if (fotografar == 1){
            System.out.println("O robô tirou uma foto do local");
            System.out.println("O total de fotos subiu para: " + ++Foto);
            System.out.println("=======");
          }
        else
          if (fotografar == 2){
            System.out.println("O robô não tirou uma foto do local");
            System.out.println("=======");
          }       
          if (Bateria < 10){
        System.out.println("A Bateria do Robô está quase esgotada, então o sistema será finalizado");
      }
    }
            
      if (Caminhar == 2){
        System.out.println("O robô deu um passo para trás em um angulo de " +angulo+ " graus" );
        System.out.println("O numero de passos do robo subiu para: " + ++Passos);
        Bateria = (Bateria+ - 10);
        System.out.println("A bateria total do robô diminuiu para: " +Bateria+ " %");
        System.out.println("=======");
        System.out.println("Deseja tirar uma foto do local? Se sim, digite 1, se não, digite 2");
        int fotografar = robo.nextInt();
          if (fotografar == 1){
            System.out.println("O robô tirou uma foto do local");
            System.out.println("O total de fotos subiu para: " + ++Foto);
            System.out.println("=======");
          }
        else
          if (fotografar == 2){
            System.out.println("O robô não tirou uma foto do local");
            System.out.println("=======");
          }       

        }
      }
      else 
      if (Bateria <= 0){
        System.out.println("A Bateria do Robô está esgotada, então o sistema será finalizado");
        System.exit(0);
    }

    return Status();
      }
}
