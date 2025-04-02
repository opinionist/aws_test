package example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asdf")
public class AsdfController {
    @GetMapping
    public String asdf(@RequestParam String name) {
        return name + "GEt TEST 입니다.";
    }

    @PostMapping
    public String qwer(@RequestBody Dto dto) {
        return dto.getAsdf() + "post TEST 입니다.";
    }
}