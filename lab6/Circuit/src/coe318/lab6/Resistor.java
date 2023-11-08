package coe318.lab6;

//Author: Krunal Patel 501175325

// The Resistor class represents a resistor in an electrical circuit.
public class Resistor {
    private double resistance;
    private static int nextResistorId = 1; // Start from 1
    private int resistorId;
    private Node[] nodes;

    /**
     * Constructs a Resistor with the given resistance and connects it to two nodes.
     *
     * @param resistance This is the resistance value of the resistor.
     * @param node1      This is one of the nodes to which the resistor is connected.
     * @param node2      Another one of the nodes to which the resistor is connected.
     * @throws IllegalArgumentException if the resistance is not positive.
     */
    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistance must be a positive value.");
        }

        resistorId = nextResistorId++;
        nodes = new Node[]{node1, node2};
        this.resistance = resistance;
    }

    // Returns an array containing the two nodes connected to the resistor.
    public Node[] getNodes() {
        return nodes;
    }

    // Returns a string representation of the resistor, including its ID, connected nodes, and resistance.
    @Override
    public String toString() {
        return "R" + Integer.toString(resistorId) + ": " + nodes[0] + " " + nodes[1] + " " + resistance;
    }
}
