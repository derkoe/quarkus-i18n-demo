package org.acme;

import io.quarkus.qute.TemplateExtension;
import io.quarkus.qute.TemplateExtension.TemplateAttribute;

import java.util.Locale;
import java.util.ResourceBundle;

import static io.quarkus.qute.TemplateExtension.ANY;

@TemplateExtension(namespace = "i18n")
public class I18nTemplateExtensions {

    @TemplateExtension(namespace = "i18n", matchName = ANY, matchRegex = ".*")
    static String message(String key, @TemplateAttribute("locale") Object localeAttr) {
        Locale locale = localeAttr instanceof Locale ? (Locale) localeAttr : Locale.getDefault();
        return ResourceBundle.getBundle("messages", locale).getString(key);
    }
}
