package module4.four;

public class Cannon {
    private boolean loaded;

    public Cannon() {
    }

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (!loaded) {
            System.out.println("Cannon is not loaded yet!");
            load();
        }

        System.out.println("Fire!");
        loaded = false;
    }

    public void load() {
        if (loaded) {
            System.out.println("Cannon is already loaded!");
            return;
        }

        System.out.println("Loading...");
        loaded = true;
    }
}