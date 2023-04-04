public class ClasseString {

        public static void main(String[] args) {
            String minhaString = "Classe String";

            // Usando o método length()
            int comprimentoString = minhaString.length();
            System.out.println("O comprimento da String é: " + comprimentoString);

            // Usando o método charAt()
            char primeiroCaractere = minhaString.charAt(0);
            System.out.println("O primeiro caractere da String é: " + primeiroCaractere);

            // Usando o método substring()
            String subString = minhaString.substring(7, 12);
            System.out.println("A subcadeia da String é: " + subString);

            // Usando o método indexOf()
            int indice = minhaString.indexOf('s');
            System.out.println("O índice da primeira ocorrência de 's' é: " + indice);

            // Usando o método equals()
            String outraString = "Hello, world!";
            boolean saoIguais = minhaString.equals(outraString);
            System.out.println("As Strings são iguais? " + saoIguais);

            // Usando o método toUpperCase()
            String maiusculas = minhaString.toUpperCase();
            System.out.println("A String em maiúsculas é: " + maiusculas);

            // Usando o método toLowerCase()
            String minusculas = minhaString.toLowerCase();
            System.out.println("A String em minúsculas é: " + minusculas);

            // Usando o método trim()
            String comEspacos = "   Olá   ";
            String semEspacos = comEspacos.trim();
            System.out.println("A String sem espaços em branco é: " + semEspacos);
        }
    }


