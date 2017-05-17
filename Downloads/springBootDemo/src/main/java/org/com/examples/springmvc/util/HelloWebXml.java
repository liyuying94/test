package org.com.examples.springmvc.util;

import org.com.examples.springmvc.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



/*
 * 如果我们想要将这个JAR包转换成可以在Servlet容器中部署的WAR的话，
 * 就不能依赖于Application的main函数了，
 * 而是要以类似于web.xml文件配置的方式来启动Spring应用上下文，
 * 这时我们需要声明这样一个类：
 * 这个类的作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似，只不过在这里不需要编写额外的XML文件了
 * */
public class HelloWebXml extends SpringBootServletInitializer {
	
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


}
