package com.example.testtech.Controller;

import com.example.testtech.DTO.Sameple;
import com.example.testtech.Mapper.SampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("")
@RequiredArgsConstructor
public class HomeController {
    private SampleMapper sampleMapper;

    public HomeController(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    @GetMapping("/home")
    public ResponseEntity<?> home(@RequestParam("id") String id) {
        List<Sameple> ls = sampleMapper.selectAll(id);
        ls.forEach(e -> {
            System.out.println(e.getId() + "-" + e.getContent());
        });
        return ResponseEntity.ok(ls.size());
    }
}
