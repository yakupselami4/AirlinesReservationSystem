package concretes;

import abstracts.PassengerService;
import entities.Passenger;

public class PassengerManager implements PassengerService{


	@Override
	public void registarion(Passenger passenger) {
		if(passenger.getPassengerEmail().matches("^[\\w.+\\-]+@gmail\\.com$")&&passenger.getPassengerPassword().length()>=6) {
			System.out.println("kayıt işlemi başarıyla gerçekleşti");
		}else {
			System.out.println("emailinizi ya da şifrenizi doğru yazdığınızdan emin olunuz! şifrenizin uzunluğu 6 karakterden fazla olmalıdır. ");
		}
	}

	@Override
	public void login(Passenger passenger,String id, String password) {
		if(id.equals(passenger.getPassengerEmail())&&password.equals(passenger.getPassengerPassword())) {
			System.out.println("giriş yapıldı");
		}else {
			System.out.println("şifrenizi ya da emailinizi doğru yazdığınızdan emin olunuz!");
		}
		
	}

}
