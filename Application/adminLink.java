package com.masai.Application;

import java.util.Scanner;
import com.masai.usecases.RegisterDepartmentUsecase;
import com.masai.usecases.RegisterEmployeeUsecase;
import com.masai.usecases.RejectLeavesUsecase;
import com.masai.usecases.acceptLeavesUsecase;
import com.masai.usecases.getAllDepartmentUsecase;
import com.masai.usecases.transferDepartmentUsecase;
import com.masai.usecases.updateDepartmentUsecase;

public class adminLink {

  static boolean	ordering=true;
	public  static void linkingAdmin() {
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Hellow Welcome Admin :-> Falgun");
		System.out.println();
		System.out.println();
		
		System.out.println("Press 1. For Adding New Departments");
		System.out.println();
		System.out.println("Press 2. view all Department ");
		System.out.println();
		System.out.println("Press 3. Update The Department ");
		System.out.println();
		System.out.println("Press 4. For Adding New Employees ");
		System.out.println();
		System.out.println("Press 5. Transfer Employee To Other Department");
		System.out.println();
		System.out.println("Press 6. Accept leaves Of Employess");
		System.out.println();
		System.out.println("Press 7. Reject Leaves Of Employees");
		System.out.println();
		System.out.println("Press 8. For Exit ");
		
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			System.out.println();
			RegisterDepartmentUsecase.register();
			break;
		}
		case 2: {
			System.out.println();
			getAllDepartmentUsecase.viewAllDepartment();
			break;
		}
		case 3: {
			System.out.println();
			updateDepartmentUsecase.updatedept();
			break;
		}
		case 4: {
			System.out.println();
			RegisterEmployeeUsecase.registerEmployee();
			break;
		}
		case 5: {
			System.out.println();
			transferDepartmentUsecase.transferdepart();
			break;
		}
		case 6: {
			System.out.println();
			acceptLeavesUsecase.acceptLeaves();
			break;
		}
		case 7: {
			System.out.println();
			RejectLeavesUsecase.rejectLeaves();
			break;
		}
		case 8: {
			System.out.println();
			System.out.println("Application Closed");
			ordering=false;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}while(ordering);
		
		
	}
}

















































































































//made by falgun bokde web 18 fw18_0390