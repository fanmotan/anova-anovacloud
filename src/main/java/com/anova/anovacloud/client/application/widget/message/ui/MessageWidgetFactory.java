
package com.anova.anovacloud.client.application.widget.message.ui;

import com.anova.anovacloud.client.application.widget.message.Message;

public interface MessageWidgetFactory {
    public MessageWidget createMessage(Message message);
}
