package com.anil.jenkins_deploy_ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDeployEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDeployEc2Application.class, args);
		System.out.println("Boot Started...");
	}

}
