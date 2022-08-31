package uli.nick.stepik.basic.tasks35.analyzer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class AnalyzerTest {

    TextAnalyzer[] analyzers = new TextAnalyzer[]{new SpamAnalyzer(new String[]{"spam"}),
            new NegativeTextAnalyzer(), new TooLongTextAnalyzer(35)};
    Analyzer analyzer = new Analyzer();

    @Test
    void checkLabelsSPAM() {
        Label actual = analyzer.checkLabels(analyzers, "It`s no spam!");
        Label expected = Label.SPAM;

        then(actual == expected).isTrue();
    }

    @Test
    void checkLabelsNEGATIVE() {
        Label actual = analyzer.checkLabels(analyzers, "It`s cool!:( but...");
        Label expected = Label.NEGATIVE_TEXT;

        then(actual == expected).isTrue();
    }

    @Test
    void checkLabelsLONG() {
        Label actual = analyzer.checkLabels(analyzers, "It's important, but maybe not that important!");
        Label expected = Label.TOO_LONG;

        then(actual == expected).isTrue();
    }

    @Test
    void checkLabelsOK() {
        Label actual = analyzer.checkLabels(analyzers, "This is the information you need!");
        Label expected = Label.OK;

        then(actual == expected).isTrue();
    }
}
