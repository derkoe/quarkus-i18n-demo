package org.acme;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import org.jboss.resteasy.util.LocaleHelper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Locale;

@Path("/")
public class GreetingResource {

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance hello(String name, Integer age);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance hello(@QueryParam("lang") String lang) {
        Locale locale = lang != null ? LocaleHelper.extractLocale(lang) : Locale.ENGLISH;
        return Templates.hello("Quarkus", 2).setAttribute("locale", locale);
    }
}
