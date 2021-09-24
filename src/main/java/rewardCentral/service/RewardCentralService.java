package rewardCentral.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface RewardCentralService {
    int getAttractionRewardPoints(UUID attractionId, UUID userId);
}
