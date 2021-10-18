package rewardCentral.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface RewardCentralService {
    /**
     * Get the value of the reward points allowed for the given attraction and the specific user
     * @param attractionId
     * @param userId
     * @return int value of the reward
     */
    int getAttractionRewardPoints(UUID attractionId, UUID userId);
}
