package in.workingtheory.playground.kafka.simple;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer
{
	private static final Logger logger = LogManager.getLogger(Producer.class);

	private final Properties properties;

	@Autowired
	public Producer(final Properties producerProperties)
	{
		this.properties = producerProperties;
	}
}
