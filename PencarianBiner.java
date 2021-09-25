class PencarianBiner {


	public static void main(String[] args) {
		
          int data[] = {2,5,6,9,12,15,20};

          int tengah = data.length/2;
          int cari = 100;
          boolean ketemu = false;
           
           if(cari == data[tengah]){
           	 System.out.print("data di temukan pada indek ke - "+tengah);
           	 ketemu = true;
           }else {
           	   if(cari < data[tengah]){
           	   	for(int i = tengah-1; i >= 0; i--){
           	   		if(cari == data[i]){
           	   			System.out.print("data di temukan pada indek ke - "+i);
           	   			ketemu = true;
           	   			break;
           	   		}
           	   	}
           	   }else {
           	   	   for(int j = tengah+1; j < data.length; j++){
           	   	   	 if(cari == data[j]){
           	   	   	 	System.out.print("data di temukan pada indek ke - "+j);
           	   	   	 	ketemu = true;
           	   	   	 	break;
           	   	   	 }
           	   	   }
           	   }
           }
          if(ketemu == false){

          	System.out.print("data tidak di temukan !!!");
          }
          

	}
}