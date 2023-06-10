package com.projetoiuri.projetofull.controller;
import com.projetoiuri.projetofull.exception.StockNotFoundException;
import com.projetoiuri.projetofull.model.Stock;
import com.projetoiuri.projetofull.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import  java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @PostMapping("/stock")
    Stock newStock(@RequestBody Stock newStock){

        return stockRepository.save(newStock);
    }

    @GetMapping("/stocks")
    List<Stock> getAllStocks(){
        return stockRepository.findAll();
    }

    @GetMapping("/stock/{id}")
    Stock getStockById(@PathVariable Long id){
        return stockRepository.findById(id)
                .orElseThrow(()->new StockNotFoundException(id));
    }


        @PutMapping("/stock/{id}")
        Stock updateStock(@RequestBody Stock newStock,@PathVariable Long id){
            return stockRepository.findById(id)
                    .map(stock->{
                        stock.setProduct(newStock.getProduct());
                        stock.setProductQ(newStock.getProductQ());
                        stock.setPrice(newStock.getPrice());
                        return stockRepository.save(stock);
                    }).orElseThrow(()->new StockNotFoundException(id));
        }


        @DeleteMapping("/stock/{id}")
        String deleteStock(@PathVariable Long id){
        if (!stockRepository.existsById(id)){
            throw new StockNotFoundException(id);
        }
            stockRepository.deleteById(id);
            return "The item with ID:"+id+" has been deleted success!!";
        }

    }
