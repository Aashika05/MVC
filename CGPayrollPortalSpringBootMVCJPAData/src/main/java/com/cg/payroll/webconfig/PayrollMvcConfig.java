package com.cg.payroll.webconfig;

import javax.validation.Validator;

import org.apache.logging.log4j.message.Message;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class PayrollMvcConfig implements WebMvcConfigurer {
	
	
	@Override
	public org.springframework.validation.Validator getValidator() {
		return new LocalValidatorFactoryBean();
	}
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver ref=new InternalResourceViewResolver();
		ref.setPrefix("/Views/");
		ref.setSuffix(".jsp");
		return ref;
	}
	@Bean
	public MessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classPath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		System.out.println(messageSource.getBasenameSet());
		return messageSource;
	}

}
