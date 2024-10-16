public class GrammarChecker extends DecoratedText {

    GrammarChecker(Text t) {
        text = t;
        correctionFunc();
    }

    void correctionFunc() {

        String s = this.text.stringToCorrect;
        this.stringToCorrect = s.replaceFirst("I is", "I am");
    }
}
