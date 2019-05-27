/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javalin_test;

import io.javalin.Javalin;
/**
 *
 * @author buris
 */
public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/buris", ctx -> ctx.result("Hello Buris"));
    }
    
}
