class Solution {
    public boolean backspaceCompare(String s, String t) {
        int pointerOne = s.length() - 1;
        int pointerTwo = t.length() - 1;
        int counterOne = 0;
        int counterTwo = 0;

        while (pointerOne >= 0 || pointerTwo >= 0) {

            while (pointerOne >= 0) {
                if (s.charAt(pointerOne) == '#') {
                    counterOne++;
                    pointerOne--;
                } else if (counterOne > 0) {
                    counterOne--;
                    pointerOne--;
                } else {
                    break;
                }
            }

            while (pointerTwo >= 0) {
                if (t.charAt(pointerTwo) == '#') {
                    counterTwo++;
                    pointerTwo--;
                } else if (counterTwo > 0) {
                    counterTwo--;
                    pointerTwo--;
                } else {
                    break;
                }
            }

            if (pointerOne < 0 && pointerTwo < 0) {
                return true;
            }

            if (pointerOne < 0 || pointerTwo < 0) {
                return false;
            }

            if (s.charAt(pointerOne) != t.charAt(pointerTwo)) {
                return false;
            }

            pointerOne--;
            pointerTwo--;
        }

        return true;
    }
}
