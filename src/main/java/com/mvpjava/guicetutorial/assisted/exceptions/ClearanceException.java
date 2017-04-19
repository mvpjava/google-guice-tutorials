/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvpjava.guicetutorial.assisted.exceptions;

/**
 *
 * @author andy
 */
public class ClearanceException extends Exception {

    /**
     * Creates a new instance of <code>ClearanceException</code> without detail
     * message.
     */
    public ClearanceException() {
    }

    /**
     * Constructs an instance of <code>ClearanceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClearanceException(String msg) {
        super(msg);
    }
}
