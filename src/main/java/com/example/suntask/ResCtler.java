package com.example.suntask;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class ResCtler {
    private static final Logger logger = LoggerFactory.getLogger(ResCtler.class);

    @PostMapping("/add/{firstParameter}/{secondParameter}/{thirdParameter}")
    @ResponseBody
        public JsonResult Numbers( @PathVariable int firstParameter,
                                       @PathVariable int secondParameter, @PathVariable char thirdParameter) {

        // Perform some logic with the parameters.
        JsonResult result = new JsonResult();
        result.setInput1(firstParameter);
        result.setInput2(secondParameter);

            int addResult = MathOperations.fun(firstParameter, secondParameter, thirdParameter);
            result.setResult(addResult);
            return result;

    }}

