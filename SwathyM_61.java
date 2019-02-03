class DiamondClass {
    public static void MakeDiamond(int length){
        for (int i=1; i<=length; i++) {
            for (int j=0; j<(2*length-1-i); j++)
                System.out.print(" ");
            for (int j=0; j<(2*i-1); j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=length-1; i++) {
            for (int j=0; j<length-1-i; j++)
                System.out.print(" ");
            for (int j=0; j<length; j++)
                System.out.print("1");
            for (int j=0; j<(2*i-1); j++)
                System.out.print(" ");
            for (int j=0; j<length; j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=length-2; i++) {
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<length; j++)
                System.out.print("1");
            for (int j=0; j<((2*length-3)-2*i); j++)
                System.out.print(" ");
            for (int j=0; j<length; j++)
                System.out.print("1");
            System.out.println();
        }
        for (int i=1; i<=length; i++) {
            for (int j=0; j<length-2+i; j++)
                System.out.print(" ");
            for (int j=0; j<((2*length+1)-2*i); j++)
                System.out.print("1");
            System.out.println();
        }
    }
    public static void main(String[] args){
        MakeDiamond(11);
    }
}
