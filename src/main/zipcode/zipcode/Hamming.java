package zipcode;

public class Hamming {

    private String s;
    private String s1;


    public Hamming(String s, String s1) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {

        int distance = 0;

        //Iterate over length of both strands --> only if they are equal lenghths

        for (int i = 0; i < s.length(); i++) {
            //compare characters at each index
            if (s.charAt(i) != s1.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }
}
