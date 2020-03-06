public class SortOfSort {

    public void sortOfSort(int[] A) {
        if (A.length < 3) {
            miniSort(A);
        } else {
            sortHelper(A, 0, 0, 0, 0, 0, 0);
        }
    }

    public int[] sortHelper (int[] A, int start, int offset, int counter, int counter2, int base, int base2) {
        int max = A[start];
        int last_index = (A.length - 1) - offset;
        int mid = A.length / 2;
        int temp = A[last_index];

        if ((base >= mid) && (base2 >= mid)) {
            return A;
        }
        if ((counter == 2) && (counter2 == 2)) {
            counter = 0;
            counter2 = 0;
        }
        for (int i = start; i <= last_index; i++) {
            if (A[i] > max) {
                max = A[i];
                if (counter < 2) {
                    temp = A[last_index];
                } else {
                    temp = A[start];
                }
            }
        }

        for (int i = start; i <= last_index; i++) {
            if (A[i] == max) {
                A[i] = temp;
                break;
            }
        }
        if (counter < 2) {
            A[last_index] = max;
            sortHelper(A,start,offset + 1,counter + 1, counter2, base + 1, base2);
        }  else {
            A[start] = max;
            sortHelper(A,start + 1, offset, counter, counter2 + 1, base, base2 + 1);
        }
        return A;
    }

    public int[] miniSort(int[] A) {
        int temp = 0;
        if (A.length == 1) {
            return A;
        } else {
            if (A[0] > A[1]) {
                temp = A[1];
                A[1] = A[0];
                A[0] = temp;
                return A;
            } else {
                return A;
            }
        }
    }
}
