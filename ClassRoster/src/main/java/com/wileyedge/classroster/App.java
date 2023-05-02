package com.wileyedge.classroster;

import com.wileyedge.classroster.controller.ClassRosterController;
import com.wileyedge.classroster.dao.*;
import com.wileyedge.classroster.service.ClassRosterServiceLayer;
import com.wileyedge.classroster.service.ClassRosterServiceLayerImpl;
import com.wileyedge.classroster.ui.ClassRosterView;
import com.wileyedge.classroster.ui.UserIO;
import com.wileyedge.classroster.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        //ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterDao myDao = new ClassRosterDaoDBImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();

        // Dependency injection
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        //ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl();
        ClassRosterController controller = new ClassRosterController(myService, myView);

        controller.run();
    }
}
