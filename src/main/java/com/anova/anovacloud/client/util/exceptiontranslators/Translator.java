

package com.anova.anovacloud.client.util.exceptiontranslators;

public interface Translator {
    Boolean isMatching();

    String getTranslatedMessage();
}
