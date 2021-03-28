package com.company;
import java.util.Scanner;

//import wardrobe.dress;
//import wardrobe.dresscollection;
    /**
     *
     * @Syeda Shafaq Shahid
     */
public class dress{
    int  code;
    String  color;
    String material;
    String brand;
    int dresstype;  // 1 for formal and 2 for casual
        void setdresstype( int dresstype ) {
            this.dresstype=dresstype;
        }
        void setcode( int code ) {
            this.code=code;
        }
        void setcolor( String color  ) {
            this.color = color ;
        }
        void setmaterial( String material){
            this.material=material;
        }
        void setbrand( String brand){
            this.brand=brand;
        }
        int getsetdresstype() {
            return this.dresstype;
        }
        int getcode() {
            return code;
        }
        String getcolor() {
            return color;
        }
        String getmaterial() {
            return material;
        }
        String getbrand() {
            return brand;
        }
        public void create_formal_dress(){
            Scanner sc= new Scanner(System.in);
            setdresstype(1) ;
            System.out.print("please enter dress code");
            int code= sc.nextInt();
            setcode(code);
            System.out.print("please enter dress color");
            String color = sc.nextLine();
            setcolor(color);
            System.out.print("please enter dress material");
            String  material= sc.nextLine();
            setmaterial(material );
            System.out.print("please enter dress brand");
            String brand =sc.nextLine();
            setbrand(brand);
        }
        public void create_causaldress(){
            Scanner sc= new Scanner(System.in);
            setdresstype(2)  ;
            System.out.print("please enter dress code");
            int code= sc.nextInt();
            setcode(code);
            System.out.print("please enter dress color");
            String color= sc.nextLine();
            setcolor(color);
            System.out.print("please enter dress material");
            String  material= sc.nextLine();
            setmaterial(material );
            System.out.print("please enter dress brand");
            String brand =sc.nextLine();
            setbrand(brand);
        }
    }
public class dresscollection {

    private dress formaldress[] = new dress[20]; ;
    private int length_formaldress;
    private dress casualdress[] = new dress[20];;
    private int length_casualdress;

    void dresscollection(){
        length_formaldress = 20;
        length_casualdress = 20;

    }

    public void add_formaldress(dress obj_dress){
        if(length_formaldress < 20) {
            obj_dress.create_formal_dress();
            formaldress[length_formaldress] = obj_dress;
            length_formaldress++;
        }
    }
    public void add_casualdress(dress obj_dress){
        if(length_casualdress < 20) {
            obj_dress.create_causaldress();
            casualdress[length_casualdress] = obj_dress;
            length_casualdress++;
        }
    }
    public void remove_formaldress(){
        if(length_formaldress < 0) {
            formaldress[length_formaldress] = null;
            length_formaldress--;
        }
    }

    public void remove_casualdress(){
        if(length_casualdress > 0) {
            casualdress[length_casualdress] = null;
            length_casualdress--;
        }
    }
}
public class wardrobe {

    /**
     * @param args the command line arguments
     */
    private dresscollection obj_dresscollection = new dresscollection();

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
        wardrobe obj_wardrobe = new wardrobe();
        Boolean prog_flag = true;


        int a;
        while (prog_flag) {
            System.out.flush();
            System.out.print("press 1 to add format dress in wardrobe");
            System.out.print("\npress 2 to add casual dress in wardrobe");
            System.out.print("\npress 3 to remove format dress in wardrobe ");
            System.out.print("\npress 4 to remove casual dress in wardrobe ");
            System.out.print("\npress 0 to close the wardrobe ");

            a = sc.nextInt();
            switch (a) {
                case 0:
                    prog_flag = false;
                    break;
                case 1:
                    obj_wardrobe.create_formaldress();
                    break;
                case 2:
                    obj_wardrobe.create_causaldress();
                    break;
                case 3:
                    obj_wardrobe.remove_formaldress();
                    break;
                case 4:
                    obj_wardrobe.remove_causaldress();
                    break;
                default:
                    System.out.print("invalid input please try again");
            }
        }

    }

    public void create_formaldress() {
        dress formaldress = new dress();
        obj_dresscollection.add_formaldress(formaldress);

    }

    public void create_causaldress() {

        dress causaldress = new dress();
        obj_dresscollection.add_casualdress(causaldress);
    }

    public void remove_formaldress() {
        obj_dresscollection.remove_formaldress();
    }

    public void remove_causaldress() {

        obj_dresscollection.remove_casualdress();
    }

}
}