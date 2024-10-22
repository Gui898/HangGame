import java.util.*;

public class Ex106 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdError = 0;

        String word = "MERCADO";
        char[] wordInChar = new char[word.length()];
        char[] mistery = new char[word.length()];

        for(int i = 0; i < wordInChar.length; i++) {
            wordInChar[i] = word.charAt(i);
        }

        Arrays.fill(mistery, '_');
        System.out.println("A palvra tem " + word.length() + " letras!");
        for(char a : mistery) {
            System.out.print(a + " ");
        }

        while(qtdError < 6) {

            System.out.println();
            System.out.println("Digite uma letra");
            char ans = scan.next().charAt(0);
            boolean value = false;
            for(int i = 0; i < wordInChar.length; i++) {
                if(ans == wordInChar[i]) {
                    mistery[i] = wordInChar[i];
                    value = true;
                }
            }

            if(!value) {
                qtdError++;

                switch (qtdError){
                    case 1: System.out.println(" ___   ");
                            System.out.println("/   \\ ");
                            System.out.println("\\___/ ");
                        break;
                    case 2: System.out.println(" ___  ");
                            System.out.println("/   \\");
                            System.out.println("\\___/");
                            System.out.println("  ||  ");
                            System.out.println("  ||  ");
                            System.out.println("  ||  ");
                        break;
                    case 3: System.out.println(" ___  ");
                            System.out.println("/   \\");
                            System.out.println("\\___/");
                            System.out.println(" /||  ");
                            System.out.println("/ ||  ");
                            System.out.println("  ||  ");
                        break;
                    case 4: System.out.println(" ___   ");
                            System.out.println("/   \\ ");
                            System.out.println("\\___/ ");
                            System.out.println(" /||\\ ");
                            System.out.println("/ || \\");
                            System.out.println("  ||   ");
                        break;
                    case 5: System.out.println(" ___   ");
                            System.out.println("/   \\ ");
                            System.out.println("\\___/ ");
                            System.out.println(" /||\\ ");
                            System.out.println("/ || \\");
                            System.out.println("  ||   ");
                            System.out.println(" /     ");
                            System.out.println("/      ");
                        break;
                    case 6: System.out.println(" ___   ");
                            System.out.println("/   \\ ");
                            System.out.println("\\___/ ");
                            System.out.println(" /||\\ ");
                            System.out.println("/ || \\");
                            System.out.println("  ||   ");
                            System.out.println(" /  \\ ");
                            System.out.println("/    \\");
                        break;
                    default:
                        break;
                }

            }else {
                for(char a : mistery) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            if(Arrays.equals(mistery, wordInChar)) {
                System.out.println("VOCÊ VENCEUU!!!");
                break;

            }
            if(qtdError == 6) {
                System.out.println("VOCÊ PERDEU!!!");
                System.out.println("A palavra era " + word);
                break;
            }
        }

        scan.close();
    }
}
