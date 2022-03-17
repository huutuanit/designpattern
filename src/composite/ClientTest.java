package composite;

public class ClientTest {

	
	public static void main(String[] args) {
		Boss boss = new Boss(50, "Tuanch", 20000);
		BusinessAnalyst ba = new BusinessAnalyst(30, "Duy Vat", 2000);
		
		Leader leader = new Leader(25, "Manh", 1500);
		Developer dev1 = new Developer(20, "Doan 1", 1000);
		Developer dev2 = new Developer(20, "Doan 2", 1000);
		
		leader.add(dev1);
		leader.add(dev2);
		
		boss.add(leader);
		boss.add(ba);
		
		boss.print();
	}
}
