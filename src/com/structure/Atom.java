package com.structure;

import com.utils.Coordinate;

/**
 * The Atom class is used to represente an Atom
 *
 * @author Rachid AHMED
 * @version 1.0
 */
public class Atom {
    private int iAtomSerialNumber;
    private String sAtomName;
    private String sElementSymbol;
    private Coordinate coord;

    /**
     * Constructor
     * @param iAtomSerialNumber
     * @param sAtomName
     * @param sElementSymbol
     * @param coord
     * @param pLine
     */
    public Atom( int iAtomSerialNumber, String sAtomName, String sElementSymbol, Coordinate coord, int pLine) {
        super();
        this.iAtomSerialNumber = iAtomSerialNumber;
        this.sAtomName = sAtomName;
        this.sElementSymbol = sElementSymbol;
        this.coord = coord;
    }

    /**
     *
     * @return Atome name
     */
    public String getAtomName() {
        return this.sAtomName;
    }

    /**
     *
     * @return Atom Serial Number
     */
    public int getAtomSerialNumber() {
        return this.iAtomSerialNumber;
    }

    public Coordinate getCoord() {
        return this.coord;
    }

    public String toString() {
        return "\nAtom [iAtomSerialNumber=" +iAtomSerialNumber+", sAtomName=: "+sAtomName
                +", iAtomSerialNumber=: "+iAtomSerialNumber+", coord=: "+coord+"]";
    }
}
