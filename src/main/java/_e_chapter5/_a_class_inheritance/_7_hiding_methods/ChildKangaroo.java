package _e_chapter5._a_class_inheritance._7_hiding_methods;



public class ChildKangaroo extends ParentMarsupial {
    public static boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public boolean callParentMethod(){
        return super.isBiped();
    }
    public static void main(String[] args) {
        ChildKangaroo joey = new ChildKangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        System.out.println("Call directly isBiped() - parent method, using 'super':");
        System.out.println(joey.callParentMethod());
        System.out.println("Call directly isBiped() - child method:");
        System.out.println(isBiped());
    }
}
