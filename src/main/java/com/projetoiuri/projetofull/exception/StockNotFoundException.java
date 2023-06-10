package com.projetoiuri.projetofull.exception;

public class StockNotFoundException extends RuntimeException{

    public StockNotFoundException(Long id){
        super("Could not found the product with id" + id);
    }
}
