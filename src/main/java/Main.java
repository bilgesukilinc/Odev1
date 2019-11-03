public class Main {
    // INHERITANCE KOD ORNEGI
    public static class Ogrenci extends Personel {

        private static final Object adı = "" ;
        private int ogrenciNo = 0;

        public Ogrenci() {
            super();
        }

        public Ogrenci(String adi, String soyadi, int yasi, int ogrenciNo) {


            super(adı, soyadı, yası);
            setOgrenciNo(ogrenciNo);
        }


        public int getOgrenciNo() {
            return ogrenciNo;
        }


        public void setOgrenciNo(int ogrenciNo) {
            if (ogrenciNo < 0) {
                ogrenciNo = 0;
            } else {
                this.ogrenciNo = ogrenciNo;
            }
        }

        public String getKimlikBilgileri(){
            return super.getKimlikBilgileri() + " Öğrenci No: " + ogrenciNo;
        }
    }
    // OVERRİDİNG KOD ORNEGI
    public class calisan{
        int maas(){
            return 1000;
        }
    }
    public class yarizamanlicalisan extends calisan{
        int haftaliksaat;
        int maas(){
            return haftaliksaat*5;
        }
    }

}
