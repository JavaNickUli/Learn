package uli.nick.stepik.basic.tasks35.analyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{

    private final int maxLength;
    private final Label label;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
        this.label = Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return label;
        }
        return Label.OK;
    }
}
