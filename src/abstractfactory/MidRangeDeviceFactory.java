package abstractfactory;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory{

	@Override
	Phone getPhone() {
		// TODO Auto-generated method stub
		return new MidRangePhone();
	}

	@Override
	Laptop getLaptop() {
		// TODO Auto-generated method stub
		return new MidRangeLaptop();
	}

}
