package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.CakesOrder;
import th.ac.ku.KuPremiumAPI.service.OrderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<CakesOrder> getAll(){
        return service.getAll();
    }

    @PostMapping
    public CakesOrder create(@RequestBody CakesOrder order){
        return  service.create(order);
    }

    @GetMapping("/{id}")
    public CakesOrder getOrder(@PathVariable UUID id){
        return service.getOrder(id);
    }

    @PutMapping("/{id}")
    public CakesOrder update(@PathVariable UUID id ,@RequestBody CakesOrder order){
        return service.update(id, order);
    }

    @DeleteMapping("/{id}")
    public CakesOrder delete(@PathVariable UUID id){
        return service.delete(id);
    }


}
