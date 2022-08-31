package uli.nick.stepik.basic.tasks35.analyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords  = new String[]{":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
