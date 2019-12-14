package entity;


import abstractes.Employee;
import beans.Money;
import enums.EmployeeRecord;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return true;
    }

    @Override
    public Money calculatePay() {
        Money money = new Money();
        return money;
    }

    @Override
    public void deliverPay(Money money) {

    }
}
