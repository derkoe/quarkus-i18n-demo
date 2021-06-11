package org.acme;

import io.quarkus.qute.TemplateExtension;

import java.text.MessageFormat;

@TemplateExtension(namespace = "mf")
public class MessageFormatTemplateExtensions {

    static String format(String pattern, Object... params) {
        return MessageFormat.format(pattern, params);
    }
}
