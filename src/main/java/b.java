package quiz;

public class b {
	//א
		public boolean (maxSpeed) {
			if(this.privateCar == true) {
				return true;
			}
			if(this.speef>maxSpeed) {
				return true;
			}
			else {
				return false;
			}
		}
		//ב1
		public boolean allGood(){
			for(int i = 0; i< cars.length; i++) {
				if(cars[i].illegal(this.maxSpeed == true){
					return false
				}
			}
			return true;
		}
		public int legalCities(CameraInfo [] cameras) {
			boolean flag;
			int count = 0;
			for(int i = 0; i<100; i++) {
				for(int j = 0; i<cameras.length) {
					if(i == cameras[i].getCity()) {
						if(cameras[j].allGood() == true) {
							flag = true;
						}
						else {
							flag = false;
						}
					}
				}
				if(flag == true) {
					count++;
				}
			}
			return count;
		}


}
