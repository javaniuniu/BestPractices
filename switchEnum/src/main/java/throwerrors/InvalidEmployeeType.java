package throwerrors;


import enums.EmployeeRecord;

public class InvalidEmployeeType extends Exception {

    public InvalidEmployeeType(EmployeeRecord type) {
        System.out.println("other type");
    }
}

