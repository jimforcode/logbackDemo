package logbak.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logbak.logger.Tea;

public class App {
	static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws InterruptedException {
		// for (int i = 0; i < 10000000; i++) {
		// if (i % 10000 == 0) {
		// Thread.sleep(500);
		// }
		// logger.debug("#############################################");
		// logger.error("#############################################");
		// logger.info("#############################################");
		// logger.trace("#############################################");
		//
		// }
		
		
		Tea t = new Tea();
		t.say();

	}
}
