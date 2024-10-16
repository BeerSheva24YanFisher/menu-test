package telran.view.test;

import telran.view.InputOutput;
import telran.view.Item;

public class CalculatorItems {
    private static Calculator calculator;

    public static Item[] getItems(Calculator calculator) {
        CalculatorItems.calculator = calculator;
        Item[] res = {
                Item.of("add numbers", CalculatorItems::add),
                Item.of("substract numbers", CalculatorItems::substract),
                Item.of("multiply numbers", CalculatorItems::multiply),
                Item.of("divide numbers", CalculatorItems::divide),
                Item.ofExit()
        };
        return res;
    }

    static double[] enterNumbers(InputOutput io) {
        double op1 = io.readDouble("Enter first number", "");
        double op2 = io.readDouble("Enter second number", "");
        return new double[] { op1, op2 };
    }

    static void add(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.add(numbers[0], numbers[1]));
    }

    static void substract(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.substract(numbers[0], numbers[1]));
    }

    static void multiply(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.multiply(numbers[0], numbers[1]));
    }

    static void divide(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.divide(numbers[0], numbers[1]));
    }
}