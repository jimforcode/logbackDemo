package logbak.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tea {

	static Logger logger = LoggerFactory.getLogger(Tea.class);

	public void say() {

		for (int i = 0; i < 10000000; i++) {
			if (i % 10000 == 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			logger.debug("##########################################");
			logger.error("##########################################");
			logger.info("##########################################");
			logger.trace("##########################################");

		}
	}

}
