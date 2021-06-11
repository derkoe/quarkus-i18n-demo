package org.acme;

import com.ibm.icu.text.MessageFormat;
import io.quarkus.qute.TemplateExtension;


@TemplateExtension(namespace = "icumf")
public class ICUMessageFormatTemplateExtensions {

    static String format(String pattern, String... params) {
        return MessageFormat.format(pattern, (Object[]) params);
    }

    static String format(String pattern, String param1, Integer param2) {
        return MessageFormat.format(pattern, param1, param2);
    }
}
