public class VivekMain {
    public static void main(String[] args) {
        Builder build = new Builder.InnerBuilder().setColor("Green").setModel("Urus").setName("Lamborghini").build();
        System.out.println(build.getColor());
        System.out.println(build.getName());
        System.out.println(build.getModel());
    }
}
