package avena;

import java.util.Arrays;

public class TesteDoSplit {
    public static void main(String[] args){
        String estringDeTeste = "alex&yasminalex&yasminalex&yasminalex&yasminalex&yasminalex&yasminalex&yasminalex&yasmin";
        String[] estringComAResposta = estringDeTeste.split("&");




        System.out.println((estringComAResposta[5]));
        System.out.println(Arrays.toString(estringComAResposta));


    }

}
