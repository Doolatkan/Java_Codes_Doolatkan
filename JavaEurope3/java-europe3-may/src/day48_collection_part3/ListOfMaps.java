package day48_collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {
		
		//List<Integer> employees = new ArrayList<>();
		
		
		List<Map<String, String>> employees = new ArrayList<>();
		
		Map<String, String> emp1Data = new HashMap<>();
		emp1Data.put("EmpID", "123");
		emp1Data.put("EmpName", "Jahn");
		emp1Data.put("JobTitle", "SDET");
		emp1Data.put("Salary", "100000");
		
		Map<String, String> emp2Data = new HashMap<>();
		emp2Data.put("EmpID", "1234");
		emp2Data.put("EmpName", "Mike");
		emp2Data.put("JobTitle", "SDET");
		emp2Data.put("Salary", "80000");
		
		employees.add(emp1Data);
		employees.add(emp2Data);
		
		System.out.println(employees.toString());
		
		System.out.println(employees.get(0));
		System.out.println(employees.get(1).get("EmpName"));
		
		
		
		int totalSalary = 0;
		for(Map<String, String> employee : employees) {
			//totalSalary += Integer.valueOf(employee.get("Salary"));
			totalSalary += Integer.parseInt(employee.get("Salary"));
		}
		System.out.println("Total Salary : " + totalSalary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
