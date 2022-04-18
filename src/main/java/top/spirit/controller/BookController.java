package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.spirit.pojo.Books;
import top.spirit.service.BookService;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
}
