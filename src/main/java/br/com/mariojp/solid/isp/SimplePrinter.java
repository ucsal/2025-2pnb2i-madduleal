package br.com.mariojp.solid.isp;

import br.com.mariojp.solid.isp.Interfaces.IMultiFunctionDevice;

public class SimplePrinter implements IMultiFunctionDevice {
    @Override public void print(String content){ /* imprime */ }
    @Override public void scan(String targetFile){ throw new UnsupportedOperationException("Sem scanner"); }
}
