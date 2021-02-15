package in.workingtheory.playground.kafka.simple;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer
{
	private static final Logger logger = LogManager.getLogger(Consumer.class);

	private final Properties properties;

	@Autowired
	public Consumer(final Properties consumerProperties)
	{
		this.properties = consumerProperties;
	}
}
