class PencarianBiner {


	public static void main(String[] args) {
		
          int data[] = {2,5,6,9,12,15,20};

          int tengah = data.length/2;
          int cari = 9;
          boolean ketemu = false;
           
           if(data[tengah] == cari){
           	 System.out.print("data di temukan pada indek ke - "+tengah);
           }
          if(ketemu == false){

          	System.out.print("data tidak di temukan !!!");
          }
          

	}
}