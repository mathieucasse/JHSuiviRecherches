package ch.matfly.suivirecherches.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Suivi Recherches.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
@EnableEncryptableProperties
public class ApplicationProperties {
}
