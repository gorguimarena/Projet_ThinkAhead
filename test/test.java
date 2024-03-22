package test;


class testGrille {
    public static void lign(int tail){
        for (int i = 0; i < tail; i++) {
            System.out.print("+--");
        }
        System.out.println();
    }
    public static void indixY(int tail){
        for (int i = 0; i < tail; i++) {
            System.out.print("  "+i);
        }
        System.out.println();
    }
    public static void indixX(int i){
        System.out.print(i);
    }

    public static void main(String[] args) {
        indixY(6);
        for (int i = 0; i < 6; i++) {

            lign(6);
            indixX(i);
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                System.out.print(j+"| ");
            }
            System.out.println();

        }
    }

}
