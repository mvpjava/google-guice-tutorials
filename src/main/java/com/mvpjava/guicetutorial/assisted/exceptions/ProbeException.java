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
public class ProbeException extends Exception {

    /**
     * Creates a new instance of <code>ProbeException</code> without detail
     * message.
     */
    public ProbeException() {
    }

    /**
     * Constructs an instance of <code>ProbeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ProbeException(String msg) {
        super(msg);
    }
}
