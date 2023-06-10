// package hust.soict.cybersec.test.disc;
// import hust.soict.cybersec.aims.disc.*;

// public class TestPassingParameter {
//     public static void main(String[] args) {
//         DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//         DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

//         swap(jungleDVD, cinderellaDVD);
//        System.out.println("Cinderella DVD title: "+ cinderellaDVD.getTitle());
//         System.out.println("Jungle DVD title: "+ jungleDVD.getTitle());
//         changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
        //expected result: Jungle DVD title = Jungle. two swaps occurred so its title is back to the original name
//         System.out.println("Jungle DVD title: "+ jungleDVD.getTitle()); 
//     }

//     public static void swap(Object o1, Object o2) { // incorrect method
//         Object tmp = o1; // pass reference
//         o1 = o2; 
//         o2 = tmp;
//     }

//     public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) { // correct method
//         DigitalVideoDisc tmp = new DigitalVideoDisc(o1.getTitle(), o1.getCategory(), o1.getDirector(), o1.getLength(), o1.getCost());
        // arguments are passed by value (aka copied)
//         o1.swap(o2); // here we operate directly on the object instead of changing the reference 
//         o2.swap(tmp);
//     }

//     public static void changeTitle(DigitalVideoDisc dvd, String title) {
//         String oldTitle  = dvd.getTitle(); // get old title
//         dvd.setTitle(title);
//         dvd = new DigitalVideoDisc(oldTitle); // dvd here is a separate copy
//     }
// }