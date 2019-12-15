package entity;


import abstractes.Employee;
import beans.Money;
import enums.EmployeeRecord;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeRecord r) {
//        super();
        Money ss = calculatePay();
        isPayday();
        deliverPay(ss);
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
        System.out.println("class CommissionedEmployee ");
    }

}
