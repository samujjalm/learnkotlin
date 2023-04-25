import java.util.Arrays;

public class AutocompletePrediction {

    public String description;
    public static class MatchedSubstring {
        public int length;
        public int offset;

        public MatchedSubstring() {
        }

        public MatchedSubstring(int length, int offset) {
            this.length = length;
            this.offset = offset;
        }

        @Override
        public String toString() {
            return "MatchedSubstring{" +
                    "length=" + length +
                    ", offset=" + offset +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AutocompletePrediction{" +
                "description='" + description + '\'' +
                ", matchedSubstrings=" + Arrays.toString(matchedSubstrings) +
                '}';
    }

    public MatchedSubstring matchedSubstrings[];
}
