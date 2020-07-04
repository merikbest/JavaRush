package Core.level15.task1523;

public class Solution {
    public static void main(String[] args) {

    }

    Solution() {

    }

    public Solution(int x) {

    }
    private Solution(double x) {

    }
    protected Solution(int x, double y) {

    }
}

class SubSolution extends Solution {
    SubSolution() {
    }

    public SubSolution(int x) {
        super(x);
    }

    protected SubSolution(int x, double y) {
        super(x, y);
    }
}
