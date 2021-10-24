package Question21;

public class Employee {

    private String EmpId,EmpName,EmpDesignation;

    public void Employee(String id,String name,String designation)
    {
        EmpId = id;
        EmpName = name;
        EmpDesignation = designation;
    }
    public String[] getter()
    {
        String arr[]=new String[3];
        arr[0]= EmpId;
        arr[1] = EmpName;
        arr[2] = EmpDesignation;

        return arr;
    }
}
