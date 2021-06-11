package org.acme;

import com.ibm.icu.text.MessageFormat;
import io.quarkus.qute.TemplateExtension;


@TemplateExtension(namespace = "icumf")
public class ICUMessageFormatTemplateExtensions {

    static String format(String pattern, Object... params) {
        return MessageFormat.format(pattern, params);
    }
}
