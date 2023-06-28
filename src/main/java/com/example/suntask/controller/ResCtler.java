package com.example.suntask.controller;


import com.example.suntask.JsonResult;
import com.example.suntask.service.MathOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173/")
public class ResCtler {
    private static final Logger logger = LoggerFactory.getLogger(ResCtler.class);

    @PostMapping("/add/{firstParameter}/{secondParameter}/{thirdParameter}")
    @ResponseBody
        public JsonResult Numbers(@PathVariable int firstParameter,
                                  @PathVariable int secondParameter, @PathVariable char thirdParameter) {

        // Perform some logic with the parameters.
        JsonResult result = new JsonResult();
        result.setInput1(firstParameter);
        result.setInput2(secondParameter);

            int addResult = MathOperations.fun(firstParameter, secondParameter, thirdParameter);
            result.setResult(addResult);
            return result;

    }
     @Configuration
    public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedMethods("*")
                    .allowedOrigins("http://localhost:5173"); // Allow requests from the specified origin
        }
    }}

