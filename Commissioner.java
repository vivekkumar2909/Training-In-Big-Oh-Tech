
public class Commissioner {
    private String name;

    public void getNameOfComm() {
        System.out.printf("Name of Commissioner : ", this.name );
    }

    public Commissioner(String name) {
        this.name = name;
        // System.out.println("Name of commissioner : ",);
    }

    public void canArrest(Politician p, PM pm) {
        if (p instanceof PM) {
            System.out.println("Commissioner cannot arrest the PM : " + p.getName());
        } 
        else if (p instanceof Minister) {
            if (pm.canGivePermissionToArrest((Minister) p)) {
                if (p.getLimitExpend()) {
                    System.out.println("Commissioner will arrest Minister because he exceed the limit : " + p.getName());
                } else {
                    System.out.println("Minister " + p.getName() + " is within spending limit.");
                }
            }
        } 
        else if (p instanceof MP) {
            if (p.getLimitExpend()) {
                System.out.println("Commissioner will have authority to arrest MP because he exceed the limit : " + p.getName());
            } else {
                System.out.println("MP " + p.getName() + " is within spending limit.");
            }
        }
    }
}
