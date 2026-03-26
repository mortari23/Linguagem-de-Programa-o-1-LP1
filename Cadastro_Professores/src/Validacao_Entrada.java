/* Crie a classe que cadastre una quantidade indeterminada de candidatos, validande cada entrada de dados,
 ou seja, nome não pode ter menos de 3 caracteres, idade não pode ser menor de 18,
tempo de experiência não pode ser menor Que zero, e área deve ser entre 1 3.
 */

public class Validacao_Entrada {
    public static boolean ValidarNome(String nome){
        if(nome.length() < 3){
            return false;
        }
        return true;       
    }

    public static boolean Validar_Idade(int idade){
        if (idade < 18) {
            return false;
        }
        return true;
    }

    public static boolean Validar_Experiencia(int tempo_experiencia){
        if (tempo_experiencia < 0) {
            return false;
        }
        return true;
    }

    public static boolean Validar_Area(int area){
        if (area < 1 || area > 3) {
            return false;
        }
        return true;
    }
}