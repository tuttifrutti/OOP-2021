
import java.util.Scanner;

public class wardrobe {
    public class dress {
        int code;
        String color;
        String material;
        String brand;
        int dressType;  // 1 for formal and 2 for casual

        void setdressType(int dresstype) {
            this.dressType = dresstype;
        }

        void setcode(int code) {
            this.code = code;
        }

        void setcolor(String color) {
            this.color = color;
        }

        void setmaterial(String material) {
            this.material = material;
        }

        void setbrand(String brand) {
            this.brand = brand;
        }

        int getsetdresstype() {
            return this.dressType;
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

        public void create_formal_dress() {
            Scanner sc = new Scanner(System.in);
            setdressType(1);
            System.out.print("please enter dress code");
            int code = sc.nextInt();
            setcode(code);
            System.out.print("please enter dress color");
            String color = sc.nextLine();
            setcolor(color);
            System.out.print("please enter dress material");
            String material = sc.nextLine();
            setmaterial(material);
            System.out.print("please enter dress brand");
            String brand = sc.nextLine();
            setbrand(brand);
        }

        public void create_causal_dress() {
            Scanner sc = new Scanner(System.in);
            setdressType(2);
            System.out.print("please enter dress code");
            int code = sc.nextInt();
            setcode(code);
            System.out.print("please enter dress color");
            String color = sc.nextLine();
            setcolor(color);
            System.out.print("please enter dress material");
            String material = sc.nextLine();
            setmaterial(material);
            System.out.print("please enter dress brand");
            String brand = sc.nextLine();
            setbrand(brand);
        }
    }

    public class dress_collection {
        private dress formal_dress[] = new dress[20];
        ;
        private int length_formal_dress;
        private dress casual_dress[] = new dress[20];
        ;
        private int length_casual_dress;

        void dress_collection() {
            length_formal_dress = 20;
            length_casual_dress = 20;
        }

        public void add_formal_dress(dress obj_dress) {
            if (length_formal_dress < 20) {
                obj_dress.create_formal_dress();
                formal_dress[length_formal_dress] = obj_dress;
                length_formal_dress++;
            }
        }

        public void add_casual_dress(dress obj_dress) {
            if (length_casual_dress < 20) {
                obj_dress.create_causal_dress();
                casual_dress[length_casual_dress] = obj_dress;
                length_casual_dress++;
            }
        }

        public void remove_formal_dress() {
            if (length_formal_dress < 0) {
                formal_dress[length_formal_dress] = null;
                length_formal_dress--;
            }
        }
        public void remove_casual_dress() {
            if (length_casual_dress > 0) {
                casual_dress[length_casual_dress] = null;
                length_casual_dress--;
            }
        }
    }
    private dress_collection obj_dress_collection = new dress_collection();
    public static void main(String[] args) {
        // write your code here
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
                    obj_wardrobe.create_formal_dress();
                    break;
                case 2:
                    obj_wardrobe.create_causal_dress();
                    break;
                case 3:
                    obj_wardrobe.remove_formal_dress();
                    break;
                case 4:
                    obj_wardrobe.remove_causal_dress();
                    break;
                default:
                    System.out.print("invalid input please try again");
                }
            }
        }
        public void create_formal_dress() {
            dress formal_dress = new dress();
            obj_dress_collection.add_formal_dress(formal_dress);
        }

        public void create_causal_dress() {

            dress causal_dress = new dress();
            obj_dress_collection.add_casual_dress(causal_dress);
        }

        public void remove_formal_dress() {
            obj_dress_collection.remove_formal_dress();
        }

        public void remove_causal_dress() {

            obj_dress_collection.remove_casual_dress();
        }
    }
}

