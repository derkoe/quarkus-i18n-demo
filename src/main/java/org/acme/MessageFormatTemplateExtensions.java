package org.acme;

import io.quarkus.qute.TemplateExtension;

import java.text.MessageFormat;

@TemplateExtension(namespace = "mf")
public class MessageFormatTemplateExtensions {

    static String format(String pattern, String... params) {
        return MessageFormat.format(pattern, (Object[]) params);
    }
}
