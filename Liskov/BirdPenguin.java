public class BirdPenguin implements LayEgg {
    // @Override
    // public void canFlying() {
    // // TODO Auto-generated method stub

    // System.out.println("Penguin Will Fly");

    // }

    @Override
    public void LayEggBird() {
        System.out.println("Penguin will give egg");
    }

    public static void main(String[] args) {
        BirdPenguin birdPenguin = new BirdPenguin();
        birdPenguin.LayEggBird();
    }
}