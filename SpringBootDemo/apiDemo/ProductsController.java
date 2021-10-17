package com.javacourse.SpringBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping("/") /* yani bizim uygulama sonucumuzu anasayfası
    ana istek noktasında get i çalışacak demek,
    yani biz hiçbir şey yapmazsak bile sadece uygulamayı çalıştırdığımda
    bunun gelmesini bekliyorum */
    public  String get(){
        return  "Book";
    }
    @GetMapping("/otherPage")
    public  String get2(){
        return  "Pencil";
    }
}
