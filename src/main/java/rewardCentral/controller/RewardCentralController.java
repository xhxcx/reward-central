package rewardCentral.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rewardCentral.service.RewardCentralService;

import java.util.UUID;

@RestController
public class RewardCentralController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RewardCentralController.class);

    @Autowired
    private RewardCentralService rewardCentralService;

    @GetMapping("/getRewardPoints")
    public ResponseEntity<Integer> getAttractionRewardPoints(@RequestParam String attractionId, @RequestParam String userId){
        LOGGER.info("GET /getRewardPoints " + "attractionId = " + attractionId + ", userId = " + userId);
        return new ResponseEntity<>(rewardCentralService.getAttractionRewardPoints(UUID.fromString(attractionId), UUID.fromString(userId)), HttpStatus.OK);
    }
}
