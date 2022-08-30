package uli.nick.stepik.basic.tasks35.analyzer;

public class Analyzer {
    public static void main(String[] args) {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"spam"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        TooLongTextAnalyzer longTextAnalyzer = new TooLongTextAnalyzer(7);
        TextAnalyzer[] analyzers = new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer, longTextAnalyzer};
        System.out.println(checkLabels(analyzers, "spam ="));       //должен выдать SPAM
        System.out.println(checkLabels(analyzers, "pam =("));       //должен выдать NEGATIVE_TEXT
        System.out.println(checkLabels(analyzers, "pam =48354"));   //должен выдать TOO_LONG
        System.out.println(checkLabels(analyzers, "48354"));       // должен выдать OK
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            Label returnLabel = textAnalyzer.processText(text);
            if (!returnLabel.equals(Label.OK)) {
                return returnLabel;
            }
        }
        return Label.OK;
    }
}
