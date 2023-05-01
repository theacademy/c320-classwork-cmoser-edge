package com.wileyedge.classroster;

import com.wileyedge.classroster.controller.ClassRosterController;
import com.wileyedge.classroster.dao.ClassRosterAuditDao;
import com.wileyedge.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.wileyedge.classroster.dao.ClassRosterDao;
import com.wileyedge.classroster.dao.ClassRosterDaoFileImpl;
import com.wileyedge.classroster.service.ClassRosterServiceLayer;
import com.wileyedge.classroster.service.ClassRosterServiceLayerImpl;
import com.wileyedge.classroster.ui.ClassRosterView;
import com.wileyedge.classroster.ui.UserIO;
import com.wileyedge.classroster.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();

        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = new ClassRosterController(myService, myView);

        controller.run();
    }
}
