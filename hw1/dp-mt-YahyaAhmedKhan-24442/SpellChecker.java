public class SpellChecker extends DecoratedText {

    SpellChecker(Text t) {
        text = t;
        correctionFunc();
    }

    void correctionFunc() {
        String s = this.text.stringToCorrect;

        this.stringToCorrect = s.replaceFirst("teh", "the");
    }

}