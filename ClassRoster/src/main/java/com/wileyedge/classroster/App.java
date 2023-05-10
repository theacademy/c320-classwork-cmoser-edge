package com.wileyedge.classroster;

import com.wileyedge.classroster.controller.ClassRosterController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.getEnvironment().setActiveProfiles("Application");
        appContext.scan("com.wileyedge.classroster");
        appContext.refresh();

        Map<String, Object> beans = appContext.getBeansOfType(Object.class);

        ClassRosterController controller = appContext.getBean(ClassRosterController.class);

        controller.run();
    }
}
