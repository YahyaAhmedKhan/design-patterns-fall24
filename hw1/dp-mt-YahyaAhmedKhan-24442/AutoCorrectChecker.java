public class AutoCorrectChecker extends DecoratedText {

    AutoCorrectChecker(Text t) {
        text = t;
        correctionFunc();
    }

    @Override
    void correctionFunc() {

        String s = this.text.stringToCorrect;
        this.stringToCorrect = s.replaceFirst("recieve", "receive");
    }

}
