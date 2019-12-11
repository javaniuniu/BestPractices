package interfaces;


import abstractes.Employee;
import enums.EmployeeRecord;
import throwerrors.InvalidEmployeeType;


public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

