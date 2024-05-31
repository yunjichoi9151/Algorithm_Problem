import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String TC = br.readLine();
        while(!TC.equals("end")) {
            boolean isPossible = true;
            if(!TC.matches(".*[aeiou].*")) {
                isPossible = false;
            } else {
                for(int i = 0; i < TC.length() - 1; i++) {
                    if(TC.charAt(i) == TC.charAt(i + 1)
                    && (TC.charAt(i) != 'e' && TC.charAt(i) != 'o')) {
                        isPossible = false;
                        break;
                    }
                }
                if(isPossible) {
                    for(int i = 0; i < TC.length() - 2; i++) {
                        if(((TC.charAt(i) + "").matches(".*[aeiou].*")
                        && (TC.charAt(i + 1) + "").matches(".*[aeiou].*")
                        && (TC.charAt(i + 2) + "").matches(".*[aeiou].*"))
                        || (!(TC.charAt(i) + "").matches(".*[aeiou].*")
                        && !(TC.charAt(i + 1) + "").matches(".*[aeiou].*")
                        && !(TC.charAt(i + 2) + "").matches(".*[aeiou].*"))) {
                            isPossible = false;
                            break;
                        }
                    }
                }
            }
            sb.append("<" + TC + "> is " + (isPossible ? "" : "not ") + "acceptable.\n");
            TC = br.readLine();
        }
        System.out.println(sb.toString().trim());
    }
}