package animal;

public class Gato extends Animal {
    String nome;


public Gato (String nome){
    this.nome = nome;
}



    @Override
    public void andar() {

        System.out.println("andou");
    }

    @Override
    public void fazerBarulho() {

        System.out.println("fez barulho");
    }


}
