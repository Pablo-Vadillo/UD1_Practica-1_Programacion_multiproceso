package net.salesianos.lacuesta.processes;

public class VowelCounter {
    public static void main(String[] args) {
        String text = args[0];
        String vowel = args[1];
        int nCoincidencias = 0;

        for (int i = 0; i < text.length(); i++) {

            String caracterComparar = String.valueOf(text.charAt(i));

            if(caracterComparar.equals(vowel)){
                nCoincidencias++;
            }
        }
        System.out.println(nCoincidencias);
    }
}

