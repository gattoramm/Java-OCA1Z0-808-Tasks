package part8.exceptions.problems.p18;

public class GoodMorning {
    private int weight;

    void standOnScale(GoodMorning gm) throws WeightOutOfBoundsException {
        gm.weight = (int)(Math.random()*21 + 90);

        if (weight > 100)
            throw new WeightOutOfBoundsException();
        else
            System.out.println("I'm ordering pizza tonight! ");
    }

    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        try {
            gm.standOnScale(gm);
        } catch (WeightOutOfBoundsException woobe) {
            System.out.println(woobe);
        } finally {
            System.out.println("Finally");
        }
    }
}
