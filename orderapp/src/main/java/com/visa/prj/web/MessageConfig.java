package com.visa.prj.web;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

	@Bean
	public MessageSource messageSource()
	{
		ReloadableResourceBundleMessageSource ms  = new ReloadableResourceBundleMessageSource();
		ms.setBasename("message");
		return ms;
	}
}
