package config;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration
{
	private static final Logger logger = LogManager.getLogger(KafkaConfiguration.class);

	@Bean
	public Properties consumerProperties()
	{
		return new Properties();
	}

	@Bean
	public Properties producerProperties()
	{
		return new Properties();
	}

}
