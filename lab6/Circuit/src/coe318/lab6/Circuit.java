package coe318.lab6;

//Author: Krunal Patel 501175325

import java.util.ArrayList;

// The Circuit class represents an electrical circuit composed of resistors.
public class Circuit {
    private static Circuit instance = null;
    private ArrayList<Resistor> resistors;

    // A private constructor to create a Circuit instance.
    private Circuit() {
        resistors = new ArrayList<>();
    }

    // Returns the one and only instance of the Circuit class 
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    // Adds a Resistor to the circuit (r)
    public void add(Resistor r) {
        resistors.add(r);
    }

    // Returns a string representation of the circuit, listing all the resistors.
    @Override
    public String toString() {
        StringBuilder circuitStr = new StringBuilder();
        for (Resistor resistor : resistors) {
            circuitStr.append(resistor.toString()).append("\n");
        }
        return circuitStr.toString();
    }
}
