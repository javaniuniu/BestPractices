package impls;


import abstractes.Employee;
import enums.EmployeeRecord;
import entity.CommissionedEmployee;
import entity.HourlyEmployee;
import entity.SalariedEmployee;
import interfaces.EmployeeFactory;
import throwerrors.InvalidEmployeeType;

public class EmployeeFactoryImpl implements EmployeeFactory {
    EmployeeRecord employeeTpye = EmployeeRecord.COMMISSIONED;

    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        switch (employeeTpye) {
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                throw new InvalidEmployeeType(employeeTpye);
        }
    }

    // TODO: 2019-12-11 通过junit 实现测试
    public static void main(String[] args) throws InvalidEmployeeType {
        EmployeeFactoryImpl s = new EmployeeFactoryImpl();
        s.makeEmployee(EmployeeRecord.COMMISSIONED);
    }
}
