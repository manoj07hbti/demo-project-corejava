package commit_08_june;

public class DuplicateElements {

    public static void main(String[] args) {

        int duplicateElements[] = {1, 2, 3, 4, 2, 3, 5};

        for (int i = 0; i < 6; i++) {
            for (int j = i +1; j < 6; j++) {

                if (duplicateElements[i] == duplicateElements[j]) {

                    System.out.println(duplicateElements[i]);
                }
            }
        }
    }
}




