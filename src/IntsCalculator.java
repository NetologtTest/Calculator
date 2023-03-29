public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        int b = result.intValue();
        return b;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Double result = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        int b = result.intValue();
        return b;
    }


    @Override
    public int pow(int a, int b) {
        //считаем через target
        Double result = target.newFormula()
                .addOperand(a)
                .addOperand(a)
                .calculate(Calculator.Operation.POW)
                .result;
        int d = result.intValue();
        return d;
    }

}
