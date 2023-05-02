package java0418_test;

public class Scan {

    boolean scan(String b) {
        char[] a = b.toCharArray();
        int Numscan[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i]=='0') {
                Numscan[0]++;
            } else if (a[i]=='1') {
                Numscan[1]++;
            } else if (a[i]=='2') {
                Numscan[2]++;
            } else if (a[i]=='3') {
                Numscan[3]++;
            } else if (a[i]=='4') {
                Numscan[4]++;
            } else if (a[i]=='5') {
                Numscan[5]++;
            } else if (a[i]=='6') {
                Numscan[6]++;
            } else if (a[i]=='7') {
                Numscan[7]++;
            } else if (a[i]=='8') {
                Numscan[8]++;
            } else if (a[i]=='9') {
                Numscan[9]++;
            }
            for (int j = 0; j < 10; j++) {
                if (Numscan[j] >= 2) {
                    System.out.println(b+" : false");
                    return false;
                }
            }
        }
        System.out.println(b+" : true");
        return true;
    }

    public static void main(String[] args) {
        Scan scan = new Scan();
        scan.scan("0123456789");
        scan.scan("012343");
        scan.scan("01234567890");
        scan.scan("6789012345");
        scan.scan("012322456789");
    }
}

