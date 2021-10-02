public class App {
    public static String[] empAssoc = {"EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"};
	public static String[][] empTable = new String[][] {
		{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
		{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
	};
	
	public static String[] daAssoc = {"DesignationCode", "Designation", "DA"};
	public static String[][] daTable = new String[][] {
		{"e", "Engineer", "20000"},
		{"c", "Consultant", "32000"},
		{"k", "Clerk", "12000"},
		{"r", "Receptionist", "15000"},
		{"m", "Manager", "40000"}
	};

    public static void findEmp(int empNo){
        int i=0;
        for(;i<empTable.length;i++){
            if(empNo == Integer.parseInt(empTable[i][0])){
                System.out.println("Emp No. \tEmp Name \tDepartment \tDesignation\t Salary");

                System.out.print(empTable[i][0]+"\t\t"+empTable[i][1]+"\t\t"+empTable[i][4]+"\t\t");

                char designationCode = empTable[i][3].charAt(0);
                int salary = Integer.parseInt(empTable[i][5]) + Integer.parseInt(empTable[i][6])- Integer.parseInt(empTable[i][7]);
                switch(designationCode){
                    case 'e':{
                        System.out.print(daTable[0][1]+"\t\t");
                        salary =  Integer.parseInt(daTable[0][2]) + salary ;
                        break;
                    }
                    case 'c':{
                        System.out.print(daTable[1][1]+"\t\t");
                        salary =  Integer.parseInt(daTable[1][2]) + salary ;
                        break;
                    }
                    case 'k':{
                        System.out.print(daTable[2][1]+"\t\t");
                        salary =  Integer.parseInt(daTable[2][2]) + salary ;
                        break;
                    }
                    case 'r':{
                        System.out.print(daTable[3][1]+"\t\t");
                        salary =  Integer.parseInt(daTable[3][2]) + salary ;
                        break;
                    }
                    case 'm':{
                        System.out.print(daTable[4][1]+"\t\t");
                        salary =  Integer.parseInt(daTable[4][2]) + salary ;
                        break;
                    }
                }
                System.out.print(salary);
                break;
            }
        }
        if(i == empTable.length){
            System.out.println("There is no employee with empid: "+empNo);
        }
    }

    public static void main(String[] args) throws Exception {
        int empNo = Integer.parseInt(args[0]);

        findEmp(empNo);
    }
}
