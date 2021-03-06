/**
 * 
 */
package com.starquest.usermgmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author mallesh
 * @since Mar/2017
 * @version 1.0
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	public void configurePathMatch(PathMatchConfigurer configurer){
		configurer.setUseSuffixPatternMatch(false);
	}
	
}
