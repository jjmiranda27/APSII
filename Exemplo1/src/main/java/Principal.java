public class Principal {

    public static void main(String[] args){

        Banco b3 = new Banco ("Hugo", "0011", 24);


        System.out.println(b3.getNome()); //mostrar
        b3.setNome("Aquiles"); // atualizar
        System.out.println(b3.getNome()); // mostrar valor atualizado

    }
}
