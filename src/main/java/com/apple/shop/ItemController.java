package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list (Model model) {
        List<Item> result = itemRepository.findAll();
        System.out.println(result.get(0).price);
        System.out.println(result.get(0).title);

        ArrayList<Object> a = new ArrayList<>();

        model.addAttribute("name", "홍길동");
        return "list.html";
    }
}
