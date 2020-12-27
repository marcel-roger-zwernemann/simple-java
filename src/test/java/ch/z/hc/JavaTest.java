package ch.z.hc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class JavaTest {

    @Test
    public void newFeatures() {
        var test = """
                This is a text
                block wonderful
                in JDK15
                """;

        log.info("{}", test);
    }
}
