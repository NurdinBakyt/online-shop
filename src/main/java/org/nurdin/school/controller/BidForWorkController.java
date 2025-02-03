package org.nurdin.school.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.nurdin.school.entity.BidForWorkEntity;
import org.nurdin.school.enums.StatusOfBid;
import org.nurdin.school.service.BidForWorkServise;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/bidForWork")
public class BidForWorkController {
    private final BidForWorkServise bidForWorkServise;

    public BidForWorkController(BidForWorkServise bidForWorkServise) {
        this.bidForWorkServise = bidForWorkServise;
    }

    @PostMapping(value = "/acceptBid/")
    @Operation(summary = "Принятие заявок")
    public ResponseEntity<String> acceptTheBid (@RequestParam String email) {
        //в общем какая у меня была ошибка я в параметре не указал анотацию @RequestParam которая говорит что
        //мы в параметр принимаем Json-ку а до этого мы просто принимали пустоту без этой анотации
        //насчет анотации @RequestParam изучить и еще анотацию @PathVariable

       BidForWorkEntity bidForWorkEntity = bidForWorkServise.getBidForWorkByUserEmail(email);
       bidForWorkEntity.setBidStatus(StatusOfBid.ACCEPTED);
       bidForWorkServise.saveBidForWork(bidForWorkEntity);
       return ResponseEntity.ok("Статус пользователя изменен на ACCEPTED");

    }
    @PostMapping(value = "/rejectTheBid")
    @Operation(summary = "Откланение заявки")
    public ResponseEntity<String> rejectTheBid (@RequestParam String email ) {
        BidForWorkEntity bidForWorkEntity = bidForWorkServise.getBidForWorkByUserEmail(email);
        bidForWorkEntity.setBidStatus(StatusOfBid.REJECTED);
        bidForWorkServise.saveBidForWork(bidForWorkEntity);
        return ResponseEntity.ok("Статус пользователя изменен на REJECTED");
    }

    @GetMapping(value = "/getAllBids")
    @Operation(summary = "Почему-то Давид два раза прописал этот метод, хотя он уже есть, он говорит что он тоже нужен так что 'OK' ")
    public List<BidForWorkEntity> getAllBidForWork() {
        return bidForWorkServise.getAllBidForWork();
    }
}
