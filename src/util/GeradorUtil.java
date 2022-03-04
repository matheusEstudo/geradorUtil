package util;

public class GeradorUtil {

//Crie um método que receba por parâmetro a quantidade de numeros para 
//gerar aleatória de 0 à 9 e retorne esses números em tipo String.
    public static String gerarNumero(int quantidade) {
        String numero = "";
        for (int i = 0; i < quantidade; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

// criar um método que devolva um valor de CNPJ 99.999.999/9999-99 
    public static String gerarFormatarCnpj() {
        String cnpj = gerarNumero(14);

        return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "."
                + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-"
                + cnpj.substring(12);
    }

//Criar um método que retorne um cpf qualquer (não validado) cpf 999.999.999-99 
    public static String gerarFormatarCpf() {
        String cpf = gerarNumero(11);

        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
                + cpf.substring(6, 9) + "-" + cpf.substring(9);

    }

//Criar um metodo que solicite a quantidade de digitos para senha alfanumérica 
//e devolva a senha em tipo String
    public static String gerarSenha(int quantidade) {
        String[] altaNumerico = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
            "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String senha = "";

        for (int i = 0; i < quantidade; i++) {
            senha += altaNumerico[(int) (Math.random() * altaNumerico.length)];
        }
        return senha;
    }
    
//criar um método que devolva um valor telefone fixo. Começar com (48)3XXX-XXXX
    public static String gerarTelefone(){
        String numero = "483";
        return numero;
    }

    public static void main(String[] args) {
        System.out.println(gerarSenha(8));
    }

}
