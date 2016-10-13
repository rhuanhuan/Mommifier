package mommy;

public class Mommifier {

    public String mommify(String input) {
        String result = "";
        result = getMommifiedString(input, result);
        return result;
    }

    private String getMommifiedString(String input, String result) {
        if (!containsGreaterThanThirtyPercentVowels(input)) {
            return input;
        }
        return transformString(input, result);
    }

    private String transformString(String input, String result) {
        int inputLength=input.length();
        for (int i = 0; i < inputLength; i++) {
            if (isAVowel(String.valueOf(input.charAt(i))) && !result.endsWith("mommy")) {
                result += "mommy";
                continue;
            }
            if (isAVowel(String.valueOf(input.charAt(i))) && result.endsWith("mommy")) {
                continue;
            }
            result += input.charAt(i);
        }
        return result;
    }

    private boolean containsGreaterThanThirtyPercentVowels(String input) {
        int result = getCountOfVowels(input);
        double percentage = (double) result / input.length();
        return percentage >= 0.30;
    }

    private int getCountOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isAVowel(String.valueOf(input.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    private boolean isAVowel(String input) {
        return input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
    }


}
