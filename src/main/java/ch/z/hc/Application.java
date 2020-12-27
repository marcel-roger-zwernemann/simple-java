package ch.z.hc;

import ch.z.hc.util.Parser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {

        Parser parser = new Parser();
        parser.parse();
        log.info("End");
    }
}
