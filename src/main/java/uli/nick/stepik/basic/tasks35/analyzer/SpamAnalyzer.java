package uli.nick.stepik.basic.tasks35.analyzer;

public class SpamAnalyzer extends KeywordAnalyzer{

    private final String[] keywords;
    private final Label label;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
        this.label = Label.SPAM;
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
