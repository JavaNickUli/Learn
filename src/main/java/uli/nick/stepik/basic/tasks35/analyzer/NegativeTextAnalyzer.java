package uli.nick.stepik.basic.tasks35.analyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;
    private final Label label;

    public NegativeTextAnalyzer() {
        this.keywords = new String[]{":(", "=(", ":|"};
        this.label = Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
