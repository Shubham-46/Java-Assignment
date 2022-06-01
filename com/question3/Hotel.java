package com.question3;

public interface Hotel {

	void chickenBiryani();
	void masalaDosa();

}
class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chiken Biryani of TajHotel");
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("masala Dosa of Roadside hotel");
	}
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
}
class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("ChikenBiryani of Roadside hotel");
		
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("masala Dosa of RoadSide Hotel");
		
	}
	
}
class Demo{
	public Hotel provideFood(int amount) {
		if(amount>1000)
			return new TajHotel();
		else if(amount>200 && amount<=1000)
			return new RoadSideHotel();
		else
			return null;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Hotel h=d.provideFood(145);

		if(h!=null) {
			h.chickenBiryani();
			h.masalaDosa();
			if(h instanceof TajHotel) {
				((TajHotel) h).welcomeDrink();
			}
		}
		else{
			System.out.println("Please Enter a valid amount;");
		}
	}
}

