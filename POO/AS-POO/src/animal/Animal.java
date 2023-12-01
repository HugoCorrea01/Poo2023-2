package animal;

public abstract class Animal {
    protected String especie;


    public Animal(String especie){
        this.especie = especie;
    }

    public abstract void andar();

    public abstract void fazerBarulho();



}
