package com.wileyedge.classroster;

import com.wileyedge.classroster.controller.ClassRosterController;
import com.wileyedge.classroster.dao.*;
import com.wileyedge.classroster.service.ClassRosterServiceLayer;
import com.wileyedge.classroster.service.ClassRosterServiceLayerImpl;
import com.wileyedge.classroster.ui.ClassRosterView;
import com.wileyedge.classroster.ui.UserIO;
import com.wileyedge.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


        //UserIO myIo = new UserIOConsoleImpl();
        //UserIO myIo = appContext.getBean("myIo", UserIOConsoleImpl.class);

        //ClassRosterView myView = new ClassRosterView(myIo);
        //ClassRosterView myView =  appContext.getBean("myView", ClassRosterView.class);
        //ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        //ClassRosterDao myDao = new ClassRosterDaoDBImpl();
        //ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();


        // Dependency injection
        //ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        //ClassRosterServiceLayer myService = appContext.getBean("myService", ClassRosterServiceLayerImpl.class);
        //ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl();
        //ClassRosterController controller = new ClassRosterController(myService, myView);
        ClassRosterController controller = appContext.getBean("myController", ClassRosterController.class);

        controller.run();
    }
}
