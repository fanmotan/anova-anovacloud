
package com.anova.anovacloud.client.gin;

import com.google.gwt.inject.client.Ginjector;
import com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor;

/**
 * Methods defined here will be added to the generated Ginjector. While using GinUiBinder, you must define each
 * classes that is used inside a .ui.xml that use injection.
 */
public interface MyGinjector extends Ginjector {
    MatterPropertiesEditor getPropertiesEditor();
}
