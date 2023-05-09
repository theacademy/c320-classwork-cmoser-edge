package com.wileyedge.classroster;

import com.wileyedge.classroster.controller.ClassRosterController;
import com.wileyedge.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        //ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.wileyedge.classroster");
        appContext.refresh();

        Map<String, Object> beans = appContext.getBeansOfType(Object.class);

        ClassRosterController controller = appContext.getBean(ClassRosterController.class);

        controller.run();
    }
}
