import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void main(String[] args){

//        Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas

        String senha = "Senha maluca";
        String senhaCriptografada = "";

        senha = senha.replace(" ","");
        int raizQuadrada = (int) Math.ceil(Math.sqrt(senha.length()));

        List<String> criptografador = new ArrayList<>();

        for (int i = 0; i <= senha.length(); i+= raizQuadrada){
            if (i+raizQuadrada > senha.length()){
                criptografador.add(senha.substring(i, i+(senha.length()) - i));
            }
            else {
                criptografador.add(senha.substring(i, i+raizQuadrada));
            }
        }

        for (int j = 0; j < criptografador.size(); j++){
            for (int z = 0; z < raizQuadrada; z++){
                if (criptografador.get(z).length() > j){
                    senhaCriptografada += criptografador.get(z).toCharArray()[j];
                }
            }
        }

        System.out.println(senhaCriptografada);
    }
}




