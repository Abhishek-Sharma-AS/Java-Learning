class uit {
    int x = 45;
    static int y = 12;

    void showx() {
        System.out.println(x);
    }

    static void showy() {
        System.out.println(y);
    }
}

class testuit {
    public static void main(String[] args) {
        uit obj;
        obj = new uit();
        obj.showx();
        uit.showy();
    }
}
