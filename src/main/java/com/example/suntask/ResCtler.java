package com.example.suntask;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class ResCtler {
    private static final Logger logger = LoggerFactory.getLogger(ResCtler.class);

    @PostMapping("/add")
    @ResponseBody
        public AdditionRes addNumbers(@RequestBody Addition addition)
        {
            logger.info("Adding {} and {}. Result: {}", addition.getNum1(), addition.getNum2());
            AdditionRes result = new AdditionRes();
            result.setInput1(addition.getNum1());
            result.setInput2(addition.getNum2());

            int addResult = AdditionFunction.add(addition.getNum1(), addition.getNum2());
            result.setResult(addResult);
            return result;
        }    }


