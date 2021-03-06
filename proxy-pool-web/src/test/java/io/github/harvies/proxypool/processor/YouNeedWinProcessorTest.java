package io.github.harvies.proxypool.processor;

import io.github.harvies.proxypool.core.processor.YouNeedWinProcessor;
import org.junit.Test;
import us.codecraft.webmagic.Spider;

public class YouNeedWinProcessorTest {

    @Test
    public void process() {
        Spider.create(new YouNeedWinProcessor())
                .addUrl("https://github.com/dxxzst/free-proxy-list/blob/master/README.md")
                .run();
    }
}