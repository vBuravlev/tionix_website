package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/${typeConfig}.properties"
})
public interface ProjectConfig extends Config {

    String browserName();

    String browserVersion();

    String browserSize();

    String remoteDriverUrl();

    String videoStorage();

    int timeoutVideoAttach();

    int timeout();

}