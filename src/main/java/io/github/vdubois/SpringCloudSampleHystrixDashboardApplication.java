package io.github.vdubois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
public class SpringCloudSampleHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSampleHystrixDashboardApplication.class, args);
	}
}
