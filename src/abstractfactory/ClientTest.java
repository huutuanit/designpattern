package abstractfactory;

public class ClientTest {

	public static void main(String[] args) {
		ElectronicDeviceAbstractFactory higEndFactory = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
		Laptop higEndLaptop = higEndFactory.getLaptop();
		Phone higEndPhone = higEndFactory.getPhone();
		System.out.println(higEndLaptop.getSegment());
		System.out.println(higEndPhone.getSegment());
		
		ElectronicDeviceAbstractFactory midRangeFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
		Laptop midRangeLaptop = midRangeFactory.getLaptop();
		Phone midRangePhone = midRangeFactory.getPhone();
		System.out.println(midRangeLaptop.getSegment());
		System.out.println(midRangePhone.getSegment());
	}
	
}
