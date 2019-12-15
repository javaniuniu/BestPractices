package impls;

import enums.EmployeeRecord;
import org.junit.jupiter.api.Test;
import throwerrors.InvalidEmployeeType;

class EmployeeFactoryImplTest {

    @Test
    void makeEmployee() throws InvalidEmployeeType {
        EmployeeFactoryImpl s = new EmployeeFactoryImpl();
        s.makeEmployee(EmployeeRecord.COMMISSIONED);

    }
}