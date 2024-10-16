public class Client {
    public static void main(String[] args) {

        Text t = new Text();
        t.stringToCorrect = "I is trying to recieve teh results";
        System.out.println(t.stringToCorrect);
        DecoratedText ct = new SpellChecker(t);
        System.out.println(ct.text.stringToCorrect);
        ct = new GrammarChecker(ct);
        System.out.println(ct.text.stringToCorrect);

        ct = new AutoCorrectChecker(ct);
        System.err.println(ct.text.stringToCorrect);
        System.out.println(ct.text.stringToCorrect);

    }
}
