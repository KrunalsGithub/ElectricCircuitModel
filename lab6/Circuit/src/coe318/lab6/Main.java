package coe318.lab6;

//Author: Krunal Patel 501175325

//The Main class contains the entry point for the application and also demonstrates the functionality of the circuit.
public class Main {

    public static void main(String[] args) {
        Circuit circuit = Circuit.getInstance();

        Node node1, node2, node3, node4, node5;
        Resistor resistor1, resistor2, resistor3, resistor4;

        // Below it create nodes and resistors for the circuit
        node1 = new Node();
        node2 = new Node();
        node3 = new Node();
        node4 = new Node();
        node5 = new Node();

        // Below it creates resistors with values and connect them to nodes
        try {
            resistor1 = new Resistor(30, node1, node2);
            resistor2 = new Resistor(50, node2, node3);
            resistor3 = new Resistor(100, node3, node4);
            resistor4 = new Resistor(70, node4, node5);
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal resistor parameters: " + e.getMessage());
            return;
        }

        // Adds the resistors to the circuit
        circuit.add(resistor1);
        circuit.add(resistor2);
        circuit.add(resistor3);
        circuit.add(resistor4);

        // Prints the circuit information out
        System.out.println("Circuit Information:");
        System.out.println(circuit);
    }
}
