package controller;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "test";
    }
}
