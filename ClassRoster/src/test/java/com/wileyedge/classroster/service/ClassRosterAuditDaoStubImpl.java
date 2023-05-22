package com.wileyedge.classroster.service;

import com.wileyedge.classroster.dao.ClassRosterAuditDao;
import com.wileyedge.classroster.dao.ClassRosterPersistenceException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"Test","Test2"})
public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {
    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException {
        // Do nothing
    }
}
