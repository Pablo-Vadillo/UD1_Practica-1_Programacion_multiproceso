import java.util.ArrayList;
import net.salesianos.lacuesta.launcher.VowelLauncher;
import net.salesianos.lacuesta.utils.Utils;
public class App {
    private static final String[] VOWELS = {"a", "e", "i", "o", "u"};
    private static final String FILE_PATH = "src\\lorem_ipsum.txt";

    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = Utils.getAllTextLineCounter(FILE_PATH);
        ArrayList<Process> allProcesses = initiateProcessesForLines(lines);
        waitForAllProcesses(allProcesses);
        displayAndCleanupVowelCounts();
    }

    private static ArrayList<Process> initiateProcessesForLines(ArrayList<String> lines) {
        ArrayList<Process> allProcesses = new ArrayList<>();
        for (String line : lines) {
            for (String vowel : VOWELS) {
                String outputFileName = vowel + "_output.txt";
                Process javaProcess = VowelLauncher.initVowelCounter(line, vowel, outputFileName);
                allProcesses.add(javaProcess);
            }
        }
        return allProcesses;
    }

    private static void waitForAllProcesses(ArrayList<Process> allProcesses) {
        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayAndCleanupVowelCounts() {
        int totalVowels = 0;
        int[] vowelCounts = new int[VOWELS.length];

        for (int i = 0; i < VOWELS.length; i++) {
            String outputFileName = VOWELS[i] + "_output.txt";
            String outputFileRoute = "src/net/salesianos/lacuesta/outputs/" + outputFileName;
            int vowelsFromFile = Utils.getTotalVowelsFrom(outputFileRoute);
            totalVowels += vowelsFromFile;
            vowelCounts[i] += vowelsFromFile;

            System.out.println("El fichero " + outputFileName + " tiene " + vowelsFromFile);

        }

        System.out.println("El fichero tiene " + totalVowels + " vocales en total");
    }
}