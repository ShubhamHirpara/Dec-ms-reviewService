package co.pragra.learning.msreviews.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewAPI {

    @GetMapping("/getDesc")
    public String getReviewDesc(){
        return "not bad - 3 star";
    }
}
