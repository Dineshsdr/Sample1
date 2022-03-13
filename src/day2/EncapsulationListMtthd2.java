package day2;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationListMtthd2 {

	public static void main(String[] args) {
		
		EncapsulationListMethod E = new EncapsulationListMethod();
		E.setEmpId(22);
		E.setName("SDR");
		E.setPhNo(9790643813l);
		
		EncapsulationListMethod E1 = new EncapsulationListMethod();
		E1.setEmpId(24);
		E1.setName("Pranav");
		E1.setPhNo(7687687686l);
		
		EncapsulationListMethod E2 = new EncapsulationListMethod();
		E2.setEmpId(30);
		E2.setName("Dinesh");
		E2.setPhNo(7667867867678l);
		
		List<EncapsulationListMethod> Vr = new ArrayList<EncapsulationListMethod>();
		Vr.add(E);
		Vr.add(E1);
		Vr.add(E2);
		
		//System.out.println(Vr.get(0).getEmpId());  
		// This will take more time instead of above using For loop
		
		for (int i = 0; i <Vr.size(); i++) {
			
			
			System.out.println(Vr.get(i).getEmpId());
			System.out.println(Vr.get(i).getName());
			System.out.println(Vr.get(i).getPhNo());
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}
