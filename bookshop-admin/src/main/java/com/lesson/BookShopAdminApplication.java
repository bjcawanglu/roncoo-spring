/**
 * 
 */
package com.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhailiang
 *
 */
@SpringBootApplication
@EnableSwagger2
public class BookShopAdminApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookShopAdminApplication.class, args);
	}

}
