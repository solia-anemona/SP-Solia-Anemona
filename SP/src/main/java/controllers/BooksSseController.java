package controllers;

import observer.AllBooksSubject;
import observer.SseObserver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public SseEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L); // 0L previne timeout-ul rapid
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }
}