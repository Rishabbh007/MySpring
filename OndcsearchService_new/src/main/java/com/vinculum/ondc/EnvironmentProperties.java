package com.vinculum.ondc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.ContextFactory;

@Service
@ConfigurationProperties(prefix = "ondc")

public class EnvironmentProperties {
	
	private String accessKey;
    private String secretKey;
    private String env;
    private String web;
    private String schedule;
    private String logbackConfigurationFile;
    
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getLogbackConfigurationFile() {
		return logbackConfigurationFile;
	}
	public void setLogbackConfigurationFile(String logbackConfigurationFile) {
		this.logbackConfigurationFile = logbackConfigurationFile;
	}
	
	@Bean
    public ContextFactory contextFactoryBean() {
        return new ContextFactory();
    }
    
}
