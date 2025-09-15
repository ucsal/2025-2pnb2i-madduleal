package br.com.mariojp.solid.isp.Models;

import br.com.mariojp.solid.isp.Interfaces.IPrinter;

public class SimplePrinter implements IPrinter {
    @Override public void Print(String content){
        System.out.println("[Printer]: " + content);
    }
}
