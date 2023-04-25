public class Generator {
    public static AutocompletePrediction generatePrediction() {
        AutocompletePrediction autocompletePrediction = new AutocompletePrediction();
        autocompletePrediction.description = "Has prediction data";

        autocompletePrediction.matchedSubstrings = new AutocompletePrediction.MatchedSubstring[4];
        autocompletePrediction.matchedSubstrings[0] = new AutocompletePrediction.MatchedSubstring(10, 4);
        autocompletePrediction.matchedSubstrings[1] = new AutocompletePrediction.MatchedSubstring(17, 2);
        autocompletePrediction.matchedSubstrings[2] = new AutocompletePrediction.MatchedSubstring(6, 9);
        autocompletePrediction.matchedSubstrings[3] = new AutocompletePrediction.MatchedSubstring(9, 3);
        return autocompletePrediction;
    }

    public static AutocompletePrediction withEmptyArray() {
        AutocompletePrediction autocompletePrediction = new AutocompletePrediction();
        autocompletePrediction.description = "Empty array";
        return autocompletePrediction;
    }
}
