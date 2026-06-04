package com.indivaragroup.jdt17.spring.basic;

import com.indivaragroup.jdt17.spring.basic.configuration.*;
import com.indivaragroup.jdt17.spring.basic.dependency.injection.HelloWorldInjection;
import com.indivaragroup.jdt17.spring.basic.dependency.injection.HelloWorldWithInjection;
import com.indivaragroup.jdt17.spring.basic.dependency.injection.dto.HelloInjection;
import com.indivaragroup.jdt17.spring.basic.dependency.injection.dto.WorldInjection;
import com.indivaragroup.jdt17.spring.basic.dto.HelloDTO;
import com.indivaragroup.jdt17.spring.basic.dto.WorldDTO;
import com.indivaragroup.jdt17.spring.basic.exam.DistributionService;
import com.indivaragroup.jdt17.spring.basic.exam.configuration.DistributionConfiguration;
import com.indivaragroup.jdt17.spring.basic.exam.configuration.SalesConfiguration;
import com.indivaragroup.jdt17.spring.basic.exam.configuration.WarehouseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(
                JDTConfiguration.class
        );

        System.out.println(context.getBean("getInitialConfiguration"));

        /* Example Singleton */
        var db1 = DatabaseConfiguration.getInstance();
        var db2 = DatabaseConfiguration.getInstance();

        context.close();

        System.out.println("database 1 = " + db1);
        System.out.println("database 2 = " + db2);

		/* Example Bean */

        var contextBean = new AnnotationConfigApplicationContext(
				BeanConfiguration.class
		);

        HelloDTO hello = contextBean.getBean(HelloDTO.class);
        WorldDTO world = contextBean.getBean(WorldDTO.class);

        System.out.println(hello);
        System.out.println(world);

		contextBean.close();

		/* Example duplicate bean */

		var contextBeanDupe = new AnnotationConfigApplicationContext(
				DuplicateBeanConfiguration.class
		);

		HelloDTO hello1 = contextBeanDupe.getBean("hello1", HelloDTO.class);
		HelloDTO hello2 = contextBeanDupe.getBean("hello2", HelloDTO.class);

		System.out.println("hello1: " + hello1);
		System.out.println("hello2: " + hello2);

		contextBeanDupe.close();


		/* Example Primary */

		var primaryContextBean = new AnnotationConfigApplicationContext(
			PrimaryBeanConfiguration.class
		);

		WorldDTO worldPrimary = primaryContextBean.getBean(WorldDTO.class);
		System.out.println(worldPrimary);

		primaryContextBean.close();

		/* Example rename bean */

		var renameContextBean = new AnnotationConfigApplicationContext(
				BeanNameConfiguration.class
		);

		HelloDTO helloDTO1 = renameContextBean.getBean("helloSatu", HelloDTO.class);

		System.out.println("Bean Rename: " + helloDTO1);

		renameContextBean.close();

		/* Dependency Injection */

		HelloInjection helloInjection = new HelloInjection();
		WorldInjection worldInjection = new WorldInjection();
		HelloWorldInjection helloWorldInjection = new HelloWorldInjection(
				helloInjection,
				worldInjection
		);

		var helloWorldWithInjectionContext = new AnnotationConfigApplicationContext(
				HelloWorldWithInjection.class
		);

		HelloWorldWithInjection helloWorldWithInjection = helloWorldWithInjectionContext.getBean(HelloWorldWithInjection.class);
		System.out.println(helloWorldWithInjection.helloInjection().name());
		System.out.println(helloWorldWithInjection.worldInjection().name());

		helloWorldWithInjectionContext.close();

		/* Depends On */

		var DependsOnContext = new AnnotationConfigApplicationContext(
				DependsOnConfig.class
		);

		HelloDTO helloDTO = DependsOnContext.getBean(HelloDTO.class);
		WorldDTO worldDTO = DependsOnContext.getBean(WorldDTO.class);
		System.out.println("Call the depends on" + helloDTO + " : " + worldDTO);

		DependsOnContext.close();

		/* Exam 1 */

		var DistributionContext = new AnnotationConfigApplicationContext(
				DistributionConfiguration.class,
				WarehouseConfiguration.class,
				SalesConfiguration.class
		);

		DistributionService distributionService = DistributionContext.getBean(DistributionService.class);
		distributionService.distributeItem();


        SpringApplication.run(Application.class, args);
    }

}
