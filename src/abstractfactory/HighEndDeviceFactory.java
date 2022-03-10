package abstractfactory;

public  class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory{

	@Override
	Phone getPhone() {
		// TODO Auto-generated method stub
		return new HighEndPhone();
	}

	@Override
	Laptop getLaptop() {
		// TODO Auto-generated method stub
		return new HighEndLaptop();
	}
}
