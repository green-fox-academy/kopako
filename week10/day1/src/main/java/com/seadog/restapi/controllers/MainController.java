package com.seadog.restapi.controllers;

import com.seadog.restapi.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubling doublingForm(@RequestParam int input) {
        Doubling doubling = new Doubling();
        doubling.setReceived(input);
        return doubling;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeter doublingForm(@RequestParam String name, @RequestParam String title) {
        return new Greeter(name, title);
    }

    @GetMapping(value = "/appenda/{appendable}")
    @ResponseBody
    public AppendA appendA(@PathVariable String appendable) {
        return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Until until(@PathVariable String action, @RequestParam(required = false) Integer until) {
        Until returnResult = new Until();
        if (until == null) {
            throw new UnsupportedOperationException("Please provide a number!");
        }

        if (action.toLowerCase().equals("sum")) {
            returnResult.setResult(Until.sum(until));
            return returnResult;
        } else if (action.toLowerCase().equals("factor")) {
            returnResult.setResult(Until.factorial(until));
            return returnResult;
        }
        return returnResult;
    }

    @PostMapping("/arrays")
    @ResponseBody
    public Object arrays(@RequestBody ReceivingArray receivingArray) {
        int res=0;
        if (receivingArray.getWhat().equals("sum")) {
            for (int number :
                    receivingArray.getNumbers()) {
                res+=number;
            }
            return new ResultInteger(res);
        } else if (receivingArray.getWhat().equals("multiply")) {
            res=1;
            for (int number :
                    receivingArray.getNumbers()) {
                res *= number;
            }
            return new ResultInteger(res);
        } else if (receivingArray.getWhat().equals("double")) {
            for (int i = 0; i < receivingArray.getNumbers().length; i++) {
                receivingArray.getNumbers()[i] *= 2;
            }
            return new ResultArray(receivingArray.getNumbers());
        } else return new RestError("Please provide what to do with the numbers!");
    }

}
