package es.urjc.cloudapps.library.presentation.web;

import es.urjc.cloudapps.library.application.BookService;
import es.urjc.cloudapps.library.application.dtos.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = {"/books", "/"})
    public String getAllIndexBooks(Model model) {
        List<BookDto> books = this.bookService.getAllBooks();
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/books/add")
    public String addNewBook() {
        return "new_book";
    }
}
