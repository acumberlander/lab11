package com.pivottech.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class GreetingController {

    @GetMapping("/hello")
    public String greeting(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    //Capitalize routing
    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable(name = "text") String text, Model model) {
        model.addAttribute("text", text.toUpperCase());
        return "capitalize";
    }

    //Splash routing
    @GetMapping("/")
    public String splash() {
        return "splash";
    }

    // Album routing
    @GetMapping("/albums")
    public String albums(Model model) {
        ArrayList<Album> albumList = new ArrayList<>();
        Album album1 = new Album("Damn.", "Kendrick Lamar", 12, 3600, "https://images-na.ssl-images-amazon.com/images/I/A1AMeOSldQL._SL1500_.jpg");
        Album album2 = new Album("Chasing Summer", "Sir", 13, 3700, "https://m.media-amazon.com/images/I/814+RZcGxZL._SS500_.jpg");
        Album album3 = new Album("title", "artist", 14, 3800, "https://img.wynk.in/unsafe/275x275/filters:no_upscale():format(webp)/http://s3-ap-south-1.amazonaws.com/wynk-music-cms/srch_hungama/music/859718345268/1605347422/srch_hungama_56875331.jpg");
        Album album4 = new Album("title", "artist", 14, 3800, "https://img.wynk.in/unsafe/275x275/filters:no_upscale():format(webp)/http://s3-ap-south-1.amazonaws.com/wynk-music-cms/srch_hungama/music/859718345268/1605347422/srch_hungama_56875331.jpg");
        Album album5 = new Album("title", "artist", 14, 3800, "https://img.wynk.in/unsafe/275x275/filters:no_upscale():format(webp)/http://s3-ap-south-1.amazonaws.com/wynk-music-cms/srch_hungama/music/859718345268/1605347422/srch_hungama_56875331.jpg");

        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        albumList.add(album4);
        albumList.add(album5);

        model.addAttribute("albumList", albumList);
        return "albums";
    }

}