package aulas.oo.part3.encapsulamento;


public class Exemplo001 {


    public static void main(String args[]){


        Pessoa PesssoaProgramador = new Pessoa("Felipe", 16,6,1993);

        System.out.println("O nome é: "+PesssoaProgramador.GetNome());
        System.out.println("A idade é de: "+PesssoaProgramador.calculaIdade());
        System.out.println("A data de nascimento foi em: "+PesssoaProgramador.getDataNascimento());






    }



}
