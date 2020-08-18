package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("This pc Ram is - "+memorySize+"Gb");
            }
            @Override
            public void monitorSize(int screenSize) {
                System.out.println("This pc Screen size is - "+screenSize+" Inches");
            }
        };
        laptop.monitorSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone FunctionalInterface
        Phone phone = new Phone() {
            @Override
            public void cellularNetwork(String network) {
                System.out.println("This phone is Locked to "+network+" network");
            }
        };
        phone.cellularNetwork("T-Mobile");

    }
}
