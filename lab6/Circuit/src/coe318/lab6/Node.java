package coe318.lab6;

//Author: Krunal Patel 501175325

// The Node class represents nodes in an electrical circuit.
public class Node {
    private static int nextNodeId = 0;
    private int nodeId;

    // Constructs a new Node with a unique identifier.
    public Node() {
        nodeId = nextNodeId++;
    }

    // Below it returns the ID of the node as a string.
    @Override
    public String toString() {
        return Integer.toString(nodeId);
    }
}
