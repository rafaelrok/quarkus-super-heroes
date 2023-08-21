package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ConfigUtils;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

/**
 * Demonstrates how to use Quarkus {@link StartupEvent}s and {@link ShutdownEvent}s as well as how to gain access to the {@link ConfigUtils}.
 */
@ApplicationScoped
public class VillainApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("   __     __  __  __  __            __                   ______   _______   ______");
        LOGGER.info("  /  |   /  |/  |/  |/  |          /  |                 /      \\ /       \\ /      |");
        LOGGER.info("  $$ |   $$ |$$/ $$ |$$ |  ______  $$/  _______        /$$$$$$  |$$$$$$$  |$$$$$$/");
        LOGGER.info("  $$ |   $$ |/  |$$ |$$ | /      \\ /  |/       \\       $$ |__$$ |$$ |__$$ |  $$ |");
        LOGGER.info("  $$  \\ /$$/ $$ |$$ |$$ | $$$$$$  |$$ |$$$$$$$  |      $$    $$ |$$    $$/   $$ |");
        LOGGER.info("   $$  /$$/  $$ |$$ |$$ | /    $$ |$$ |$$ |  $$ |      $$$$$$$$ |$$$$$$$/    $$ |");
        LOGGER.info("    $$ $$/   $$ |$$ |$$ |/$$$$$$$ |$$ |$$ |  $$ |      $$ |  $$ |$$ |       _$$ |_");
        LOGGER.info("     $$$/    $$ |$$ |$$ |$$    $$ |$$ |$$ |  $$ |      $$ |  $$ |$$ |      / $$   |");
        LOGGER.info("      $/     $$/ $$/ $$/  $$$$$$$/ $$/ $$/   $$/       $$/   $$/ $$/       $$$$$$/");
        LOGGER.info("");
        LOGGER.info("");
        LOGGER.info("The application VILLAIN is starting with profile " + ConfigUtils.getProfiles());
        LOGGER.info("");
        LOGGER.info("");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
